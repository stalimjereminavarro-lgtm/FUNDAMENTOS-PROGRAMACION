import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int menor = Integer.MAX_VALUE;

        System.out.println("Ingrese números (0 para terminar):");

        while (true) {
            num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if (num < menor) {
                menor = num;
            }
        }

        System.out.println("El menor número es: " + menor);
    }
}