public class Pessoa {
    //atributos significa características
    String nome;
    Integer idade;
    Double altura;
    Double peso;
    String profissao;
    Boolean temProfissao;

    //métodos representam as funcionalidades
    //Construtor 1
    Pessoa(String novoNome){
        nome = novoNome;
        temProfissao = false;
        idade = 0;
    }

    //Construtor 2
    Pessoa(String novoNome, Integer novaIdade){
        nome = novoNome;
        temProfissao = false;
        idade = novaIdade;
    }

    void definirProfissao(String novaProfissao){
        if(idade != 0) {
            temProfissao = true;
            profissao = novaProfissao;
        }
    }

    void apresentar(){
        IO.println("Olá! Meu nome é " + nome + ".");
    }

    void trabalhar(){
        if(temProfissao == false){
            IO.println("Não posso trabalhar, pois não tenho profissão!");
        }
        else if (profissao.compareToIgnoreCase("estudante") == 0){
            IO.println("Estou estudando!");
        }
        else {
            IO.println("Sou " + profissao + " e estou trabalhando!");
        }
    }

    void verificarMaioridade(){
        //idade = 18; // = é o operador de atribuição - recebe
        // idade == 18 // == é o operador de igualdade - testa se é igual
        if(idade == 0){
            IO.println("Gugu dadá...");
        }
        else if(idade >= 18){ // tem 18 anos ou mais
            IO.println("Sou maior de idade!");
        }
        else{
            IO.println("Sou menor de idade!");
        }
    }

}
