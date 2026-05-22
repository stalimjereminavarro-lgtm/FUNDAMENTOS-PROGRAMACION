import java.util.Scanner;

public class TarifasTransporte {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la distancia en km: ");
        double distancia = entrada.nextDouble();

        System.out.print("Ingrese el tipo de usuario (estudiante, adulto, adultoMayor): ");
        String usuario = entrada.next();

        System.out.print("Ingrese el horario (normal o nocturno): ");
        String horario = entrada.next();

        double tarifa = distancia * 3.5;

        if (usuario.equals("estudiante")) {

            tarifa = tarifa - (tarifa * 0.30);

        } else {

            if (usuario.equals("adultoMayor")) {

                tarifa = tarifa - (tarifa * 0.50);

            }

        }

        if (horario.equals("nocturno")) {

            tarifa = tarifa + (tarifa * 0.20);

        }

        System.out.println("Tarifa total: " + tarifa);

    }

}