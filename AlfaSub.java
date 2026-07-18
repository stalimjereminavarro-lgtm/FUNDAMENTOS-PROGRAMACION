package c07.p03.dos;

import c07.p03.uno.Alfa;

public class AlfaSub extends Alfa {

    public AlfaSub() {
        Alfa alfa = new Alfa();

        alfa.campoPublic = 0;
        // alfa.campoDefault = 0; /* No se tiene acceso */
        // alfa.campoProtected = 0; /* No se tiene acceso */
        // alfa.campoPrivate = 0; /* No se tiene acceso */

        campoPublic = 0;
        // campoDefault = 0; /* No se tiene acceso */
        campoProtected = 0;
        // campoPrivate = 0; /* No se tiene acceso */
    } // Fin del constructor

} // Fin de la clase AlfaSub