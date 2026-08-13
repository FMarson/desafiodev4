//Global
final Double PI = 3.14159265359; // constante, não posso modificar

Double calcularAreaRetangulo(Double b, Double a){
    return b * a;
}

Double calcularPerimetroRetangulo(Double b, Double a){
    return 2 * b + 2 * a;
}

Double calcularAreaCirculo(Double r){
    return PI * (r * r); // == PI * r²
}

Double calcularPerimetroCirculo(Double r){
    return 2 * PI * r;
}

Double calcularDiametro(Double raio) {
    return 2 * raio;
}

void menuCirculo(){
    Integer opcao;
    Double raio = 1.0, area, perimetro, diametro;

    do {
        IO.println("\nMENU CÍRCULO");
        IO.println("O valor atual do raio é " + raio + " m.");
        IO.println("1) Informar raio");
        IO.println("2) Calcular área do círculo");
        IO.println("3) Calcular perímetro do círculo");
        IO.println("4) Calcular o diâmetro do círculo");
        IO.println("5) Retornar ao menu principal");
        opcao = Integer.parseInt(IO.readln("Escolha uma opção: "));

        switch (opcao) {
            case 1 -> {
                raio = Double.parseDouble(IO.readln("Informe o raio: "));
            }
            case 2 -> {
                area = calcularAreaCirculo(raio);
                IO.println("A área do círculo é " + area + " m².");
            }
            case 3 -> {
                perimetro = calcularPerimetroCirculo(raio);
                IO.println("O perímetro do círculo é " + perimetro + " m.");
            }
            case 4 -> {
                diametro = calcularDiametro(raio);
                IO.println("O diâmetro do círculo é " + diametro + " m.");
            }

            case 5 -> { //sair do menu
            }

            default -> {
                IO.println("As opções válidas são 1, 2, 3, 4 ou 5. Informe novamente!");
            }

        }
    }
    while(opcao != 5);
}

void menuRetangulo(){
    Integer opcao;
    Double base = 1.0, altura = 1.0, area, perimetro;

    do {
        IO.println("\nMENU RETÂNGULO");
        IO.println("O valor atual da base é " + base + " m e o valor da altura é " + altura + " m.");
        IO.println("1) Informar base e altura");
        IO.println("2) Calcular área do retângulo");
        IO.println("3) Calcular perímetro do retângulo");
        IO.println("4) Retornar ao menu principal");
        opcao = Integer.parseInt(IO.readln("Escolha uma opção: "));

        switch (opcao) {
            case 1 -> {
                base = Double.parseDouble(IO.readln("Informe a base: "));
                altura = Double.parseDouble(IO.readln("Informe a altura: "));
            }
            case 2 -> {
                area = calcularAreaRetangulo(base, altura);
                IO.println("A área do retângulo é " + area + " m².");
            }
            case 3 -> {
                perimetro = calcularPerimetroRetangulo(base, altura);
                IO.println("O perímetro do retângulo é " + perimetro + " m.");
            }
            case 4 -> {//sair do menu
            }

            default -> {
                IO.println("As opções válidas são 1, 2, 3 ou 4. Informe novamente!");
            }

        }
    }
    while(opcao != 4);
}

void menuPrincipal(){
    Integer opcao;

    do{
        IO.println("\nMENU PRINCIPAL");
        IO.println("1) Trabalhar com círculo");
        IO.println("2) Trabalhar com retângulo");
        IO.println("3) Sair do programa\n");
        opcao = Integer.parseInt(IO.readln("Escolha uma opção: "));

        switch (opcao){
            case 1 -> {
                menuCirculo();
            }

            case 2 -> {
                menuRetangulo();
            }

            case 3 -> {//sair do menu
            }

            default -> {
                IO.println("As opções válidas são 1, 2 ou 3. Informe novamente!");
            }
        }
    }
    while(opcao != 3);
}

void main() {
    menuPrincipal();
}