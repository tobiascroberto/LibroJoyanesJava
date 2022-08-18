/**
 * Realizar la clase Complejo que permita la gestión de números complejos (un número
 * complejo es igual a dos números reales double: una parte real más una parte imaginaria).
 * Las operaciones a implementar son las siguientes:
 * • establecer() permite inicializar un objeto de tipo Complejo a partir de dos componentes
 * double.
 * • imprimir() realiza la visualización formateada de Complejo.
 * • agregar() sobrecargado añade respectivamente Complejo a otro y dos componentes
 * double a un Complejo.*/

public class C8_7_Complejo {

    private double a;
    private double b;

    public C8_7_Complejo(double a, double b){
        this.a = a;
        this.b = b;
    }

    public void establecer(double a, double b){
        this.a = a;
        this.b = b;
    }

    public void establecer1(C8_7_Complejo q){
        this.a = q.a;
        this.b = q.b;
    }
    public void imprimir(){
        System.out.println("El numero complejo ingresado es: "+a+" + "+b+"i");
    }

    // operaciones con numeros complejos

    public double obtenerParteReal(){
        return a;
    }
    public double obtenerParteImag(){
        return b;
    }

    public C8_7_Complejo suma(C8_7_Complejo q){
        C8_7_Complejo k;

        double real = this.a + q.a;
        double imag = this.b + q.b;

         k = new C8_7_Complejo(real,imag);

         return k;
    }

    public C8_7_Complejo resta(C8_7_Complejo q){
        C8_7_Complejo k;

        double real = this.a - q.a;
        double imag = this.b - q.b;

        k = new C8_7_Complejo(real,imag);

        return k;
    }
    public C8_7_Complejo multiplicacion(C8_7_Complejo q){
        C8_7_Complejo k;

        double real = this.a*q.a- this.b*q.b;
        double imag = this.a*q.a+ this.b*q.b;

        k = new C8_7_Complejo(real,imag);

        return k;
    }
    public C8_7_Complejo conjugado(){
        C8_7_Complejo k;

        double real = this.a;
        double imag = -1*this.b;

        k = new C8_7_Complejo(real,imag);

        return k;
    }
}
