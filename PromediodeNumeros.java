import java.util.Scanner;

public class PromediodeNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números desea ingresar?: ");
        int n = sc.nextInt();

        double suma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            suma += sc.nextDouble();
        }

        double promedio = suma / n;

        System.out.println("El promedio es: " + promedio);

        sc.close();
    }
}