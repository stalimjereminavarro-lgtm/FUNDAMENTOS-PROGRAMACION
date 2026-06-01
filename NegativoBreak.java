import java.util.Scanner;

public class NegativoBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        while (true) {
            System.out.print("Ingrese un número: ");
            num = sc.nextInt();

            if (num < 0) {
                break;
            }

            System.out.println("Número: " + num);
        }

        System.out.println("Se ingresó un número negativo.");
    }
}