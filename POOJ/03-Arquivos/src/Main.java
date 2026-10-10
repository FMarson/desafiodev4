void main() {
    Arquivo arquivo = new Arquivo("dados.txt");
    List<String> conteudoArquivo;
    Integer nLinha = 0, nPessoas = 0;
    String todoArquivo;


    String nome = "Ana";
    Integer idade = 20;
    Double altura = 1.67;
    Arquivo arquivo = new Arquivo(nomeArquivo);

    Arquivo.adicionarln(nome);
    Arquivo.adicionarln(idade.toString());
    Arquivo.adicionarln(altura.toString());
    */

    Integer idade, somaIdades = 0;
    Double altura, somaAlturas = 0.0, mediaAlturas;

    conteudoArquivo = Arquivo.lerLinhas(nomeArquivo);
    for(String linha : conteudoArquivo){
        if(nLinha % 3 == 0) { // nome
            IO.println("Nome: " + linha);
            nPessoas++;
        }
        else if(nLinha % 3 == 1) { // idade
            idade = Integer.parseInt(linha);
            IO.println("Idade: " + idade);
            somaIdades += idade;
        }
        else {
            altura = Double.parseDouble(linha);
            IO.println("Altura: " + altura);
            somaAlturas += altura;
        }
        nLinha++;
    }

    mediaAlturas = somaAlturas / nPessoas;
    IO.println("Número de linhas: " + nLinha);
    IO.println("Número de pessoas: " + nPessoas);

    IO.println("Soma das idades: " + somaIdades);
    IO.println("Média das alturas: " + mediaAlturas);
    //todoArquivo = Arquivo.ler(nomeArquivo);
    //IO.println(todoArquivo);


}