import java.util.Scanner;

/**
 * Realizar una clase Vector3d que permita manipular vectores de tres componentes en
 * coordenadas x, y, z de acuerdo con las siguientes normas:
 * • Usar sólo un método constructor.
 * • Usar un método miembro equals() para saber si dos vectores tienen sus componentes
 * o coordenadas iguales.
 * */
public class C8_5_Vector3DPrueba {

    public static void main(String[] args) {
        C8_8_5_Vector3D v1,v2;
        double x,y,z;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Programa de comparación de dos vectores en tres dimensiones (x,y,z)");
        System.out.println("Ingresa los tres primer componente del primer vector, separado por espacio ");
        x = entrada.nextDouble();
        y = entrada.nextDouble();
        z = entrada.nextDouble();

        v1 = new C8_8_5_Vector3D(x,y,z);

        System.out.println("El vector ingresado es el: <"+x+" , "+y+" , "+z+">");

        System.out.println("Ingresa los tres primer componente del segundo vector, separado por espacio ");
        x = entrada.nextDouble();
        y = entrada.nextDouble();
        z = entrada.nextDouble();

        v2 = new C8_8_5_Vector3D(x,y,z);

        System.out.println("El vector ingresado es el: <"+x+" , "+y+" , "+z+">");

        if (v1.equals(v2)){
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores son diferentes.");
        }

        System.out.println("\nLa norma del primer vector es: "+ v1.normamax());
        System.out.println("\nLa norma del segundo vector es: "+ v2.normamax());
    }
}
