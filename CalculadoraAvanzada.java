import java.util.Scanner;

public class CalculadoraAvanzada {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Potencia");

        System.out.print("Seleccione una opción: ");
        int opcion = entrada.nextInt();

        System.out.print("Ingrese el primer número: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = entrada.nextDouble();

        switch (opcion) {

            case 1:

                System.out.println("Resultado: " + (numero1 + numero2));

                break;

            case 2:

                System.out.println("Resultado: " + (numero1 - numero2));

                break;

            case 3:

                System.out.println("Resultado: " + (numero1 * numero2));

                break;

            case 4:

                if (numero2 == 0) {

                    System.out.println("No se puede dividir entre cero");

                }

                if (numero2 != 0) {

                    System.out.println("Resultado: " + (numero1 / numero2));

                }

                break;

            case 5:

                double potencia = Math.pow(numero1, numero2);

                System.out.println("Resultado: " + potencia);

                break;

            default:

                System.out.println("Opción inválida");

                break;

        }

    }

}