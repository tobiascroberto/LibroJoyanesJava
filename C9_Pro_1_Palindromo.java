import java.util.Scanner;

/**
 * Escribir un método que determine si una cadena de caracteres es un palíndromo, es
 * decir, un texto que se lee igual en sentido directo e inverso; por ejemplo: radar.
 * */

public class C9_Pro_1_Palindromo {

    public void esPalindromo(String texto){

        String textoOriginal = texto;
        String texto2;
        texto = texto.replace(" ","");
        System.out.println("la cadena sin espacios es: "+texto);
        StringBuilder texto1 = new StringBuilder(texto);
        texto2 = texto1.reverse().toString();
        System.out.println("La cadena invertida es: "+texto2);


        if(texto.equals(texto2)){
            System.out.println("La frase: \""+textoOriginal+"\" es un palindromo");
        } else {
            System.out.println("La frase: \""+textoOriginal+"\" No es un palindromo");
        }


    }

    public static void main(String[] args) {

        String lineaTexto;
        Scanner entrada = new Scanner(System.in);

        C9_Pro_1_Palindromo objeto = new C9_Pro_1_Palindromo();

        System.out.println("Programa que muestra si una cadena de caracteres es un palindromo. ");
        lineaTexto = entrada.nextLine();

        objeto.esPalindromo(lineaTexto);


    }
}
