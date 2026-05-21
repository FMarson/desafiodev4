void main() {
    Double num1, num2;

    num1 = Double.parseDouble(IO.readln("Informe o primeiro número: "));
    num2 = Double.parseDouble(IO.readln("Informe o segundo número: "));

    if(num1.doubleValue() == num2.doubleValue()){
        IO.println("Os dois números lidos são iguais!");
    }
    else{
        IO.println("Os dois números lidos são diferentes!");
    }
}