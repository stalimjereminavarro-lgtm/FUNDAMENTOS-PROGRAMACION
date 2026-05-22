import java.util.Scanner;

public class SistemaLogin {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String usuarioCorrecto = "stalim";
        String contrasenaCorrecta = "987231355";

        int intentos = 0;

        while (intentos < 3) {

            System.out.print("Ingrese usuario: ");
            String usuario = entrada.next();

            System.out.print("Ingrese contraseña: ");
            String contrasena = entrada.next();

            if (usuario.equals(usuarioCorrecto) &&
                contrasena.equals(contrasenaCorrecta)) {

                System.out.println("Inicio de sesión exitoso");

                intentos = 3;

            } else {

                intentos++;

                System.out.println("Usuario o contraseña incorrectos");

                if (intentos == 3) {
                    System.out.println("Cuenta bloqueada");
                }

            }

        }

    }

}