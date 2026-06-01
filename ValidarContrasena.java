import java.util.Scanner;

public class ValidarContrasena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String claveCorrecta = "java123";
        String clave = "";

        while (!clave.equals(claveCorrecta)) {
            System.out.print("Ingrese la contraseña: ");
            clave = sc.nextLine();

            if (!clave.equals(claveCorrecta)) {
                System.out.println("Contraseña incorrecta");
            }
        }

        System.out.println("Acceso concedido");
    }
}