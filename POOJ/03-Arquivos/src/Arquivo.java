import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Arquivo {

    private final String nomeArquivo;

    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public String lerTodo() {
        try {
            return Files.readString(Path.of(nomeArquivo));
        } catch (IOException e) {
            throw new RuntimeException(
                    "Erro ao ler o arquivo: " + nomeArquivo,
                    e
            );
        }
    }

    public void escrever(String texto) {
        try {
            Files.writeString(Path.of(nomeArquivo), texto);
        } catch (IOException e) {
            throw new RuntimeException(
                    "Erro ao escrever no arquivo: " + nomeArquivo,
                    e
            );
        }
    }

    public void escreverln(String texto) {
        escrever(texto + System.lineSeparator());
    }

    public void adicionar(String texto) {
        try {
            Files.writeString(
                    Path.of(nomeArquivo),
                    texto,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            throw new RuntimeException(
                    "Erro ao adicionar ao arquivo: " + nomeArquivo,
                    e
            );
        }
    }

    public void adicionarln(String texto) {
        adicionar(texto + System.lineSeparator());
    }

    public List<String> lerLinhas() {
        try {
            return Files.readAllLines(Path.of(nomeArquivo));
        } catch (IOException e) {
            throw new RuntimeException(
                    "Erro ao ler as linhas do arquivo: " + nomeArquivo,
                    e
            );
        }
    }

    public void limpar() {
        try {
            Files.writeString(
                    Path.of(nomeArquivo),
                    "",
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING
            );
        } catch (IOException e) {
            throw new RuntimeException(
                    "Erro ao limpar o arquivo: " + nomeArquivo,
                    e
            );
        }
    }

    public int contarLinhas() {
        return lerLinhas().size();
    }
}
