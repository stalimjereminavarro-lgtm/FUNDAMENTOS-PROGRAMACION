import java.util.Scanner;

public class ContraseñaSegura {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una contraseña: ");
        String contrasena = entrada.nextLine();

        boolean mayuscula = false;
        boolean numero = false;
        boolean simbolo = false;

        if (contrasena.length() >= 8) {
            System.out.println("Tiene mínimo 8 caracteres");
        } else {
            System.out.println("Falta longitud mínima");
        }

        for (int i = 0; i < contrasena.length(); i++) {

            char c = contrasena.charAt(i);

            if (Character.isUpperCase(c)) {
                mayuscula = true;
            }

            if (Character.isDigit(c)) {
                numero = true;
            }

            if (!Character.isLetterOrDigit(c)) {
                simbolo = true;
            }

        }

        if (mayuscula) {
            System.out.println("Contiene mayúscula");
        } else {
            System.out.println("Falta mayúscula");
        }

        if (numero) {
            System.out.println("Contiene número");
        } else {
            System.out.println("Falta número");
        }

        if (simbolo) {
            System.out.println("Contiene símbolo");
        } else {
            System.out.println("Falta símbolo");
        }

        if (contrasena.length() >= 8 &&
            mayuscula &&
            numero &&
            simbolo) {

            System.out.println("Contraseña segura");

        } else {

            System.out.println("Contraseña insegura");

        }

    }

}