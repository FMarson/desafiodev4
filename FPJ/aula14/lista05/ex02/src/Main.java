/*
2)	Crie um algoritmo que some as notas de uma turma de 15 alunos e
depois imprima a menor nota, a maior nota e a média da turma.
 */
void main() {
    Integer quantidadeAlunos;
    Double nota, menorNota = 10.0, maiorNota = 0.0, soma = 0.0, media;

    quantidadeAlunos = Integer.parseInt(IO.readln("Informe a quantidade de alunos: "));

    for(int a = 0; a < quantidadeAlunos; a++){
        IO.println("Valor de a: " + a);
        nota = Double.parseDouble(IO.readln("Informe a nota: "));
        if(nota >= 0.0 && nota <= 10.0){ // nota válida
            if(nota < menorNota) { // testar a menor nota
                menorNota = nota;
            }

            if(nota > maiorNota) { // testar a maior nota
                maiorNota = nota;
            }
            soma += nota;
        }
        else{ // nota inválida
            IO.println("A nota informada não está entre os valores aceitos.");
            a--; // correção caso a nota seja válida pedir nota novamente
        }
    }
    media = soma / quantidadeAlunos;
    IO.println("Menor: " + menorNota);
    IO.println("Maior: " + maiorNota);
    IO.println("Média: " + media);

}