public enum GeneroMusical {

    ROCK("Rock"),
    POP("Pop"),
    SAMBA("Samba"),
    JAZZ("Jazz"),
    BLUES("Blues"),
    HIP_HOP("Hip-hop"),
    REGGAE("Reggae"),
    SERTANEJO("Sertanejo"),
    MUSICA_ELETRONICA("Música eletrônica"),
    FORRO("Forró");

    private final String nome;

    GeneroMusical(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}