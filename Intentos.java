import java.util.Scanner;

public class Intentos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, intentos = 0;

        do {
            System.out.print("Ingrese un número entre 1 y 10: ");
            num = sc.nextInt();
            intentos++;
        } while (num < 1 || num > 10);

        System.out.println("Intentos realizados: " + intentos);
    }
}