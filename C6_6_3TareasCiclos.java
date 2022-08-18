import java.util.Scanner;

/**
 * Seleccionar y escribir el bucle adecuado para resolver las siguientes tareas:
 * a) Suma de la serie 1/2+1/3+1/4+1/5+...+1/50.
 * b) Lectura de la lista de calificaciones de un examen de Historia.
 * c) Visualizar la suma de enteros en el intervalo 11...50
 * */

public class C6_6_3TareasCiclos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double sumaA = 0;
        int sumaB = 0;
        System.out.println("Programa que realiza las siguientes operaciones: ");

        // inciso a)
        System.out.println("a) Suma de la serie 1/2+1/3+1/4+1/5+...+1/50.");

        for(int i = 2; i <51; i++){
            sumaA += 1.0/i;
        }
        System.out.println("La suma de es: " + sumaA);

        // inciso b)
        System.out.println("b) Lectura de la lista de calificaciones de un examen de Historia.");


        // inciso c)
        System.out.println("c) Visualizar la suma de enteros en el intervalo 11...50");
        for(int i =11; i <51; i++){
            sumaB += i;
        }
        System.out.printf("La suma de es: %,d", sumaB);

    }
}
