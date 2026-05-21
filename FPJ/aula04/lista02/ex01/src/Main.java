void main() {
    Integer numero;

    numero = Integer.parseInt(IO.readln("Informe um número: "));

    if(numero > 30){
        IO.println("O número lido é maior do que 30!");
    }
    else if (numero == 30) {
        IO.println("O número lido é 30!");
    }
    else{
        IO.println("O número lido é menor do que 30!");
    }
}