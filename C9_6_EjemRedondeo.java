import java.util.Scanner;

/**
 * Escribir un método redondeo que acepte el valor real cantidad y el valor entero
 * decimales para devolver el valor cantidad redondeado al número especificado
 * de decimales; por ejemplo, redondeo(20.563,2) devuelve 20.56.
 * */

public class C9_6_EjemRedondeo {

    public String redondeo(double a, int b){
        String x = "";
        int posicion,finalPosicion;
        x = x.valueOf(a);
        //System.out.println("Longitud de caracteres "+x.length());
        posicion = x.indexOf(".");
        finalPosicion = x.length() - posicion - 1;
        finalPosicion = Math.abs(b-finalPosicion);
        x = x.substring(0,x.length()-finalPosicion);
        //System.out.println("la posicion del . es: "+posicion+ " la posicion final es: "+finalPosicion);

         return x;
    }

    public static void main(String[] args) {
        double numero;
        int lugaresDecimales;
        Scanner entrada = new Scanner(System.in);

        C9_6_EjemRedondeo objeto = new C9_6_EjemRedondeo();

        System.out.println("Programa para mostrar un numero decimal a \"n\" posiciones.");

        System.out.print("Ingresa el numero decimal \t");

        numero  = entrada.nextDouble();
        System.out.print("\n¿Cuantas posiciones? \t");
        lugaresDecimales  = entrada.nextInt();

        System.out.println("El numero introducido es \"" + numero + "\" el número de posiciones es: "+ lugaresDecimales+
                ", el resultado es = " + objeto.redondeo(numero,lugaresDecimales));

    }
}
