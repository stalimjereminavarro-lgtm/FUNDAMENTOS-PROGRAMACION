import java.util.Scanner;

public class CajeroAutomatico {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int pinCorrecto = 987231355;
        int intentos = 0;

        double saldo = 1999;
        double limiteDiario = 4323;

        while (intentos < 3) {

            System.out.print("Ingrese su PIN: ");
            int pin = entrada.nextInt();

            if (pin == pinCorrecto) {

                System.out.println("PIN correcto");

                System.out.println("1. Ver saldo");
                System.out.println("2. Retirar dinero");

                System.out.print("Seleccione una opción: ");
                int opcion = entrada.nextInt();

                if (opcion == 1) {

                    System.out.println("Su saldo es: " + saldo);

                } else {

                    if (opcion == 2) {

                        System.out.print("Ingrese el monto a retirar: ");
                        double retiro = entrada.nextDouble();

                        if (retiro > limiteDiario) {

                            System.out.println("Supera el límite diario");

                        } else {

                            if (retiro > saldo) {

                                System.out.println("Fondos insuficientes");

                            } else {

                                saldo = saldo - retiro;

                                System.out.println("Retiro exitoso");
                                System.out.println("Saldo restante: " + saldo);

                            }

                        }

                    } else {

                        System.out.println("Opción inválida");

                    }

                }

                intentos = 3;

            } else {

                intentos++;

                System.out.println("PIN incorrecto");

                if (intentos == 3) {
                    System.out.println("Cuenta bloqueada");
                }

            }

        }

    }

}