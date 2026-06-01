import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cantidad de términos: ");
        int n = sc.nextInt();

        int a = 0, b = 1, contador = 1;

        while (contador <= n) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;

            contador++;
        }
    }
}