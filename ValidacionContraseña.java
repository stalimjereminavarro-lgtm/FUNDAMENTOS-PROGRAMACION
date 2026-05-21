import java.util.Scanner;

public class ValidacionContraseña {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una contraseña numérica: ");
        int contrasena = entrada.nextInt();

        if (contrasena > 1000 && contrasena < 9999) {
            System.out.println("Contraseña válida");
        }

        if (!(contrasena > 1000 && contrasena < 9999)) {
            System.out.println("Contraseña inválida");
        }

    }

}