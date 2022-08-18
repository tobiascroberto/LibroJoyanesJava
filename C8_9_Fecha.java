/**
 * Implementar la clase Fecha con miembros dato para mes, día y año; sus clases deben
 * representar una fecha que almacene día, mes y año como enteros; incluir un constructor
 * por defecto, métodos de acceso, un método reiniciar (int d, int m, int a)
 * para reiniciar la fecha de un objeto existente, un método adelantar(int d, int m,
 * int a)para cambiar una fecha existente (día, d, mes, m, y año a) y un método imprimir().
 * Escribir un método de utilidad, normalizar(), para asegurar que los miembros
 * dato están en el rango correcto 1 ≤ año, 1 ≤ mes ≤ 12, día ≤ días (Mes), donde
 * días(Mes) es otro método que devuelve el número de días de cada mes.*/

public class C8_9_Fecha {
    private int mes, dia, anio;

    public  C8_9_Fecha(int mes, int dia, int anio){
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }

    public int obtenerMes(){
        return this.mes;
    }
    public int obtenerDia(){
        return this.dia;
    }

    public int obtenerAnio(){
        return this.anio;
    }

    public void adelantar(int mes,int dia,int anio){
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }

    public void reiniciar(){
        this.mes = 1;
        this.dia = 1;
        this.anio = 2000;
    }

    public void imprimir(){
        System.out.println("La fecha es: "+this.dia+"/"+this.mes+"/"+this.anio);
    }

    public int dias(){
        int diasMes=31;
        switch (this.mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: diasMes = 31; break;
            case 4: case 6: case 9: case 11: diasMes = 30; break;
            case 2: diasMes = 28;break;


        }
        return diasMes;
    }

    public void normalizar(){
        if(!(this.mes <= 12 && this.mes > 0) ){
            System.out.println("Ingresaste un numéro invalido de mes. ");
        }
        if(!(this.dia <= 31 && this.dia > 0) ){
            System.out.println("Ingresaste un numéro invalido de dias. ");
        }
        if( this.anio < 1 ){
            System.out.println("Ingresaste un numéro invalido de año. ");
        }
    }

    public void esBisiesto(){
        if (((this.anio % 4 == 0)&&(this.anio % 100 != 0))||(this.anio % 400 == 0) ){
            System.out.println(" El año "+this.anio+" es bisiesto.");
        } else {
            System.out.println(" El año "+this.anio+" NO es bisiesto.");

        }

    }
}
