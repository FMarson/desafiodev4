import java.util.ArrayList;
import java.util.List;

public class Album {

    private String titulo;
    private final List<String> artistas;
    private Integer ano;
    private final List<Faixa> faixas;

    public Album(
            String titulo,
            List<String> artistas,
            Integer ano
    ) {
        validarTitulo(titulo);
        validarArtistas(artistas);
        validarAno(ano);

        this.titulo = titulo.trim();
        this.artistas = copiarNomes(artistas);
        this.ano = ano;
        this.faixas = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public List<String> getArtistas() {
        return List.copyOf(artistas);
    }

    public Integer getAno() {
        return ano;
    }

    public List<Faixa> getFaixas() {
        return List.copyOf(faixas);
    }

    public void adicionarArtista(String artista) {
        validarArtista(artista);
        artistas.add(artista.trim());
    }

    public void removerArtista(String artista) {
        validarArtista(artista);

        artistas.remove(artista.trim());

        if (artistas.isEmpty()) {
            throw new IllegalStateException(
                    "O álbum deve ter pelo menos um artista."
            );
        }
    }

    public void adicionarFaixa(Faixa faixa) {
        if (faixa == null) {
            throw new IllegalArgumentException(
                    "A faixa não pode ser nula."
            );
        }

        for (Faixa faixaExistente : faixas) {
            if (faixaExistente.getNumero()
                    .equals(faixa.getNumero())) {

                throw new IllegalArgumentException(
                        "Já existe uma faixa com esse número."
                );
            }
        }

        faixas.add(faixa);
    }

    public void removerFaixa(Integer numero) {
        if (numero == null || numero < 1) {
            throw new IllegalArgumentException(
                    "O número da faixa é inválido."
            );
        }

        boolean removida = faixas.removeIf(
                faixa -> faixa.getNumero().equals(numero)
        );

        if (!removida) {
            throw new IllegalArgumentException(
                    "Nenhuma faixa encontrada com o número "
                            + numero
                            + "."
            );
        }
    }

    public Integer getQuantidadeDeFaixas() {
        return faixas.size();
    }

    public long getDuracaoTotalEmSegundos() {
        long total = 0;

        for (Faixa faixa : faixas) {
            total += faixa.getDuracao().toSeconds();
        }

        return total;
    }

    public void listarFaixas() {
        IO.println(toStringDetalhado());
    }

    @Override
    public String toString() {
        StringBuilder texto = new StringBuilder();

        texto.append("ALBUM;");
        texto.append(titulo);
        texto.append(";");
        texto.append(ano);
        texto.append(";");
        texto.append(formatarLista(artistas, ","));

        for (Faixa faixa : faixas) {
            texto.append(System.lineSeparator());
            texto.append(faixa);
        }

        return texto.toString();
    }

    public String toStringDetalhado() {
        StringBuilder texto = new StringBuilder();

        texto.append("Título: ");
        texto.append(titulo);
        texto.append(System.lineSeparator());

        texto.append("Artistas: ");
        texto.append(formatarLista(artistas, ", "));
        texto.append(System.lineSeparator());

        texto.append("Ano: ");
        texto.append(ano);
        texto.append(System.lineSeparator());

        texto.append("Quantidade de faixas: ");
        texto.append(faixas.size());
        texto.append(System.lineSeparator());

        texto.append("Duração total: ");
        texto.append(formatarDuracao(
                getDuracaoTotalEmSegundos()
        ));
        texto.append(System.lineSeparator());

        texto.append("Faixas:");
        texto.append(System.lineSeparator());

        if (faixas.isEmpty()) {
            texto.append("Nenhuma faixa cadastrada.");
        } else {
            for (Faixa faixa : faixas) {
                texto.append(faixa.toStringDetalhado());
                texto.append(System.lineSeparator());
            }
        }

        return texto.toString();
    }

    public static Album fromString(List<String> linhas) {
        if (linhas == null || linhas.isEmpty()) {
            throw new IllegalArgumentException(
                    "Não há dados para carregar o álbum."
            );
        }

        String[] partes = linhas.get(0).split(";", -1);

        if (partes.length != 4
                || !partes[0].equals("ALBUM")) {
            throw new IllegalArgumentException(
                    "Formato de álbum inválido."
            );
        }

        String titulo = partes[1];
        Integer ano = Integer.valueOf(partes[2]);

        List<String> artistas =
                converterLista(partes[3], ",");

        Album album = new Album(
                titulo,
                artistas,
                ano
        );

        for (int indice = 1; indice < linhas.size(); indice++) {
            Faixa faixa = Faixa.fromString(
                    linhas.get(indice)
            );

            album.adicionarFaixa(faixa);
        }

        return album;
    }

    private static List<String> converterLista(
            String texto,
            String separador
    ) {
        List<String> nomes = new ArrayList<>();

        String[] partes = texto.split(separador);

        for (String parte : partes) {
            String nome = parte.trim();

            if (!nome.isBlank()) {
                nomes.add(nome);
            }
        }

        return nomes;
    }

    private static String formatarLista(
            List<String> nomes,
            String separador
    ) {
        StringBuilder texto = new StringBuilder();

        for (int indice = 0; indice < nomes.size(); indice++) {
            if (indice > 0) {
                texto.append(separador);
            }

            texto.append(nomes.get(indice));
        }

        return texto.toString();
    }

    private static String formatarDuracao(
            long segundosTotais
    ) {
        long minutos = segundosTotais / 60;
        long segundos = segundosTotais % 60;

        return String.format(
                "%02d:%02d",
                minutos,
                segundos
        );
    }

    private static List<String> copiarNomes(
            List<String> nomes
    ) {
        List<String> copia = new ArrayList<>();

        for (String nome : nomes) {
            copia.add(nome.trim());
        }

        return copia;
    }

    private void validarTitulo(String titulo) {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException(
                    "O título do álbum não pode ser vazio."
            );
        }
    }

    private void validarArtistas(List<String> artistas) {
        if (artistas == null || artistas.isEmpty()) {
            throw new IllegalArgumentException(
                    "O álbum deve ter pelo menos um artista."
            );
        }

        for (String artista : artistas) {
            validarArtista(artista);
        }
    }

    private void validarArtista(String artista) {
        if (artista == null || artista.isBlank()) {
            throw new IllegalArgumentException(
                    "O nome do artista não pode ser vazio."
            );
        }
    }

    private void validarAno(Integer ano) {
        if (ano == null || ano < 0) {
            throw new IllegalArgumentException(
                    "O ano do álbum é inválido."
            );
        }
    }
}