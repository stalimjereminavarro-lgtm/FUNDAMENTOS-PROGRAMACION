package c06.p03;

class PruebaPersona {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.imprimirCampos();

        persona.setNombre("Alex");
        persona.setEdad(20);

        persona.imprimirCampos();

    } // Fin del método main
} // Fin de la clase PruebaPersona