void main() {

//    Integer idade = 17;
//
//    if(idade < 18){
//        IO.println("Menor de idade.");
//    }
//    else{
//        IO.println("Maior de idade.");
//    }


//    IO.println(idade >= 18);

    Boolean temDinheiro, temNecessidade;

    temNecessidade = false;
    temDinheiro = false;

    //Operadores lógicos:
    // && - E - todas as condições precisam ser verdadeiras
    // || - OU - se pelo menos uma das condições for verdadeira
    // ! - NÃO ou negação




    if(temDinheiro && temNecessidade){ // true para as duas condições
        IO.println("Vou comprar!");
    }
    else{
        IO.println("Não vou comprar!");
    }

    if(temDinheiro || temNecessidade){ // true para pelo menos uma das condições
        IO.println("Vou comprar!");
    }
    else{
        IO.println("Não vou comprar!");
    }

    Boolean ligado;

    ligado = true;

    //if(ligado == false)
    if(!ligado)
        IO.println("Desligado!"); //!ligado
    else
        IO.println("Ligado!");

    // !false == true
    // !true == false

    /*

    //Operadores lógicos:
    // && - E - todas as condições precisam ser verdadeiras
    // || - OU - se pelo menos uma das condições for verdadeira
    // ! - NÃO ou negação

    !    - executa primeiro
    &&
    ||   - executa por último

    1)	Considere as seguintes variáveis booleanas, inicializadas da seguinte maneira:
        Boolean a = false;
        Boolean b = true;
        Boolean c = false;
        Boolean d;

        Qual é o resultado (true ou false) das seguintes atribuições de expressões lógicas em d?
        a)	d = a && b;         false
        b)	d = a || b;         true
        c)	d = a && b && c;    false
        d)	d = a && b || c;    false
        e)	d = a || c && b;    false
        f)	d = (a || c) && b;  false
        g)	d = !a;             true
        h)	d = a || !a;        true
        i)	d = a && !a;        false
        j)	d = a && !b && c;   false
        k)	d = !(a && b) || !c; true
     */
    Boolean a = false;
    Boolean b = true;
    Boolean c = false;
    Boolean d;

    d = a && c || b; // t
    IO.println("Resultado: " + d);
}