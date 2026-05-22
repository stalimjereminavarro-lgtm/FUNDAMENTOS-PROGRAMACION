import java.util.Scanner;

public class Estacionamiento {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("1. Moto");
        System.out.println("2. Auto");
        System.out.println("3. Camión");

        System.out.print("Seleccione el tipo de vehículo: ");
        int vehiculo = entrada.nextInt();

        System.out.print("Ingrese las horas: ");
        int horas = entrada.nextInt();

        double tarifa = 0;
        double total = 0;

        switch (vehiculo) {

            case 1:

                tarifa = 3;

                break;

            case 2:

                tarifa = 5;

                break;

            case 3:

                tarifa = 10;

                break;

            default:

                System.out.println("Vehículo inválido");

                break;

        }

        if (horas > 0 && tarifa > 0) {

            total = tarifa * horas;

            System.out.println("Total a pagar: S/ " + total);

        }

        if (horas <= 0) {

            System.out.println("Horas inválidas");

        }

    }

}