import java.util.Scanner;

/**
 * Implementar la clase Hora; donde cada objeto represente una hora específica del día,
 * almacenando horas, minutos y segundos como enteros; incluir un constructor, métodos
 * de acceso, un método adelantar(int h, int m, int s) para actualizar la hora de
 * un objeto existente, un método reiniciar(int h, int m, int s) que reinicie la
 * hora actual de un objeto existente y un método imprimir().*/

public class C8_9_ClaseHoraEjemplo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int hora,minuto,segundo;
        C8_9_ClaseHora a;

        System.out.println("Programa que imprime la hora, minutos y segundos dado por usuario separado por espacios");
        hora = entrada.nextInt();
        minuto = entrada.nextInt();
        segundo = entrada.nextInt();

        a = new C8_9_ClaseHora(hora,minuto,segundo);

        a.imprimir();
        a.reiniciar();
        a.imprimir();
        a.obtenerHoraLocal();
        a.imprimir();




    }
}
