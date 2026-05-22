import java.util.Scanner;

public class ControldeAcceso {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tipo de usuario: ");
        String usuario = entrada.next().toUpperCase();

        switch (usuario) {

            case "STALIM":

                System.out.println("Acceso total");

                break;

            case "USER":

                System.out.println("Acceso parcial");

                break;

            case "GUEST":

                System.out.println("Solo lectura");

                break;

            default:

                System.out.println("Rol inválido");

                break;

        }

    }

}