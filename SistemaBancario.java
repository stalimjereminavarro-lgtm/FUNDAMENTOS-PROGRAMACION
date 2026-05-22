import java.util.Scanner;

public class SistemaBancario {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double saldo = 1000;

        System.out.println("1. Depositar");
        System.out.println("2. Retirar");
        System.out.println("3. Consultar saldo");
        System.out.println("4. Salir");

        System.out.print("Seleccione una opción: ");
        int opcion = entrada.nextInt();

        switch (opcion) {

            case 1:

                System.out.print("Ingrese monto a depositar: ");
                double deposito = entrada.nextDouble();

                if (deposito > 0) {

                    saldo = saldo + deposito;

                    System.out.println("Depósito realizado");
                    System.out.println("Saldo actual: " + saldo);

                }

                if (deposito <= 0) {

                    System.out.println("Monto inválido");

                }

                break;

            case 2:

                System.out.print("Ingrese monto a retirar: ");
                double retiro = entrada.nextDouble();

                if (retiro > saldo) {

                    System.out.println("Saldo insuficiente");

                }

                if (retiro <= 0) {

                    System.out.println("Monto inválido");

                }

                if (retiro > 0 && retiro <= saldo) {

                    saldo = saldo - retiro;

                    System.out.println("Retiro realizado");
                    System.out.println("Saldo actual: " + saldo);

                }

                break;

            case 3:

                System.out.println("Saldo disponible: " + saldo);

                break;

            case 4:

                System.out.println("Saliendo del sistema");

                break;

            default:

                System.out.println("Opción inválida");

                break;

        }

    }

}