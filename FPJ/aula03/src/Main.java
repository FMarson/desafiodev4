void main() {
    /* Variáveis
    Boolean - Lógico - false ou true
    Integer - números inteiros - 10
    Double - números decimais (com .) - 3.14
    String - textos - "Fernando Marson" "Av. do Forte, 42"
    Character - caractere - 'A', '1', '*'
     */

    Integer idade, numeroInteiro;
    Double altura, numeroDecimal;
    String nome;

    /*  Entrada e Saída
    Entrada:

            Retorna uma String IO.readln("Mensagem na tela");

            Converter a String para outros dados:
            Integer.parseInt(....)
            Double.parseDouble(...)
            Boolean.parseBoolean()

     */
    /*
    nome = IO.readln("Informe o seu nome: ");
    idade = Integer.parseInt(IO.readln("Informe a sua idade: ")); // "16" -> 16
    altura = Double.parseDouble(IO.readln("Informe a sua altura: ")); //"1.88" -> 1.88
    numeroInteiro = 10;
    numeroDecimal =  10.17;
    */
    /* Operadores aritméticos
    adição +
    subtração -
    multiplicação *
    divisão / (Integer ou Double)
    resto da divisão %
     */

    //IO.println("10/5: " + (10 / 5));
    //IO.println("11/5: " + (11 / 5));
    //IO.println("11%5: " + (11 % 5)); // 11 - 10 = 1

    Integer n1, n2;

    //n1 = Integer.parseInt(IO.readln("Informe o primeiro número: "));
   // n2 = Integer.parseInt(IO.readln("Informe o segundo número: "));

//    IO.println("Resultado da divisão: " + (n1 / n2));
//    IO.println("Resto da divisão: " + (n1 % n2));
//
    Double d1, d2;

    d1 = Double.parseDouble(IO.readln("Informe o primeiro número: "));
    d2 = Double.parseDouble(IO.readln("Informe o segundo número: "));

    IO.println("Resultado da divisão: " + (d1 / d2));
    IO.println("Resto da divisão: " + (d1 % d2));

    Integer inteiro = 10;
    Double decimal = 10.45;

    //Converter de Integer para Double
    decimal = inteiro.doubleValue();

    //Converter de Double para Integer
    inteiro = decimal.intValue();

    
}