package c07.p03.dos;

import c07.p03.uno.Alfa;

public class Gama {

    public Gama() {
        Alfa alfa = new Alfa();

        alfa.campoPublic = 0;
        // alfa.campoDefault = 0; /* No se tiene acceso */
        // alfa.campoProtected = 0; /* No se tiene acceso */
        // alfa.campoPrivate = 0; /* No se tiene acceso */
    } // Fin del constructor

} // Fin de la clase Gama