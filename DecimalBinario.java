import java.util.Scanner;

public class DecimalBinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número decimal: ");
        int num = sc.nextInt();

        String binario = "";

        while (num > 0) {
            binario = (num % 2) + binario;
            num /= 2;
        }

        System.out.println("Binario: " + binario);
    }
}