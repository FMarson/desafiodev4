import java.io.*;

void main() {
    Boolean continuar = true;

    while (continuar) {
        Integer opcaoPrincipal = menuPrincipal();

        switch (opcaoPrincipal) {
            case 1:
                menuComprimento();
                break;
            case 2:
                menuArea();
                break;
            case 3:
                menuVolume();
                break;
            case 4:
                menuVelocidade();
                break;
            case 5:
                menuMassa();
                break;
            case 0:
                continuar = false;
                IO.println("\nPrograma encerrado.");
                break;
            default:
                IO.println("\nOpção inválida.");
        }
    }
}

Integer menuPrincipal() {
    Integer opcao = -1;

    do {
        IO.println("\n==== MENU PRINCIPAL ====");
        IO.println("1 - Comprimento");
        IO.println("2 - Área");
        IO.println("3 - Volume");
        IO.println("4 - Velocidade");
        IO.println("5 - Massa");
        IO.println("0 - Sair");
        IO.print("Escolha uma opção: ");

        opcao = Integer.parseInt(IO.readln());

        if (opcao < 0 || opcao > 5) {
            IO.println("Opção inválida. Tente novamente.");
        }
    } while (opcao < 0 || opcao > 5);

    return opcao;
}

void menuComprimento() {
    Boolean voltar = false;

    do {
        IO.println("\n==== COMPRIMENTO ====");
        IO.println("1 - Milimetro para Centímetro");
        IO.println("2 - Centímetro para Metro");
        IO.println("3 - Metro para Quilometro");
        IO.println("4 - Metro para Polegada");
        IO.println("5 - Metro para Pe");
        IO.println("6 - Quilometro para Metro");
        IO.println("0 - Voltar");
        IO.print("Escolha uma opção: ");

        Integer opcao = Integer.parseInt(IO.readln());

        switch (opcao) {
            case 1 -> converterMilimetroParaCentimetro();
            case 2 -> converterCentimetroParaMetro();
            case 3 -> converterMetroParaQuilometro();
            case 4 -> converterMetroParaPolegada();
            case 5 -> converterMetroParaPe();
            case 6 -> converterQuilometroParaMetro();
            case 0 -> voltar = true;
            default -> IO.println("Opção inválida.");
        }
    } while (!voltar);
}

void menuArea() {
    Boolean voltar = false;

    do {
        IO.println("\n==== AREA ====");
        IO.println("1 - Centímetro Quadrado para Metro Quadrado");
        IO.println("2 - Metro Quadrado para Quilometro Quadrado");
        IO.println("3 - Metro Quadrado para Hectare");
        IO.println("4 - Metro Quadrado para Acre");
        IO.println("0 - Voltar");
        IO.print("Escolha uma opção: ");

        Integer opcao = Integer.parseInt(IO.readln());

        switch (opcao) {
            case 1 -> converterCm2ParaM2();
            case 2 -> converterM2ParaKm2();
            case 3 -> converterM2ParaHectare();
            case 4 -> converterM2ParaAcre();
            case 0 -> voltar = true;
            default -> IO.println("Opção inválida.");
        }
    } while (!voltar);
}

void menuVolume() {
    Boolean voltar = false;

    do {
        IO.println("\n==== VOLUME ====");
        IO.println("1 - Mililitro para Litro");
        IO.println("2 - Litro para Metro Cubico");
        IO.println("3 - Centímetro Cubico para Mililitro");
        IO.println("4 - Metro Cubico para Decímetro Cubico");
        IO.println("0 - Voltar");
        IO.print("Escolha uma opção: ");

        Integer opcao = Integer.parseInt(IO.readln());

        switch (opcao) {
            case 1 -> converterMlParaL();
            case 2 -> converterLParaM3();
            case 3 -> converterCm3ParaMl();
            case 4 -> converterM3ParaDm3();
            case 0 -> voltar = true;
            default -> IO.println("Opção invalida.");
        }
    } while (!voltar);
}

void menuVelocidade() {
    Boolean voltar = false;

    do {
        IO.println("\n==== VELOCIDADE ====");
        IO.println("1 - Metro por Segundo para Quilometro por Hora");
        IO.println("2 - Quilometro por Hora para Metro por Segundo");
        IO.println("3 - Quilometro por Hora para Milha por Hora");
        IO.println("4 - Milha por Hora para Quilometro por Hora");
        IO.println("0 - Voltar");
        IO.print("Escolha uma opção: ");

        Integer opcao = Integer.parseInt(IO.readln());

        switch (opcao) {
            case 1 -> converterMpsParaKmh();
            case 2 -> converterKmhParaMps();
            case 3 -> converterKmhParaMph();
            case 4 -> converterMphParaKmh();
            case 0 -> voltar = true;
            default -> IO.println("Opção inválida.");
        }
    } while (!voltar);
}

void menuMassa() {
    Boolean voltar = false;

    do {
        IO.println("\n==== MASSA ====");
        IO.println("1 - Miligrama para Grama");
        IO.println("2 - Grama para Quilograma");
        IO.println("3 - Quilograma para Tonelada");
        IO.println("4 - Libra para Quilograma");
        IO.println("5 - Onça para Grama");
        IO.println("0 - Voltar");
        IO.print("Escolha uma : ");

        Integer opcao = Integer.parseInt(IO.readln());

        switch (opcao) {
            case 1 -> converterMgParaG();
            case 2 -> converterGParaKg();
            case 3 -> converterKgParaTon();
            case 4 -> converterLbParaKg();
            case 5 -> converterOzParaG();
            case 0 -> voltar = true;
            default -> IO.println("oOção inválida.");
        }
    } while (!voltar);
}

