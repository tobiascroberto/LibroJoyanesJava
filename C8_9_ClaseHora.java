import java.time.LocalDateTime;

/**
 * Implementar la clase Hora; donde cada objeto represente una hora específica del día,
 * almacenando horas, minutos y segundos como enteros; incluir un constructor, métodos
 * de acceso, un método adelantar(int h, int m, int s) para actualizar la hora de
 * un objeto existente, un método reiniciar(int h, int m, int s) que reinicie la
 * hora actual de un objeto existente y un método imprimir().*/
public class C8_9_ClaseHora {
    private int hora, minuto, segundo;

    public  C8_9_ClaseHora(int hora, int minutos, int segundo){
        this.hora = hora;
        this.minuto = minutos;
        this.segundo = segundo;
    }

    public int obtenerHora(){
        return this.hora;
    }
    public int obtenerMinuto(){
        return this.minuto;
    }

    public int obtenerSegundo(){
        return this.segundo;
    }

    public void adelantar(int hora,int minuto,int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void reiniciar(){

        this.hora = 12;
        this.minuto = 0;
        this.segundo = 0;
    }

    public void imprimir(){
        System.out.println("La hora es "+this.hora+":"+this.minuto+":"+this.segundo);
    }

    public void obtenerHoraLocal(){
        LocalDateTime a = LocalDateTime.now();

        this.hora = a.getHour();
        this.minuto = a.getMinute();
        this.segundo = a.getSecond();
    }

}
