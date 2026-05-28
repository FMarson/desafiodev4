/*
Escrever um programa para calcular o desconto previdenciário de um funcionário.
Pedir ao usuário o valor do salário e calcular 11% desse valor.
No entanto, caso o valor do desconto ultrapassar R$ 318,20, considerar esse valor como desconto máximo.
Por fim, apresentar o valor do desconto a ser aplicado.
Exemplo de entrada:
    Informe o salário: 2500

Exemplo de saída:
    O desconto previdenciário é: 275.0
 */

void main() {
    Double salario, descontoPrevidenciario, valorMaximo = 318.2;

    salario = Double.parseDouble(IO.readln("Informe o salário: "));
    descontoPrevidenciario = salario * 0.11;


    if(descontoPrevidenciario > valorMaximo) //{ Tendo dois ou mais comandos eu preciso usar o bloco { }
        //IO.println("O valor do imposto ultrapassou o valor máximo.");
        descontoPrevidenciario = valorMaximo; // 1 comando só
    //}


    IO.println("O desconto previdenciário é de R$ " + descontoPrevidenciario);
}