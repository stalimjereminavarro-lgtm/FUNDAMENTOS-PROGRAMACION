package c06.p08;

public class PruebaOperaciones {
    public static void main(String[] args) {
        Operaciones obj1 = new Operaciones();

        System.out.println(obj1.sumar(10, 20));
        System.out.println(Operaciones.sumar(10, 20));

        System.out.println(obj1.restar(30, 20));
        System.out.println(Operaciones.restar(30, 20));

    } // Fin del método main
} // Fin de la clase PruebaOperaciones