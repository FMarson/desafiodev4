public enum TipoConta{
    POUPANCA("Poupança"),
    CONTA_CORRENTE("Conta Corrente"); //, CONTA_CORRENTE_CONJUNTA, CONTA_CORRENTE_EMPRESARIAL Quaisquer outros tipos

    private final String nome;

    TipoConta(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {

        return nome;
        }

    public String getNome() {

        return nome;

    }
}