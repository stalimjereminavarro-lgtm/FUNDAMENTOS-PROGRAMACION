import java.util.Scanner;

public class RendimientoLaboral {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la puntualidad (0-20): ");
        int puntualidad = entrada.nextInt();

        System.out.print("Ingrese la productividad (0-20): ");
        int productividad = entrada.nextInt();

        System.out.print("Ingrese el cumplimiento (0-20): ");
        int cumplimiento = entrada.nextInt();

        int promedio = (puntualidad + productividad + cumplimiento) / 3;

        if (promedio >= 18) {

            System.out.println("Excelente");

        } else {

            if (promedio >= 14) {

                System.out.println("Bueno");

            } else {

                if (promedio >= 11) {

                    System.out.println("Regular");

                } else {

                    System.out.println("Deficiente");

                }

            }

        }

    }

}