package c06.p09;

public class Principal {
    public static void main(String[] args) {
        int variable1 = 50;
        System.out.println("Variable (antes):" + variable1);
        
        Acciones.imprimeIncremento(variable1);
        
        System.out.println("Variable (después): " + variable1);

    } // Fin del método main
} // Fin de la clase Principal