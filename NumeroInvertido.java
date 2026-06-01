import java.util.Scanner;

public class NumeroInvertido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();

        int invertido = 0;

        while (num != 0) {
            invertido = invertido * 10 + num % 10;
            num /= 10;
        }

        System.out.println("Número invertido: " + invertido);
    }
}