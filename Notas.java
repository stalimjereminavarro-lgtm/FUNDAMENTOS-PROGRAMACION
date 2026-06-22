import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota, suma = 0;
        int contador = 0;
        String resp;

        do {
            System.out.print("Ingrese nota: ");
            nota = sc.nextDouble();

            suma += nota;
            contador++;

            System.out.print("¿Desea continuar? (s/n): ");
            resp = sc.next();
        } while (resp.equalsIgnoreCase("s"));

        System.out.println("Promedio: " + (suma / contador));
    }
}