void main() {
    //Exercício 1
    //Gerar e escrever todos os números inteiros do intervalo [0,100].
    IO.println("\nExercício 1");
    for(Integer n = 0; n <= 100; n++) {
        IO.print(n + " ");
    }


    //Gerar e escrever os números pares do intervalo [20,50].
    IO.println("\n\nExercício 2");
    int nPares = 20; //1 - inicialização
    while(nPares <= 50){ //2 - condição de parada
        if(nPares % 2 == 0){ //testa se é par
            IO.print(nPares + " ");
        }
        // Soma o valor de nPares com 1 ou nPares += 1;
        nPares++; //3 - incremento
    }
    //ou a segunda forma com o for
    /*
    for(Integer n = 20; n <= 50; n++) {
        if(nPares % 2 == 0){
            IO.print(nPares + " ");
        }
     */

    //Gerar e escrever os números inteiros do intervalo [25,70] em ordem decrescente.
    IO.println("\n\nExercício 3");
    for(int num = 70; num >= 25; num -= 1){
        IO.print(num + " ");
    }

    //Gerar e escrever os números ímpares do intervalo [25,95] em ordem decrescente.
    IO.println("\n\nExercício 4");
    for(int num = 95; num >= 25; num -= 1){
        if(num % 2 == 1 ) { //testa se é ímpar
            IO.print(num + " ");
        }
    }

    //Ler 15 números e escrever a soma e a média dos números lidos.
    IO.println("\n\nExercício 5");
    Double soma = 0.0, media, numero;

    // for(int c = 1; c <= 15; c++) ou
    /*
    for(int c = 0; c < 15; c++) {
        numero = Double.parseDouble(IO.readln("Informe um número: "));
        soma = soma + numero;
        soma += numero;
    }
    media = soma / 15;
    IO.println("O valor da soma é " + soma);
    IO.println("A média é " + media);
*/
    //Ler 10 números inteiros e escrever a quantidade de números pares e a quantidade de números ímpares lidos.
    IO.println("\n\nExercício 6");
    int qtdPares = 0, num, qtdNumerosLidos = 2;
    /*
    for(Integer n = 0; n < qtdNumerosLidos; n += 1){
         num = Integer.parseInt(IO.readln("Informe um número: "));
         if(num % 2 == 0) { // testa se é par
             qtdPares++;
         }
    }
    IO.println("A quantidade de números pares lidos foi " + qtdPares);
    IO.println("A quantidade de números ímpares lidos foi " + (qtdNumerosLidos - qtdPares));
    */
    //Ler 20 números inteiros e imprimi-los acompanhados da mensagem “POSITIVO”, “NEGATIVO”, ou “NULO”,
    // conforme o caso. No final, imprimir a quantidade de números positivos e negativos lidos.
    IO.println("\n\nExercício 7");
    qtdNumerosLidos = 0;
    for(int n = 0; n < qtdNumerosLidos; n++){
        num = Integer.parseInt(IO.readln("Informe um número: "));
        if(num == 0){
            IO.println(num + " é nulo.");
        }
        else if (num > 0) {
            IO.println(num + " é positivo.");
        }
        else{
            IO.println(num + " é negativo.");
        }
    }

    //Ler n números e imprimir no final a soma dos números lidos
    // (obs.: n é a quantidade de números que deverão ser lidos e também deve ser lido do teclado).
    IO.println("\n\nExercício 8");
    Integer somatorio = 0;
    qtdNumerosLidos = Integer.parseInt(IO.readln("Informe a quantidade de números: "));

    for(int n = 0; n < qtdNumerosLidos; n++){
        num = Integer.parseInt(IO.readln("Informe um número: "));
        somatorio += num;
    }
    IO.println("O somatório dos números lidos é " + somatorio);
}
/*








*/