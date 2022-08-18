/**
 * Clase que crea objeto fecha: mes por numero: 1 Enero, 2: Febrero, etc y dia del mes en una variable int
 *
 * tiene metodo visualizar y el método de verificar si un objeto es igual a otro objeto de la misma clase
 * */

public class C8_1_EjercicioDiaAnio {

    private int mes;
    private int dia;

    // método constructor
    public C8_1_EjercicioDiaAnio(int mes, int dia){

        this.mes = mes;
        this.dia = dia;

    }

    public boolean igual(C8_1_EjercicioDiaAnio d){

        if ((dia == d.dia)&& (mes == d.mes)){
            return true;
        } else
            return false;
    }

    public void visualizar(){
        System.out.println("La fecha es:  dia = "+dia+" mes ="+mes);
    }
}
