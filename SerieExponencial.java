import java.util.Scanner;

public class SerieExponencial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese x: ");
        int x = sc.nextInt();

        System.out.print("Ingrese n: ");
        int n = sc.nextInt();

        int suma = 1;

        for (int i = 1; i <= n; i++) {
            suma += Math.pow(x, i);
        }

        System.out.println("Resultado = " + suma);
    }
}