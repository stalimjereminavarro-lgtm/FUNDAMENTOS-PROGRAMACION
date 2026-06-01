import java.util.Scanner;

public class ContarPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inicio: ");
        int inicio = sc.nextInt();

        System.out.print("Fin: ");
        int fin = sc.nextInt();

        int contador = 0;

        for (int num = inicio; num <= fin; num++) {
            int divisores = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) {
                contador++;
            }
        }

        System.out.println("Cantidad de primos: " + contador);
    }
}