// =========================================================
// FUNCOES AUXILIARES
// =========================================================
Double lerValor(String mensagem) {
    Double valor = 0.0;

    do {
        IO.print(mensagem);
        valor = Double.parseDouble(IO.readln());

        if (valor < 0) {
            IO.println("Informe um valor maior ou igual a zero.");
        }
    } while (valor < 0);

    return valor;
}

void mostrarResultado(String origem, String destino, Double valor, Double resultado) {
    IO.println("Resultado: " + valor + " " + origem + " = " + resultado + " " + destino);
}

// =========================================================
// COMPRIMENTO
// =========================================================
void converterMilimetroParaCentimetro() {
    Double valor = lerValor("Informe o valor em milimetros: ");
    Double resultado = valor / 10.0;
    mostrarResultado("mm", "cm", valor, resultado);
}

void converterCentimetroParaMetro() {
    Double valor = lerValor("Informe o valor em centímetros: ");
    Double resultado = valor / 100.0;
    mostrarResultado("cm", "m", valor, resultado);
}

void converterMetroParaQuilometro() {
    Double valor = lerValor("Informe o valor em metros: ");
    Double resultado = valor / 1000.0;
    mostrarResultado("m", "km", valor, resultado);
}

void converterMetroParaPolegada() {
    Double valor = lerValor("Informe o valor em metros: ");
    Double resultado = valor * 39.3701;
    mostrarResultado("m", "pol", valor, resultado);
}

void converterMetroParaPe() {
    Double valor = lerValor("Informe o valor em metros: ");
    Double resultado = valor * 3.28084;
    mostrarResultado("m", "pe", valor, resultado);
}

void converterQuilometroParaMetro() {
    Double valor = lerValor("Informe o valor em quilometros: ");
    Double resultado = valor * 1000.0;
    mostrarResultado("km", "m", valor, resultado);
}

// =========================================================
// AREA
// =========================================================
void converterCm2ParaM2() {
    Double valor = lerValor("Informe o valor em centimetros quadrados: ");
    Double resultado = valor / 10000.0;
    mostrarResultado("cm2", "m2", valor, resultado);
}

void converterM2ParaKm2() {
    Double valor = lerValor("Informe o valor em metros quadrados: ");
    Double resultado = valor / 1000000.0;
    mostrarResultado("m2", "km2", valor, resultado);
}

void converterM2ParaHectare() {
    Double valor = lerValor("Informe o valor em metros quadrados: ");
    Double resultado = valor / 10000.0;
    mostrarResultado("m2", "ha", valor, resultado);
}

void converterM2ParaAcre() {
    Double valor = lerValor("Informe o valor em metros quadrados: ");
    Double resultado = valor / 4046.8564224;
    mostrarResultado("m2", "acre", valor, resultado);
}

// =========================================================
// VOLUME
// =========================================================
void converterMlParaL() {
    Double valor = lerValor("Informe o valor em mililitros: ");
    Double resultado = valor / 1000.0;
    mostrarResultado("mL", "L", valor, resultado);
}

void converterLParaM3() {
    Double valor = lerValor("Informe o valor em litros: ");
    Double resultado = valor / 1000.0;
    mostrarResultado("L", "m3", valor, resultado);
}

void converterCm3ParaMl() {
    Double valor = lerValor("Informe o valor em centimetros cubicos: ");
    Double resultado = valor;
    mostrarResultado("cm3", "mL", valor, resultado);
}

void converterM3ParaDm3() {
    Double valor = lerValor("Informe o valor em metros cubicos: ");
    Double resultado = valor * 1000.0;
    mostrarResultado("m3", "dm3", valor, resultado);
}

// =========================================================
// VELOCIDADE
// =========================================================
void converterMpsParaKmh() {
    Double valor = lerValor("Informe o valor em m/s: ");
    Double resultado = valor * 3.6;
    mostrarResultado("m/s", "km/h", valor, resultado);
}

void converterKmhParaMps() {
    Double valor = lerValor("Informe o valor em km/h: ");
    Double resultado = valor / 3.6;
    mostrarResultado("km/h", "m/s", valor, resultado);
}

void converterKmhParaMph() {
    Double valor = lerValor("Informe o valor em km/h: ");
    Double resultado = valor / 1.60934;
    mostrarResultado("km/h", "mph", valor, resultado);
}

void converterMphParaKmh() {
    Double valor = lerValor("Informe o valor em mph: ");
    Double resultado = valor * 1.60934;
    mostrarResultado("mph", "km/h", valor, resultado);
}

// =========================================================
// MASSA
// =========================================================
void converterMgParaG() {
    Double valor = lerValor("Informe o valor em miligramas: ");
    Double resultado = valor / 1000.0;
    mostrarResultado("mg", "g", valor, resultado);
}

void converterGParaKg() {
    Double valor = lerValor("Informe o valor em gramas: ");
    Double resultado = valor / 1000.0;
    mostrarResultado("g", "kg", valor, resultado);
}

void converterKgParaTon() {
    Double valor = lerValor("Informe o valor em quilogramas: ");
    Double resultado = valor / 1000.0;
    mostrarResultado("kg", "t", valor, resultado);
}

void converterLbParaKg() {
    Double valor = lerValor("Informe o valor em libras: ");
    Double resultado = valor * 0.45359237;
    mostrarResultado("lb", "kg", valor, resultado);
}

void converterOzParaG() {
    Double valor = lerValor("Informe o valor em oncas: ");
    Double resultado = valor * 28.3495231;
    mostrarResultado("oz", "g", valor, resultado);
}
