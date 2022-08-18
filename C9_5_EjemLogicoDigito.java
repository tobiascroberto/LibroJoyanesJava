import java.util.Scanner;

/**
 * Escribir un método lógico vocal que determine si un carácter es una vocal.
 * */

public class C9_5_EjemLogicoDigito {

    public String esVocal(char c){
        String a,b = new String();
        a = c + " ";
        c = a.toLowerCase().charAt(0);
        switch (c){
            case 'a': case 'e': case 'i': case 'o': case 'u': b = "Es una vocal";break;
            default: b = "No es una vocal";break;
        }
        return b;
    }

    public static void main(String[] args) {
        char caracter;
        Scanner entrada = new Scanner(System.in);

        C9_5_EjemLogicoDigito objeto = new C9_5_EjemLogicoDigito();

        System.out.println("Programa que determina si el caracter introducido es una vocal");
        System.out.print("Ingresa el caracter: \t");

        caracter = entrada.nextLine().charAt(0);


        System.out.println("El caracter introducido es: \"" + caracter + "\" el cual es: "+ objeto.esVocal(caracter));

    }
}
