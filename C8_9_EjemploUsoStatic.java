/**
 * Programa que usa y explica el modificador static!!
 * static palabra reservada, que es un atributo o metodo comun de la clase y no de los objetos
 * se accede con el nombre de la clase seguido del atributo static.*/

public class C8_9_EjemploUsoStatic {
    private int datos;
    static int cuenta = 0;

    public C8_9_EjemploUsoStatic(){
        datos = 0;
        cuenta++;
    }
    public  C8_9_EjemploUsoStatic(int datos){
        this.datos = datos;
        cuenta++;

    }




}
