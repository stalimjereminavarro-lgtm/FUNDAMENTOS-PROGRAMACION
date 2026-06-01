import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();

        long factorial = 1;

        while (num > 0) {
            factorial *= num;
            num--;
        }

        System.out.println("Factorial = " + factorial);
    }
}