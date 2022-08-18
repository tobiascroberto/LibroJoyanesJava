import java.util.Scanner;

/**
 * Escribir un programa que acepte número de día, mes y año y lo visualice en el formato
 * dd/mm/aa; por ejemplo, los valores 8, 10 y 1946 se visualizan como 8/10/46.
 * */
public class C9_Pro_2_FormatoFecha {

    public String darFormato(int dia, int mes, int anio){
        String anio1 = String.valueOf(anio);
        String dia1 = String.format("%02d",dia);
        String mes1 = String.format("%02d",mes);
        anio1 = anio1.substring(2);

        return "La fecha con el formato es: "+dia1+"/"+mes1+"/"+anio1;

    }

    public static void main(String[] args) {
        int dia, mes, anio;

        Scanner entrada = new Scanner(System.in);

        C9_Pro_2_FormatoFecha objeto = new C9_Pro_2_FormatoFecha();

        System.out.println("Programa que visualiza la fecha dada por el usuario(dia, mes, año=2000) en "+
                " formato dd/mm/aa");
        dia = entrada.nextInt();
        mes = entrada.nextInt();
        anio = entrada.nextInt();

        System.out.println(objeto.darFormato(dia, mes, anio));
    }
}
