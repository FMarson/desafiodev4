/*
Escrever um programa para ajudar um comerciante a definir o preço de venda de um
produto. Pedir ao usuário o valor de compra do produto. Depois, calcular o preço de venda de acordo com a regra definida:
    • se o valor de compra for menor que R$ 20,00, aplicar lucro de 45%;
    • se o valor de compra for de até R$ 50,00, aplicar lucro de 35%;
    • se o valor de compra for maior que R$ 50,00, aplicar lucro de 25%.
Por fim, apresentar o valor final de venda.
    Exemplo de entrada:
    Informe o valor de compra: 30
    Exemplo de saída:
    O valor de venda é de 40.5 reais
 */
void main() {
    Double valorCompra, valorVenda;

    valorCompra = Double.parseDouble(IO.readln("Informe o valor de compra: "));
    if(valorCompra < 20.0){
        valorVenda = valorCompra * 1.45;
    } else if (valorCompra <= 50) {
        valorVenda = valorCompra * 1.35;
    }
    else{
        valorVenda = valorCompra * 1.25;
    }

    IO.println("O valor de venda é de " + valorVenda + " reais");
}