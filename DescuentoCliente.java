import java.util.Scanner;

public class DescuentoCliente {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el monto de compra: ");
        double monto = entrada.nextDouble();

        System.out.print("Ingrese el tipo de cliente (VIP o NORMAL): ");
        String cliente = entrada.next();

        if (monto > 500 && cliente.equals("VIP")) {
            System.out.println("Tiene 20% de descuento");
        }

        if (monto > 500 && !cliente.equals("VIP")) {
            System.out.println("Tiene 10% de descuento");
        }

        if (monto <= 500) {
            System.out.println("No tiene descuento");
        }

    }

}