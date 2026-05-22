import java.util.Scanner;

public class EvaluadorNumeros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo");
        } else {

            if (numero < 0) {
                System.out.println("El número es negativo");
            } else {
                System.out.println("El número es cero");
            }

        }

        if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

        if (numero % 3 == 0 && numero % 5 == 0) {

            System.out.println("Es múltiplo de 3 y 5");

        } else {

            if (numero % 3 == 0) {

                System.out.println("Es múltiplo de 3");

            } else {

                if (numero % 5 == 0) {
                    System.out.println("Es múltiplo de 5");
                }

            }

        }

    }

}