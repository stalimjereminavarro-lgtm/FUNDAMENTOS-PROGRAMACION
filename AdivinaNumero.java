import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secreto = (int)(Math.random() * 100) + 1;
        int intento = 0;

        while (intento != secreto) {
            System.out.print("Adivina el número (1-100): ");
            intento = sc.nextInt();

            if (intento < secreto) {
                System.out.println("Muy bajo");
            } else if (intento > secreto) {
                System.out.println("Muy alto");
            }
        }

        System.out.println("¡Correcto!");
    }
}