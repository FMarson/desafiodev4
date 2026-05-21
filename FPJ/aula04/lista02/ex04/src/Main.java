void main() {
    Double num1, num2;

    num1 = Double.parseDouble(IO.readln("Informe o primeiro número: "));
    num2 = Double.parseDouble(IO.readln("Informe o segundo número: "));

    if(num1.doubleValue() == num2.doubleValue()){
        IO.println("Os dois números são iguais!");
    }
    else{
        if(num1 > num2){
            IO.println(num1 + " é o maior número!");
        }
        else{
            IO.println(num2 + " é o maior número!");
        }
    }

}