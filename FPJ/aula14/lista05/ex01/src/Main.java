/*
a)	Os dez primeiros números positivos.
b)	Dez números sequenciais começando em -6.
c)	Os dez primeiros pares positivos.
d)	Os dez primeiros múltiplos positivos de 4.

for
while
do/while
 */

void main() {
    // a
    IO.print("A) ");
    for(int num = 1; num < 11; num++){
        IO.print(num + " ");
    }

    // b
    IO.print("\n\nB) ");
    int n = -6;
    for(int contador = 0; contador < 10; contador++){
        IO.print((n + contador) +" ");
    }
    /* versão alternativa
    for(int contador = 0; contador < 10; contador++){
        IO.print(n + " ");
        n++;
    }
    */
    // c
    IO.print("\n\nC) ");
    Integer par = 2;
    for(int num = 0; num < 10; num++){
        IO.print(par + " ");
        par += 2;
    }

    // d
    IO.print("\n\nD) ");
    Integer multiplo4 = 4;
    for(int c = 0; c < 10; c++){
        IO.print(multiplo4 + " ");
        multiplo4 += 4;
    }

    int contador = 0;
    n = 1;

    IO.println();
    while(contador < 10){
        if(n % 4 == 0){
            IO.print(n + " ");
            contador++;
        }
        n++;
    }

    IO.println("\n\nDivisão por 3");
    for(int num = 0; num < 20; num++){
        IO.print((num / 3) + " ");
    }

    IO.println("\n\nDivisão por 3.0");
    for(int num = 0; num < 20; num++){
        IO.print((num / 3.0) + " ");
    }

    IO.println("\n\nMódulo de 3");
    for(int num = 0; num < 20; num++){
        IO.print((num % 3) + " ");
    }

    IO.println("\n\nParte decimal");
    for(int num = 0; num < 20; num++){
        IO.print(((num % 3)/3.0) + " ");
    }
}