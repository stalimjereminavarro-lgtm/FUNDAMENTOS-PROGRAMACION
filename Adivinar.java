import java.util.Scanner;

public class Adivinar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secreto = (int)(Math.random() * 10) + 1;
        int num;

        do {
            System.out.print("Adivina el número (1-10): ");
            num = sc.nextInt();
        } while (num != secreto);

        System.out.println("¡Correcto!");
    }
}
