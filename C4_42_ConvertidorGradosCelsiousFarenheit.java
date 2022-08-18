/*
* Una temperatura en grados Celsius o centígrados puede convertirse a su equivalente en
Fahrenheit de acuerdo con la siguiente fórmula:
f = (9/5)*C + 32
C +*/

public class C4_42_ConvertidorGradosCelsiousFarenheit {
    public static void main(String[] args) {
        double gradosCelsiusConvertir = 22;
        double resultadoConversion;

        System.out.println("Programa de conversión de grados  celsius a Farenheit");
        resultadoConversion = (9.0/5.0)*gradosCelsiusConvertir + 32.0;
        System.out.println("La conversión de "+gradosCelsiusConvertir+" °C a Farenheit = "+resultadoConversion);
    }
}
