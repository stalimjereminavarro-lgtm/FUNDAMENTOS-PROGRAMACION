import java.util.Scanner;

public class EdadValida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;

        do {
            System.out.print("Ingrese edad (0-120): ");
            edad = sc.nextInt();
        } while (edad < 0 || edad > 120);

        System.out.println("Edad válida");
    }
}