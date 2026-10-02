import java.util.ArrayList;

void main() {
    Data data1;
    //ArrayList<Integer> listaNumeros = new ArrayList<>();

    ArrayList<Cliente> listaClientes = new ArrayList<>();
    ArrayList<ContaBancaria> listaContas = new ArrayList<>();

    listaClientes.add(new Cliente("Fernando Marson", "111.111.111-11", new Data(1,9, 1974), "Rua Brasil, 74"));

    listaContas.add(new ContaBancaria(100, 12345, listaClientes.get(0), "Senha1234!", TipoConta.POUPANCA));
    listaContas.add(new ContaBancaria(100,12346, new Cliente("Ana Maria", "222.222.222-22",
            new Data(20, 4, 2000), "Av. das Rosas, 100"), "1234", TipoConta.CONTA_CORRENTE,
            100.0));

    /*
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
     */
    /*
    conta2.consultarSaldo("1234");
    conta2.sacar(1000.0, "1234");
    conta2.consultarSaldo("1234");
    conta2.depositar(700.0);
    conta2.consultarSaldo("1234");
    conta2.depositar(400.0);
    conta2.consultarSaldo("1234");
    */

    data1 = new Data(29, 2, 2000);

    data1.imprimir();
    data1.imprimirPorExtenso();
    IO.println(data1.ehAnoBissexto());

    listaContas.get(0).consultarSaldo("Senha1234!");
    listaContas.get(0).depositar(100.0);
    listaContas.get(0).consultarSaldo("Senha1234!");
    listaContas.get(0).sacar(25.0, "1234");
    listaContas.get(0).consultarSaldo("Senha1234!");
    listaContas.get(0).sacar(25.0, "Senha1234!");
    listaContas.get(0).consultarSaldo("Senha1234!");
    listaContas.get(0).sacar(250.0, "Senha1234!");
    listaContas.get(0).consultarSaldo("Senha1234!");
    listaContas.get(0).bloquear("Senha1234!");
    listaContas.get(0).sacar(10.0,"Senha1234!");
    listaContas.get(0).desbloquear("Senha1234!");
    listaContas.get(0).consultarSaldo("Senha1234!");

    listaContas.get(1).consultarSaldo("1234");
    listaContas.get(1).sacar(1000.0, "1234");
    listaContas.get(1).consultarSaldo("1234");
    listaContas.get(1).depositar(700.0);
    listaContas.get(1).consultarSaldo("1234");
    listaContas.get(1).depositar(400.0);
    listaContas.get(1).consultarSaldo("1234");
}