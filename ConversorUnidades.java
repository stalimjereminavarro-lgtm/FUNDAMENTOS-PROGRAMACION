import java.util.Scanner;

public class ConversorUnidades {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("1. Metros a kilómetros");
        System.out.println("2. Kilómetros a metros");
        System.out.println("3. Celsius a Fahrenheit");
        System.out.println("4. Fahrenheit a Celsius");

        System.out.print("Seleccione una opción: ");
        int opcion = entrada.nextInt();

        switch (opcion) {

            case 1:

                System.out.print("Ingrese metros: ");
                double metros = entrada.nextDouble();

                double kilometros = metros / 1000;

                System.out.println("Kilómetros: " + kilometros);

                break;

            case 2:

                System.out.print("Ingrese kilómetros: ");
                double km = entrada.nextDouble();

                double metrosResultado = km * 1000;

                System.out.println("Metros: " + metrosResultado);

                break;

            case 3:

                System.out.print("Ingrese grados Celsius: ");
                double celsius = entrada.nextDouble();

                double fahrenheit = (celsius * 9 / 5) + 32;

                System.out.println("Fahrenheit: " + fahrenheit);

                break;

            case 4:

                System.out.print("Ingrese grados Fahrenheit: ");
                double fahr = entrada.nextDouble();

                double celsiusResultado = (fahr - 32) * 5 / 9;

                System.out.println("Celsius: " + celsiusResultado);

                break;

            default:

                System.out.println("Opción inválida");

                break;

        }

    }

}