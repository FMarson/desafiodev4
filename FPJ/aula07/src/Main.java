void main() {
    //Imprimir os números de 1 até 10
    IO.println("Impressão com o for");
    for(Integer num = 1; num < 11; num += 1){
        IO.println(num);
    }

    IO.println("Impressão com o while");
    Integer n = 1;
    while(n <= 10){
        IO.println(n);
        n++;
    }

    IO.println("Impressão com o for each para um conjunto de inteiros");
    Integer[] conjuntoDeNumeros = {5, 8, 10, 3, 22, 15};

    for(Integer numero : conjuntoDeNumeros){
        IO.println(numero);
    }

    IO.println("Impressão com o for each para um conjunto de strings");
    String[] listaPalavras = {"Ana", "Beatriz", "Carlos", "Daniel"};

    for(String palavra : listaPalavras){
        IO.print(palavra + " ");
    }
    IO.println();
    IO.println("Soletrando as palavras:");
    for(String palavra : listaPalavras){
        IO.print("Soletrando a palavra " + palavra + ": ");
        for(Character letra : palavra.toLowerCase().toCharArray()) {
            IO.print(letra + " ");
        }
        IO.println();
    }

}