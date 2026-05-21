void main() {
    Integer idade;

    //Converter de String para Integer
    //Usar: Integer.parseInt()
    //idade = Integer.parseInt(IO.readln("Informe a sua idade: "));

    //Comando if - se algo for verdade
//    if(idade >= 18){
//        IO.println("Você é maior de idade!");
//    }
//    else{  //Comando else - senão, se algo não for verdade
//        IO.println("Você é menor de idade!");
//    }

    //Tipos de dados:
    /*
    Integer - números inteiros
    Double - números decimais
    String - textos
    Boolean - valores lógicos: false ou true
     */

    //Operadores relacionais: <, >, <=, >=, == (igual), != (diferente)
    //if(expressão lógica)
    Boolean ligado;  //variável do tipo lógico
    ligado = true; // verdadeiro
    //ligado = false; // falso

    //if(ligado == true){
    if(ligado){
        IO.println("Está ligado!");
    }
    else{
        IO.println("Está desligado!");
    }


}