import java.util.Scanner;

/**
 * programa que utiliza la calse C8_1_EjercicioDiaAnio para crear dos objetos de esa clase.
 * El primero sobre el dia de hoy y el segundo del dia de cumpleaños.
 * los comparara, si es la misma fecha imprime mensaje de felicitaciones, y sino solo de buen dia.
 * */


public class C8_1_EjercicioDiaAnioCumpleanio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        C8_1_EjercicioDiaAnio diaHoy, diaCumpleanios;
        int dia,mes;

        System.out.println("Bienvenido al programa que compara dos fechas la actual y tu cumpleaños."+
                "\n \timprime mensaje de felicitacines si es el mismo dia.");
        System.out.println("Ingresa el mes de hoy (1: Enero, 2: Febrero, 3:Marzo ...): \t");
        mes = entrada.nextInt();
        System.out.println("Ingresa el dia de hoy : \t");
        dia = entrada.nextInt();
        // Objeto dia de hoy
        diaHoy = new C8_1_EjercicioDiaAnio(mes,dia);
        diaHoy.visualizar();

        System.out.println("Ingresa el mes de tú cumpleaños (1: Enero, 2: Febrero, 3:Marzo ...): \t");
        mes = entrada.nextInt();
        System.out.println("Ingresa el dia de tú cumpleaños : \t");
        dia = entrada.nextInt();
        diaCumpleanios = new C8_1_EjercicioDiaAnio(mes,dia);

        diaCumpleanios.visualizar();

        if (diaHoy.igual(diaCumpleanios)){
            System.out.println("Feliz cumpleaños.");
        } else {
            System.out.println("Feliz día");
        }




    }
}
