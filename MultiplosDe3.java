import java.util.Scanner;

public class MultiplosDe3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese N: ");
        int N = sc.nextInt();

        int contador = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0) {
                contador++;
            }
        }

        System.out.println("Cantidad de múltiplos de 3: " + contador);

        sc.close();
    }
}