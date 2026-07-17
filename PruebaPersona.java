package c06.p02;

class PruebaPersona {
    public static void main(String[] args) {
        Persona persona = new Persona();

        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());

        persona.setNombre("Alex");
        persona.setEdad(20);

        persona.imprimirCampos();

    } // Fin del método main
} // Fin de la clase PruebaPersona