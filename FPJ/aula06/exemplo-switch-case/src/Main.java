void main() {
    //switch/case
    String estacao;

    estacao = IO.readln("Informe a estação: ");
    /*
    if (estacao.compareToIgnoreCase("primavera") == 0) {
        IO.println("É a estação das flores!");
    }
    else if (estacao.compareToIgnoreCase("verão") == 0) {
        IO.println("É hora de pegar uma praia!");
    }
    else if (estacao.compareToIgnoreCase("outono") == 0) {
        IO.println("Nunca se sabe o que vai acontecer!");
    }
    else if (estacao.compareToIgnoreCase("inverno") == 0) {
        IO.println("Estação do chocolate quente!");
    }
    else{
        IO.println(estacao + " não é uma estação do ano!");
    }
*/
    /* Versão antiga // String, char, int, short, byte
    switch (estacao.toLowerCase()){
        case "primavera":
            IO.println("É a estação das flores!");
            break;

        case "verão":
            IO.println("É hora de pegar uma praia!");
            break;

        case "outono":
            IO.println("Nunca se sabe o que vai acontecer!");
            break;

        case "inverno":
            IO.println("Estação do chocolate quente!");
            break;

        default:
            IO.println(estacao + " não é uma estação do ano!");
    }
    */

    // versão nova do switch
    switch (estacao.toLowerCase()){
        case "primavera" -> {
            IO.println("É a estação das flores!");
        }

        case "verão" -> {
            IO.println("É hora de pegar uma praia!");
        }

        case "outono" -> {
            IO.println("Nunca se sabe o que vai acontecer!");
        }

        case "inverno" -> {
            IO.println("Estação do chocolate quente!");
        }

        default -> {
            IO.println(estacao + " não é uma estação do ano!");
        }
    }

    //IO.println("Todas as letras em minúsculo: " + estacao.toLowerCase());
    //IO.println("Todas as letras em MAIÚSCULO: " + estacao.toUpperCase());
    //IO.println("Primeira letra da estação: " + estacao.charAt(estacao.length()-1));

    //switch ()
}