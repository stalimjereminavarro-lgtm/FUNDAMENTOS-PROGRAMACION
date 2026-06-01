import java.util.Scanner;

public class PromedioNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de números: ");
        int n = sc.nextInt();

        double suma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Número " + i + ": ");
            suma += sc.nextDouble();
        }

        System.out.println("Promedio = " + (suma / n));
    }
}