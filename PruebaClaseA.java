package c06.p06;

public class PruebaClaseA {
    public static void main(String[] args) {
        ClaseA obj1 = new ClaseA();
        ClaseA obj2 = new ClaseA();

        obj1.campoA = 10;
        obj2.campoA = 20;
        System.out.println(obj1.campoA + ", " + obj2.campoA);

        obj1.campoB = 100;
        obj2.campoB = 200;
        System.out.println(obj1.campoB + ", " + obj2.campoB);

        obj1.campoCompartido = 1000;
        obj2.campoCompartido = 2000;
        System.out.println(obj1.campoCompartido + ", " + obj2.campoCompartido);

    } // Fin del método main
} // Fin de la clase PruebaClaseA