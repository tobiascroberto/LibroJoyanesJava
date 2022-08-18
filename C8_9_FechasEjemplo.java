import java.util.Scanner;

public class C8_9_FechasEjemplo {

    public static void main(String[] args) {
        C8_9_Fecha x;

        Scanner entrada = new Scanner(System.in);

        int mes,dia,anio;

        System.out.println("Programa para mostrar una fecha: ");
        System.out.println("Ingresa dia, mes y año separado por espacios. ");
        dia = entrada.nextInt();
        mes = entrada.nextInt();
        anio = entrada.nextInt();

        x = new C8_9_Fecha(mes, dia, anio );
        x.imprimir();
        System.out.println("Los dias del mes de "+ x.obtenerMes()+ " son "+x.dias());

        x.esBisiesto();



    }
}
