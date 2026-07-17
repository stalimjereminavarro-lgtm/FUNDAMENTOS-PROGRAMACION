package c06.p05;

public class PruebaRectangulo {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo();
        Rectangulo rectangulo2 = new Rectangulo(7, 11);
        Rectangulo rectangulo3 = new Rectangulo(13, 17);

        rectangulo1.imprimirCampos();
        rectangulo2.imprimirCampos();
        rectangulo3.imprimirCampos();

    } // Fin del método main
} // Fin de la clase PruebaRectangulo