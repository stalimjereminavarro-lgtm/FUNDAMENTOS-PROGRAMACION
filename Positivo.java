import java.util.Scanner;

public class Positivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Ingrese un número positivo: ");
            num = sc.nextInt();
        } while (num <= 0);

        System.out.println("Número válido: " + num);
    }
}