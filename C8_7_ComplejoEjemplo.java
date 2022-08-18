/**
 * Realizar la clase Complejo que permita la gestión de números complejos (un número
 * complejo es igual a dos números reales double: una parte real más una parte imaginaria).
 * Las operaciones a implementar son las siguientes:
 * • establecer() permite inicializar un objeto de tipo Complejo a partir de dos componentes
 * double.
 * • imprimir() realiza la visualización formateada de Complejo.
 * • agregar() sobrecargado añade respectivamente Complejo a otro y dos componentes
 * double a un Complejo.*/

public class C8_7_ComplejoEjemplo {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 3;
        double d = 4;
        double real;
        double img;

        C8_7_Complejo numCom1,numCom2,numCom3; // numeros complejos

        System.out.println("Programa de creación de numeros imaginarios");
        numCom1 = new C8_7_Complejo(a,b);
        numCom1.imprimir();

        numCom2 = new C8_7_Complejo(c,d);
        numCom2.imprimir();

        numCom3 = new C8_7_Complejo(0,0);

        numCom3 = numCom1.suma(numCom2);

        real = numCom3.obtenerParteReal();
        img = numCom3.obtenerParteImag();
        System.out.println("La suma de los numeros imaginarios es "+real+" + "+img+"i");

        numCom3 = numCom1.resta(numCom2);

        real = numCom3.obtenerParteReal();
        img = numCom3.obtenerParteImag();
        System.out.println("La resta de los numeros imaginarios es "+real+" + "+img+"i");

        numCom3 = numCom1.multiplicacion(numCom2);

        real = numCom3.obtenerParteReal();
        img = numCom3.obtenerParteImag();
        System.out.println("La multiplicación de los numeros imaginarios es "+real+" + "+img+"i");

        numCom3 = numCom1.conjugado();
        real = numCom3.obtenerParteReal();
        img = numCom3.obtenerParteImag();
        System.out.println("El conjugado del primer numero complejo es "+real+" + "+img+"i");

        numCom3 = numCom2.conjugado();
        real = numCom3.obtenerParteReal();
        img = numCom3.obtenerParteImag();
        System.out.println("El conjugado del segundo numero complejo es "+real+" + "+img+"i");
    }
}
