import java.util.Scanner;

public class ImpuestoProgresivo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el monto: ");
        double monto = entrada.nextDouble();

        double impuesto;

        if (monto < 0) {

            System.out.println("Monto inválido");

        } else {

            if (monto >= 0 && monto <= 1000) {

                impuesto = monto * 0.05;
                System.out.println("Impuesto: " + impuesto);

            } else {

                if (monto >= 1001 && monto <= 5000) {

                    impuesto = monto * 0.10;
                    System.out.println("Impuesto: " + impuesto);

                } else {

                    impuesto = monto * 0.20;
                    System.out.println("Impuesto: " + impuesto);

                }

            }

        }

    }

}  