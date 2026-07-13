class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();

        // Se imprimen los valores iniciales del objeto "persona1"
        persona1.imprimirCampos();
        System.out.println();

        // Se asignan valores a los campos del objeto "persona1"
        persona1.nombre = "Alex";
        persona1.apellidoPaterno = "Torres";
        persona1.apellidoMaterno = "Flores";
        persona1.edad = 20;
        persona1.peso = 56;

        // Se imprimen los valores del objeto "persona1"
        persona1.imprimirCampos();

    } // Fin del método main
} // Fin de la clase PruebaPersona