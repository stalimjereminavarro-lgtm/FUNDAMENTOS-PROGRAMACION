import java.util.Scanner;

public class MultiplosCombinados {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("FizzBuzz");
        }

        if (numero % 3 == 0 && numero % 5 != 0) {
            System.out.println("Fizz");
        }

        if (numero % 5 == 0 && numero % 3 != 0) {
            System.out.println("Buzz");
        }

    }

}