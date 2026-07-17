package c05.p06;

class PruebaOperaciones {
    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();

        int resultado = operaciones.sumar(10, 20);
        System.out.println( resultado );

        System.out.println( operaciones.restar(30, 9) );

        System.out.println( operaciones.cuadrado(11) );

    } // Fin del método main
} // Fin de la Clase PruebaOperaciones