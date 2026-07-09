void main() {

    Integer opcao;

    do{
        IO.println("\n\nMENU\n");
        IO.println("1) Faz uma coisa");
        IO.println("2) Faz outra coisa");
        IO.println("3) Faz uma coisa diferente");
        IO.println("4) Faz uma coisa nova");
        IO.println("5) Sair do programa\n");

        opcao = Integer.parseInt(IO.readln("Informe uma opção: "));

        switch (opcao){
            case 1 -> {
                IO.println("Estou fazendo uma coisa...\n");
            }

            case 2 -> {
                IO.println("Estou fazendo outra coisa...\n");
            }

            case 3 -> {
                IO.println("Estou fazendo uma coisa diferente...\n");
            }

            case 4 -> {
                IO.println("Estou fazendo coisa nova...\n");
            }

            case 5 -> {
                IO.println("Saindo do programa...");
            }

            default -> {
                IO.println("Essa opção não existe! Tente novamente!\n");
            }
        }
    }while (opcao != 5);
}
