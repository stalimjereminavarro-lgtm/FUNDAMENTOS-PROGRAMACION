import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius, fahrenheit;
        String resp;

        do {
            System.out.print("Ingrese grados Celsius: ");
            celsius = sc.nextDouble();

            fahrenheit = (celsius * 9 / 5) + 32;

            System.out.println("Fahrenheit: " + fahrenheit);

            System.out.print("¿Desea continuar? (s/n): ");
            resp = sc.next();
        } while (resp.equalsIgnoreCase("s"));
    }
}