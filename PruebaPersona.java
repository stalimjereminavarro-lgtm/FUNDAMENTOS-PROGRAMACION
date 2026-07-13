class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();

        // Se imprimen los valores iniciales del objeto "persona1"
        System.out.println("Nombre: " + persona1.nombre);
        System.out.println("Ap. Paterno: " + persona1.apellidoPaterno);
        System.out.println("Ap. Materno: " + persona1.apellidoMaterno);
        System.out.println("Edad: " + persona1.edad);
        System.out.println("Peso: " + persona1.peso);

        // Se asignan valores a los campos del objeto "persona1"
        persona1.nombre = "Alex";
        persona1.apellidoPaterno = "Torres";
        persona1.apellidoMaterno = "Flores";
        persona1.edad = 20;
        persona1.peso = 56;

        // Se imprimen los valores del objeto "persona1"
        System.out.println();
        System.out.println("Nombre: " + persona1.nombre);
        System.out.println("Ap. Paterno: " + persona1.apellidoPaterno);
        System.out.println("Ap. Materno: " + persona1.apellidoMaterno);
        System.out.println("Edad: " + persona1.edad);
        System.out.println("Peso: " + persona1.peso);

    } // Fin del método main
} // Fin de la clase PruebaPersona