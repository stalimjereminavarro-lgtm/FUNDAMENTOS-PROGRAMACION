import java.util.Scanner;

public class RiesgoCrediticio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el ingreso mensual: ");
        double ingreso = entrada.nextDouble();

        System.out.print("Ingrese el historial crediticio (bueno, regular, malo): ");
        String historial = entrada.next();

        System.out.print("Ingrese la edad: ");
        int edad = entrada.nextInt();

        if (ingreso >= 3000) {

            if (historial.equals("bueno")) {

                if (edad >= 21) {
                    System.out.println("Bajo riesgo");
                } else {
                    System.out.println("Medio riesgo");
                }

            } else {

                if (historial.equals("regular")) {
                    System.out.println("Medio riesgo");
                } else {
                    System.out.println("Alto riesgo");
                }

            }

        } else {

            if (historial.equals("malo")) {
                System.out.println("Alto riesgo");
            } else {
                System.out.println("Medio riesgo");
            }

        }

    }

}