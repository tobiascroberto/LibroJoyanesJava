public class C8_9_EjemploUsoStaticUso {

    public static void main(String[] args) {
        C8_9_EjemploUsoStatic d1,d2;

        System.out.println("Objetos Ejemplo: "+ C8_9_EjemploUsoStatic.cuenta);
        d1 = new C8_9_EjemploUsoStatic();
        d2 = new C8_9_EjemploUsoStatic(11);
        System.out.println("Objeto Ejemplo: "+ C8_9_EjemploUsoStatic.cuenta);

        d2 = d1;
        System.gc();
        System.out.println("Objeto Ejemplo: "+C8_9_EjemploUsoStatic.cuenta);

        d2 = d1 = null;
        System.out.println("Objeto Ejemplo: "+C8_9_EjemploUsoStatic.cuenta);

    }
}
