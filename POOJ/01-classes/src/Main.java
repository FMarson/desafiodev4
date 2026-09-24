void main() {
    /*
    String nome, profissao;
    Integer idade;

    Pessoa pessoa1, pessoa2, pessoa3;

    pessoa1 = new Pessoa("Fernando");
    pessoa2 = new Pessoa("Maria", 20);

    pessoa1.apresentar();
    pessoa1.trabalhar();
    pessoa1.definirProfissao("professor");
    pessoa1.trabalhar();
    pessoa1.verificarMaioridade();

    pessoa2.apresentar();
    pessoa2.definirProfissao("advogada");
    pessoa2.trabalhar();
    pessoa2.verificarMaioridade();

    nome = IO.readln("Informe o seu nome: ");
    idade = Integer.parseInt(IO.readln("Informe a sua idade: "));
    profissao = IO.readln("Informe a sua profissão: ");

    pessoa3 = new Pessoa(nome, idade);
    pessoa3.definirProfissao(profissao);

    pessoa3.apresentar();
    pessoa3.trabalhar();
    pessoa3.verificarMaioridade();
*/
    Computador c1;

    c1 = new Computador();

    c1.verificarLigado();
    c1.ligarDesligar();
    c1.verificarLigado();

    //c1.carregarBateria();
    c1.conectarTomada(true);

    c1.ligarDesligar();
    c1.verificarLigado();
    c1.ligarDesligar();
    c1.verificarLigado();
}