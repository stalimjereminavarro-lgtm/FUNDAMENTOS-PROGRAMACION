package c07.p03.uno;

public class Beta {

    public Beta() {
        Alfa alfa = new Alfa();
        alfa.campoPublic = 0;
        alfa.campoDefault = 0;
        alfa.campoProtected = 0;
        // alfa.campoPrivate = 0; /* No se tiene acceso */
    } // Fin del constructor

} // Fin de la clase Beta