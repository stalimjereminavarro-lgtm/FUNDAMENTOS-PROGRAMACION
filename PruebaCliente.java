package c07.p02;

public class PruebaCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();

        cliente1.setNombre("Alberto");
        cliente1.setApellidoPaterno("Arenas");
        cliente1.setApellidoMaterno("Aguirre");
        cliente1.setNumeroDeCliente(1001);

        cliente1.imprimirCampos();

    } // Fin del método main
} // Fin de la clase PruebaCliente