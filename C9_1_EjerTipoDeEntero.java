import java.util.Scanner;

/**
 * Escribir un método con un argumento de tipo entero que devuelva la letra P si el número
 * es positivo, y la letra N si es cero o negativo.
 * */

public class C9_1_EjerTipoDeEntero {

    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);

        C9_1_EjerTipoDeEntero objeto = new C9_1_EjerTipoDeEntero();

        System.out.println("Programa que le un número entero e indica si es positivo, negativo o cero.");
        numero = entrada.nextInt();

        System.out.println("El número que ingresaste es el: "+numero+" y es: "+objeto.numeroValidado(numero));



    }


    public String numeroValidado(int numero){
        String a;

        if (numero > 0){
            a = "P de Positivo";
        } else {
            a = "N de negativo o cero";
        }
        return a;
    }
}
