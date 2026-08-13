/*
Métodos ou funções com retorno
TIPODORETORNO nomeMetodo(){

    return ALGUMACOISA;
}

Métodos ou funções sem retorno
void nomeMetodo(){


}
 */
Double calcularArea(Double b, Double a){
    return b * a;
}

Double calcularPerimetro(Double l1, Double l2, Double l3, Double l4){
    return l1 + l2 + l3 + l4;
}

Double calcularPerimetro(Double b, Double a){
    return 2 * b + 2 * a;
}


void main() {
    Double area, base, altura, perimetro;

    base = Double.parseDouble(IO.readln("Informe a base do retângulo: "));
    altura = Double.parseDouble(IO.readln("Informe a altura do retângulo: "));
    //area = base * altura;
    area = calcularArea(base, altura);
    perimetro = calcularPerimetro(base, altura, base, altura);
    //perimetro = calcularPerimetro(base, altura);

    IO.println("A área do retângulo é " + area + " m².");
    IO.println("O perímetro do retângulo é " + perimetro + " m.");
}