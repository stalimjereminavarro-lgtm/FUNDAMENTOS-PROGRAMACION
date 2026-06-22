import java.util.Scanner;

public class InvertirNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        int invertido = 0;
        int temp = numero;

        for (; temp != 0; temp /= 10) {
            invertido = invertido * 10 + temp % 10;
        }

        System.out.println("Número invertido: " + invertido);

        sc.close();
    }
}