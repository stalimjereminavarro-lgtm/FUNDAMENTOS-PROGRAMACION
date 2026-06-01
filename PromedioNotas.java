import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota;
        double suma = 0;
        int contador = 0;

        System.out.println("Ingrese notas (-1 para terminar):");

        while (true) {
            nota = sc.nextDouble();

            if (nota == -1) {
                break;
            }

            suma += nota;
            contador++;
        }

        if (contador > 0) {
            System.out.println("Promedio: " + (suma / contador));
        } else {
            System.out.println("No se ingresaron notas.");
        }
    }
}