import java.util.Scanner;

public class ContadorPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int contador = 0;

        System.out.println("Ingrese números (0 para terminar):");

        while (true) {
            num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if (num > 0) {
                contador++;
            }
        }

        System.out.println("Cantidad de positivos: " + contador);
    }
}