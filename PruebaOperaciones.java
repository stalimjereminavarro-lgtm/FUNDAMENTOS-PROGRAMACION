package c05.p07;

class PruebaOperaciones {
    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();

        operaciones.mostrarDatos(99);
        operaciones.mostrarDatos("Hola");
        operaciones.mostrarDatos(99, "Hola");
        operaciones.mostrarDatos("Hola", 99);

    } // Fin del método main
} // Fin de la Clase PruebaOperaciones