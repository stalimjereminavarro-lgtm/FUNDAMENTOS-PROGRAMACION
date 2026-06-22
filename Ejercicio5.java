import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese texto: ");
            String texto = sc.nextLine();

            if (texto.equalsIgnoreCase("salir")) {
                break;
            }

            System.out.println("Ingresó: " + texto);
        }
    }
}