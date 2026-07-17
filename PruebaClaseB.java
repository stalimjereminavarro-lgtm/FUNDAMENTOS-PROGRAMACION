package c06.p07;

public class PruebaClaseB {
    public static void main(String[] args) {
        ClaseB obj1 = new ClaseB();
        ClaseB obj2 = new ClaseB();

        System.out.println("obj1: " + obj1.campoStatic);
        System.out.println("obj2: " + obj2.campoStatic);
        System.out.println("ClaseB: " + ClaseB.campoStatic + "\n");

        obj1.campoStatic = 10;
        System.out.println("obj1: " + obj1.campoStatic);
        System.out.println("obj2: " + obj2.campoStatic);
        System.out.println("ClaseB: " + ClaseB.campoStatic + "\n");

        obj2.campoStatic = 200;
        System.out.println("obj1: " + obj1.campoStatic);
        System.out.println("obj2: " + obj2.campoStatic);
        System.out.println("ClaseB: " + ClaseB.campoStatic + "\n");

        ClaseB.campoStatic = 3000;
        System.out.println("obj1: " + obj1.campoStatic);
        System.out.println("obj2: " + obj2.campoStatic);
        System.out.println("ClaseB: " + ClaseB.campoStatic + "\n");

    } // Fin del método main
} // Fin de la clase PruebaClaseB