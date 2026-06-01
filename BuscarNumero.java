import java.util.Scanner;

public class BuscarNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = {5, 8, 12, 20, 30};

        System.out.print("Número a buscar: ");
        int buscar = sc.nextInt();

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == buscar) {
                System.out.println("Encontrado en la posición " + i);
                break;
            }
        }
    }
}