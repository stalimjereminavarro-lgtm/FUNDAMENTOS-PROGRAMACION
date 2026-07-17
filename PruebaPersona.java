package c06.p04;

class PruebaPersona {
    public static void main(String[] args) {
        Persona persona = new Persona("Alex", 20);

        persona.imprimirCampos();

        persona.setNombre("Beto");
        persona.setEdad(19);

        persona.imprimirCampos();

    } // Fin del método main
} // Fin de la clase PruebaPersona