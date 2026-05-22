import java.util.Scanner;

public class OperacionesLogicas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el operador (AND, OR, XOR): ");
        String operador = entrada.next().toUpperCase();

        System.out.print("Ingrese el primer valor booleano (verdadero/falso ): ");
        boolean valor1 = entrada.nextBoolean();

        System.out.print("Ingrese el segundo valor booleano (verdadero/falso): ");
        boolean valor2 = entrada.nextBoolean();

        switch (operador) {

            case "AND":

                System.out.println("Resultado: " + (valor1 && valor2));

                break;

            case "OR":

                System.out.println("Resultado: " + (valor1 || valor2));

                break;

            case "XOR":

                System.out.println("Resultado: " + (valor1 ^ valor2));

                break;

            default:

                System.out.println("Operador inválido");

                break;

        }

    }

}