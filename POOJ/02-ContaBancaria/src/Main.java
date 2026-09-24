void main() {
    ContaBancaria c1, c2;

    c1 = new ContaBancaria(100, 12345, "Fernando Marson", "Senha1234!", TipoConta.POUPANCA);
    c2 = new ContaBancaria(100, 12346, "Ana Maria", "1234", TipoConta.CONTA_CORRENTE);

    c1.consultarSaldo("Senha1234!");
    c1.depositar(100.0);
    c1.consultarSaldo("Senha1234!");
    c1.sacar(25.0, "1234");
    c1.consultarSaldo("Senha1234!");
    c1.sacar(25.0, "Senha1234!");
    c1.consultarSaldo("Senha1234!");
    c1.sacar(250.0, "Senha1234!");
    c1.consultarSaldo("Senha1234!");
    c1.bloquear("Senha1234!");
    c1.sacar(10.0,"Senha1234!");
    c1.desbloquear("Senha1234!");
    c1.consultarSaldo("Senha1234!");
}