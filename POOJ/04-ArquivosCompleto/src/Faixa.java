import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Faixa {

    private String titulo;
    private Integer numero;
    private Duration duracao;
    private GeneroMusical genero;
    private final List<String> artistas;
    private final List<String> compositores;

    public Faixa(
            String titulo,
            Integer numero,
            Duration duracao,
            GeneroMusical genero,
            List<String> artistas,
            List<String> compositores
    ) {
        validarTitulo(titulo);
        validarNumero(numero);
        validarDuracao(duracao);
        validarGenero(genero);
        validarNomes("artista", artistas);
        validarNomes("compositor", compositores);

        this.titulo = titulo.trim();
        this.numero = numero;
        this.duracao = duracao;
        this.genero = genero;
        this.artistas = copiarNomes(artistas);
        this.compositores = copiarNomes(compositores);
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getNumero() {
        return numero;
    }

    public Duration getDuracao() {
        return duracao;
    }

    public GeneroMusical getGenero() {
        return genero;
    }

    public List<String> getArtistas() {
        return List.copyOf(artistas);
    }

    public List<String> getCompositores() {
        return List.copyOf(compositores);
    }

    public void adicionarArtista(String artista) {
        validarNome("artista", artista);
        artistas.add(artista.trim());
    }

    public void removerArtista(String artista) {
        if (artista == null || artista.isBlank()) {
            throw new IllegalArgumentException(
                    "O nome do artista não pode ser vazio."
            );
        }

        artistas.remove(artista.trim());

        if (artistas.isEmpty()) {
            throw new IllegalStateException(
                    "A faixa deve ter pelo menos um artista."
            );
        }
    }

    public void adicionarCompositor(String compositor) {
        validarNome("compositor", compositor);
        compositores.add(compositor.trim());
    }

    public void removerCompositor(String compositor) {
        if (compositor == null || compositor.isBlank()) {
            throw new IllegalArgumentException(
                    "O nome do compositor não pode ser vazio."
            );
        }

        compositores.remove(compositor.trim());

        if (compositores.isEmpty()) {
            throw new IllegalStateException(
                    "A faixa deve ter pelo menos um compositor."
            );
        }
    }

    public String getDuracaoFormatada() {
        long minutos = duracao.toMinutes();
        long segundos = duracao.toSecondsPart();

        return String.format(
                "%02d:%02d",
                minutos,
                segundos
        );
    }

    @Override
    public String toString() {
        StringBuilder texto = new StringBuilder();

        texto.append("FAIXA;");
        texto.append(numero);
        texto.append(";");
        texto.append(titulo);
        texto.append(";");
        texto.append(duracao.toSeconds());
        texto.append(";");
        texto.append(genero.name());
        texto.append(";");
        texto.append(formatarLista(artistas, ","));
        texto.append(";");
        texto.append(formatarLista(compositores, ","));

        return texto.toString();
    }

    public String toStringDetalhado() {
        StringBuilder texto = new StringBuilder();

        texto.append(String.format("%02d", numero));
        texto.append(". ");
        texto.append(titulo);
        texto.append(" (");
        texto.append(getDuracaoFormatada());
        texto.append(") - ");
        texto.append(genero.getNome());
        texto.append(" | Artistas: ");
        texto.append(formatarLista(artistas, ", "));
        texto.append(" | Compositores: ");
        texto.append(formatarLista(compositores, ", "));

        return texto.toString();
    }

    public static Faixa fromString(String texto) {
        if (texto == null || texto.isBlank()) {
            throw new IllegalArgumentException(
                    "O texto da faixa não pode ser vazio."
            );
        }

        String[] partes = texto.split(";", -1);

        if (partes.length != 7
                || !partes[0].equals("FAIXA")) {
            throw new IllegalArgumentException(
                    "Formato de faixa inválido: " + texto
            );
        }

        Integer numero = Integer.valueOf(partes[1]);
        String titulo = partes[2];

        long duracaoEmSegundos = Long.parseLong(partes[3]);

        GeneroMusical genero =
                GeneroMusical.valueOf(partes[4]);

        List<String> artistas =
                converterLista(partes[5], ",");

        List<String> compositores =
                converterLista(partes[6], ",");

        return new Faixa(
                titulo,
                numero,
                Duration.ofSeconds(duracaoEmSegundos),
                genero,
                artistas,
                compositores
        );
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
                    "O título da faixa não pode ser vazio."
            );
        }
    }

    private void validarNumero(Integer numero) {
        if (numero == null || numero < 1) {
            throw new IllegalArgumentException(
                    "O número da faixa deve ser positivo."
            );
        }
    }

    private void validarDuracao(Duration duracao) {
        if (duracao == null || duracao.isZero()
                || duracao.isNegative()) {
            throw new IllegalArgumentException(
                    "A duração deve ser positiva."
            );
        }
    }

    private void validarGenero(GeneroMusical genero) {
        if (genero == null) {
            throw new IllegalArgumentException(
                    "O gênero musical não pode ser nulo."
            );
        }
    }

    private void validarNomes(
            String tipo,
            List<String> nomes
    ) {
        if (nomes == null || nomes.isEmpty()) {
            throw new IllegalArgumentException(
                    "A faixa deve ter pelo menos um "
                            + tipo
                            + "."
            );
        }

        for (String nome : nomes) {
            validarNome(tipo, nome);
        }
    }

    private void validarNome(String tipo, String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException(
                    "O nome do "
                            + tipo
                            + " não pode ser vazio."
            );
        }
    }
}