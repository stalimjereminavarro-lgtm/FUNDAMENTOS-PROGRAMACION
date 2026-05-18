import java.util.Scanner;

public class SistemaAcceso {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el usuario: ");
        String usuario = entrada.nextLine();

        System.out.print("Ingrese la contraseña: ");
        int contraseña = entrada.nextInt();

        if (usuario.equals("admin") && contraseña == 1234) {
            System.out.println("Acceso correcto");
        } else {
            System.out.println("Acceso denegado");
        }

        entrada.close();
    }

}