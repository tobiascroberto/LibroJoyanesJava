import java.math.BigInteger;
import java.util.Scanner;

/**
 * Escribir un programa que calcule y visualice
 * 1! + 2! + 3! + ... + (n-1)! + n!
 * donde n es un dato de entrada.
 * */

public class C6_6_7Factorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int factorial;
        BigInteger f = new BigInteger("1");

        System.out.println("Programa que imprime el factorial de un número. ");
        System.out.println("Ingresa el número entero a obtener su factorial. ");

        factorial = entrada.nextInt();

        for (int i = 1; i <= factorial; i++){
            f = f.multiply(new BigInteger(i+ ""));
        }

        System.out.printf("El factorial del número %d es: %,d",factorial,f);

        System.out.println("Fin del programa.");

    }
}
