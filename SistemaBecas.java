import java.util.Scanner;

public class SistemaBecas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el promedio: ");
        double promedio = entrada.nextDouble();

        System.out.print("Ingrese los ingresos familiares: ");
        double ingresos = entrada.nextDouble();

        System.out.print("Ingrese el número de cursos desaprobados: ");
        int cursos = entrada.nextInt();

        if (promedio >= 16 && ingresos < 2000 && cursos == 0) {

            System.out.println("Recibe beca completa");

        } else {

            if ((promedio >= 16 && ingresos < 2000) ||
                (promedio >= 18 && cursos <= 1)) {

                System.out.println("Recibe beca parcial");

            } else {

                System.out.println("No recibe beca");

            }

        }

    }

}