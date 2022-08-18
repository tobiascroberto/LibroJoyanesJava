/*
* Este sistema de ecuaciones lineales
ax + by = c
dx + ey = f
se puede resolver con las siguientes fórmulas:
*
Diseñar un programa que lea dos conjuntos de coeficientes (a, b, y c ; d, e y f) y visualice
los valores de x y y.*/

public class C4_43_SistemaEcuaciones {

    public static void main(String[] args) {

        double a = 4,b = -3,c = 5;
        double d = 2,e = 7,f =6;

        double x,y;


        System.out.println("Programa que da el resultado del sistema de ecuaciones tipo: ");
        System.out.println("ax+by=c");
        System.out.println("d*x+e*y=f");

        x = (c*e-b*f)/(a*e-b*d);
        y =  (a*f-c*d)/(a*e-b*d);
        System.out.println("El resultado para x = " + x) ;
        System.out.println("El resultado para y = " + y );


        System.out.println("La primera ecuación es " + (a*x+b*y) + " = " + c);
        System.out.println("La segunda ecuación es " + (d*x+e*y) + " = " + f);

    }

}
