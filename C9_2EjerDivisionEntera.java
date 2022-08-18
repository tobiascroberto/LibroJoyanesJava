import java.util.Scanner;

/**
 * Escribir un método lógico de 2 argumentos enteros, que devuelva true si uno divide
 * al otro y false en caso contrario.*/


public class C9_2EjerDivisionEntera {
    public boolean division(int a , int b){
        Scanner entrada= new Scanner(System.in);
        while(b == 0){
            System.out.println("Ingresaste un divisor cero, no existe la division entre cero.");
            System.out.println("Ingresa el divisor otra vez ");
            b = entrada.nextInt();
        }
        return a % b == 0;
    }

    public static void main(String[] args) {
        int numero1, numero2;
        Scanner entrada = new Scanner(System.in);

        C9_2EjerDivisionEntera objeto = new C9_2EjerDivisionEntera();

        System.out.println("Programa que le un número entero e indica si entre dos numeros el primero puede ser dividido por el segundo"
        +" \n\tDe forma entera");
        System.out.print("Ingresa los dos números separados por un espacio: \t");

        numero1 = entrada.nextInt();
        numero2 = entrada.nextInt();

        System.out.println("Los numeros que ingresaste fueron el: "+numero1+" y el numero: "+numero2
                + " y la division es "+ objeto.division(numero1,numero2));

    }
}
