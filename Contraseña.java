import java.util.Scanner;

public class Contraseña {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String clave;

        do {
            System.out.print("Ingrese la contraseña: ");
            clave = sc.nextLine();
        } while (!clave.equals("1234"));

        System.out.println("Acceso concedido");
    }
}