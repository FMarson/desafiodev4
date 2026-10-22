import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Arquivo {

    private final Path caminho;

    public Arquivo(String nomeArquivo) {
        if (nomeArquivo == null || nomeArquivo.isBlank()) {
            throw new IllegalArgumentException(
                    "O nome do arquivo não pode ser vazio."
            );
        }

        caminho = Path.of(nomeArquivo);

        try {
            Path diretorio = caminho.toAbsolutePath().getParent();

            if (diretorio != null) {
                Files.createDirectories(diretorio);
            }

            Files.createFile(caminho);
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // O arquivo já existe.
        } catch (IOException e) {
            throw new RuntimeException(
                    "Erro ao criar o arquivo: " + caminho,
                    e
            );
        }
    }

    public String lerTodo() {
        try {
            return Files.readString(caminho);
        } catch (IOException e) {
            throw new RuntimeException(
                    "Erro ao ler o arquivo: " + caminho,
                    e
            );
        }
    }

    public void adicionar(String texto) {
        try {
            Files.writeString(
                    caminho,
                    texto,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            throw new RuntimeException(
                    "Erro ao adicionar ao arquivo: " + caminho,
                    e
            );
        }
    }

    public void adicionarln(String texto) {
        adicionar(texto + System.lineSeparator());
    }

    public List<String> lerLinhas() {
        try {
            return Files.readAllLines(caminho);
        } catch (IOException e) {
            throw new RuntimeException(
                    "Erro ao ler as linhas do arquivo: " + caminho,
                    e
            );
        }
    }

    public void limpar() {
        try {
            Files.writeString(
                    caminho,
                    "",
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING
            );
        } catch (IOException e) {
            throw new RuntimeException(
                    "Erro ao limpar o arquivo: " + caminho,
                    e
            );
        }
    }

    public int contarLinhas() {
        return lerLinhas().size();
    }

    public void salvarComo(String novoNomeArquivo) {
        if (novoNomeArquivo == null
                || novoNomeArquivo.isBlank()) {
            throw new IllegalArgumentException(
                    "O novo nome do arquivo não pode ser vazio."
            );
        }

        try {
            Path novoCaminho = Path.of(novoNomeArquivo);

            Path diretorio = novoCaminho.toAbsolutePath().getParent();

            if (diretorio != null) {
                Files.createDirectories(diretorio);
            }

            Files.copy(
                    caminho,
                    novoCaminho,
                    StandardCopyOption.REPLACE_EXISTING
            );
        } catch (IOException e) {
            throw new RuntimeException(
                    "Erro ao salvar o arquivo como: "
                            + novoNomeArquivo,
                    e
            );
        }
    }

    public void excluir() {
        try {
            Files.deleteIfExists(caminho);
        } catch (IOException e) {
            throw new RuntimeException(
                    "Erro ao excluir o arquivo: " + caminho,
                    e
            );
        }
    }
}