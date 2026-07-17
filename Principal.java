package c06.p10;

public class Principal {
    public static void main(String[] args) {
        Persona objeto1 = new Persona();
        objeto1.edad = 15;
        System.out.println("Edad (antes):" + objeto1.edad);
        
        Acciones.imprimeCambioDeEdad(objeto1);
        
        System.out.println("Edad (después): " + objeto1.edad);

    } // Fin del método main
} // Fin de la clase Principal