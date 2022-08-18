import java.util.Scanner;

/**
 * Escribir un programa que determine y escriba la descomposición factorial de los números
 * enteros comprendidos entre 1 900 y 2 000.
 * */
public class C6_6_6DescomposicionFactorial {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;
        final int MAX = 1900;
        final int MIN = 2000;

        System.out.println("Programa que imprime la descomposición factorial de un numero "
                +"comprendido entre el "+MIN+" y "+MAX);

        do {
            System.out.println("Ingresa el número a descomponer. ");
            numero = entrada.nextInt();
        }while(!((numero<=MAX)&&(numero>=MIN)));

        int i=1;
        while (i<=numero){

            if (i!=numero){
                System.out.print( i + "*");
            }else {
                System.out.print( i );
            }
            i++;
        }
        System.out.println("\nFin del programa!");



    }
}
