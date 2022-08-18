import java.util.Scanner;

/**
 * Escribir un programa que utilice un método para convertir coordenadas polares a rectangulares.
 * x
 * */

public class C_9_3_ProbCoordenasPolares {

    public void convertir(double x, double y){
        double r;
        double angulo;

        r = Math.sqrt(x*x + y*y);

        angulo = Math.atan(y/x);

        System.out.println("El valor en coordenadas polares de la coordenada ( x = "+x+" , y = "+y+" )"+
                " es: r = \""+r+"\" , angulo = \""+Math.ceil(angulo*180.0/Math.PI)+"\" " );


    }


    public static void main(String[] args) {
        double x,y;
        Scanner entrada = new Scanner(System.in);

        C_9_3_ProbCoordenasPolares objeto = new C_9_3_ProbCoordenasPolares();

        System.out.println("Programa que convierte de coordenadas rectangulares a polares.");
        System.out.println("Ingresa el valor de la coordenada en x: \t");
        x = entrada.nextDouble();

        System.out.println("Ingresa el valor de la coordenada en y: \t");
        y = entrada.nextDouble();

        objeto.convertir(x,y);


    }
}
