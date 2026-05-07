void main() {
    String nome, sobrenome, nomeCompleto; // texto
    Integer idade; //número inteiro
    Double altura; //número decimal

    /*
    nome = "Fernando Marson";
    idade = 51;
    altura = 1.88;


    IO.println("Teste de texto!\nEscrever outra coisa");
    IO.println(nome);
    IO.println(idade);
     */

    //nome = IO.readln("Informe o seu nome: "); // Aqui faz a leitura do nome e armazena na variável nome
    //IO.println("O seu nome é " + nome);

    //nome = "Fernando";
    //sobrenome = "Marson";
    //nomeCompleto = nome + " " + sobrenome;

    /*
    nomeCompleto = IO.readln("Informe o seu nome: "); // não precisa converter
    idade = Integer.parseInt(IO.readln("Informe a sua idade: ")); // precisa converter para Integer
    altura = Double.parseDouble(IO.readln("Informe a sua altura: ")); // precisa converter para Double

    IO.println("O seu nome é " + nomeCompleto);
    IO.println("A sua idade é " + idade + " anos.");
    IO.println("A sua altura é " + altura + " m.");

    IO.println("Olá " + nomeCompleto + ". Que bom te conhecer! Você tem " + idade
             + " anos e a sua altura é " + altura + "m.");
    */
    Double n1, n2, soma, subtracao, multiplicacao, divisao;

    n1 = 10.0;
    n2 = 20.0;
    soma = n1 + n2;
    subtracao = n1 - n2;
    multiplicacao = n1 * n2;
    divisao = n1 / n2;

    IO.println("O valor da soma de " + n1 + " e " + n2 + " é " + soma);
    IO.println("O valor da multiplicação de " + n1 + " por " + n2 + " é " + multiplicacao);
    IO.println("O valor da subtração de " + n1 + " e " + n2 + " é " + subtracao);
    IO.println("O valor da divisão de " + n1 + " por " + n2 + " é " + divisao);
}