import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Arquivo {

    public static void escrever(String nomeArquivo, String texto) {
        try {
            Files.writeString(
                    Path.of(nomeArquivo),
                    texto
            );
        } catch (IOException e) {
            throw new RuntimeException(
                    "Erro ao escrever no arquivo: " + nomeArquivo,
                    e
            );
        }
    }

    public static String ler(String nomeArquivo) {
        try {
            return Files.readString(
                    Path.of(nomeArquivo)
            );
        } catch (IOException e) {
            throw new RuntimeException(
                    "Erro ao ler o arquivo: " + nomeArquivo,
                    e
            );
        }
    }

    public static void adicionar(String nomeArquivo, String texto) {
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
}
