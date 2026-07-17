package c05.p05;

class PruebaOperaciones {
    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();

        operaciones.concatenarTexto("Primero", "Segundo");
        operaciones.concatenarTexto("Tercero", "Cuarto");

        operaciones.imprimirSuma(10, 20);
        operaciones.imprimirSuma(30, 40);

    } // Fin del método main
} // Fin de la Clase PruebaOperaciones