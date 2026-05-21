import java.util.Scanner;

public class EvaluacionTriangulo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el lado 1: ");
        int lado1 = entrada.nextInt();

        System.out.print("Ingrese el lado 2: ");
        int lado2 = entrada.nextInt();

        System.out.print("Ingrese el lado 3: ");
        int lado3 = entrada.nextInt();

        if (lado1 + lado2 > lado3 &&
            lado1 + lado3 > lado2 &&
            lado2 + lado3 > lado1) {

            System.out.println("Sí forman un triángulo");

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triángulo es equilátero");
            }

            if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {

                if (!(lado1 == lado2 && lado2 == lado3)) {
                    System.out.println("El triángulo es isósceles");
                }

            }

            if (lado1 != lado2 &&
                lado1 != lado3 &&
                lado2 != lado3) {

                System.out.println("El triángulo es escaleno");
            }

        }

        if (!(lado1 + lado2 > lado3 &&
              lado1 + lado3 > lado2 &&
              lado2 + lado3 > lado1)) {

            System.out.println("No forman un triángulo");
        }

    }

}