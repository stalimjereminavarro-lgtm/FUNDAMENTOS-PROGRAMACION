package c07.p01;

public class Principal {
    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.setNombre("Alberto");
        persona1.setApellidoPaterno("Arenas");
        persona1.setApellidoMaterno("Aguirre");

        persona1.imprimirCampos();

    } // Fin del método main
} // Fin de la clase Principal