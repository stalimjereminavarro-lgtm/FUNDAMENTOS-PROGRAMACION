package c06.p01;

class PruebaPersona {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.imprimirCampos();
        persona.nombre = "Alex";
        persona.edad = 20;
        persona.imprimirCampos();

    } // Fin del método main
} // Fin de la clase PruebaPersona