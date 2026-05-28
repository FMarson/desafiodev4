/*
Escrever um programa para identificar o valor a ser pago por um plano de saúde.
Pedir ao usuário a idade do conveniado e a quantidade de dependentes. Considerar
que todos pagam no mínimo R$ 300,00, acrescido do valor correspondente a cada
dependente:
        • crianças com menos de 10 anos pagam R$ 100,00; (tipo 1)
        • dependentes com idade entre 10 e 30 anos pagam R$ 220,00; (tipo 2)
        • dependentes com idade entre 31 e 60 anos pagam R$ 395,00; (tipo 3)
        • dependentes com mais de 60 anos pagam R$ 480,00. (tipo 4)
        Por fim, apresentar o valor total a ser pago.
Exemplo de entrada:
Informe a idade do conveniado: 40
Informe a quantidade de dependentes com menos de 10 anos:
Informe a quantidade de dependentes entre 10 e 30 anos:
Informe a quantidade de dependentes entre 31 e 60 anos:
Informe a quantidade de dependentes com mais de 60 anos:

Exemplo de saída:
Valor total do plano de saúde: 620.0
*/

void main() {
    Integer qtdDependentesTipo1 = 0, qtdDependentesTipo2 = 0, qtdDependentesTipo3 = 0, qtdDependentesTipo4 = 0;
    Integer idadeConveniado, qtdDependentes = 0, qtdDependentesLidos = 0;
    Double valorTotal = 300.0;

    //idadeConveniado = Integer.parseInt(IO.readln("Informe a idade do conveniado: "));
    qtdDependentes = Integer.parseInt(IO.readln("Quantos dependentes serão incluídos? "));

    if(qtdDependentes > 0) {
        qtdDependentesTipo1 = Integer.parseInt(IO.readln("Informe a quantidade de dependentes com menos de 10 anos: "));
        qtdDependentesLidos = qtdDependentesTipo1;

        if(qtdDependentesLidos < qtdDependentes) {
            qtdDependentesTipo2 = Integer.parseInt(IO.readln("Informe a quantidade de dependentes entre 10 e 30 anos: "));
            qtdDependentesLidos += qtdDependentesTipo2; //soma os dependentes do tipo 2 ao número de dependentes lidos.
        }

        if(qtdDependentesLidos < qtdDependentes) {
            qtdDependentesTipo3 = Integer.parseInt(IO.readln("Informe a quantidade de dependentes entre 31 e 60 anos: "));
            qtdDependentesLidos += qtdDependentesTipo3; //soma os dependentes do tipo 3 ao número de dependentes lidos.
        }

        if(qtdDependentesLidos < qtdDependentes) {
            qtdDependentesTipo4 = Integer.parseInt(IO.readln("Informe a quantidade de dependentes com mais de 60 anos: "));
            qtdDependentesLidos += qtdDependentesTipo4; //soma os dependentes do tipo 4 ao número de dependentes lidos.
        }

        valorTotal += qtdDependentesTipo1 * 100.0 + qtdDependentesTipo2 * 220.0 + qtdDependentesTipo3 * 395.0 + qtdDependentesTipo4 * 480.0;
    }

    if(qtdDependentesLidos.intValue() != qtdDependentes.intValue()){ // ! não    != diferente      == igual
        IO.println("O número de dependentes lidos foi diferente do número de dependentes informado!");
    }
    else{
        IO.println("Valor total do plano de saúde é de R$ " + valorTotal );
    }
}