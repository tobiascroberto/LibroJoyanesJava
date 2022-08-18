/*
* Escribir un programa para convertir una medida dada en pies a sus equivalentes en
a) yardas, b) pulgadas, c) centímetros y d) metros (1 pie = 12 pulgadas, 1 yarda = 3 pies,
1 pulgada = 2.54 cm, 1 m = 100 cm). Después, ingresar el número de pies e imprimir el
número de yardas, pies, pulgadas, centímetros y metros*/

public class C4_44_ConvertidorPies {

    public static void main(String[] args) {
        double pies = 3;

        System.out.println("Programa que convierte " + pies + " pies a: ");
        String yardas = String.format("a) yardas: %,.2f pies -> %,.2f yardas.", pies, (pies*1/3));
        String pulgadas = String.format("b) pulgadas: %,.2f pies -> %,.2f pulgadas.", pies, (pies*12));
        String centimetros = String.format("c) centímetros: %,.2f pies -> %,.2f centímetros.", pies, (pies*30.48));
        String metros = String.format("d) metros: %,.2f pies -> %,.2f metros.", pies, (pies*0.3048));

        System.out.println( yardas + "\n"+ pulgadas + "\n" +centimetros +"\n"+metros);
    }
}
