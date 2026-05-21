import java.util.Scanner;

public class AñoBisiesto {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int anio = entrada.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año es bisiesto");
        }

        if (!((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0))) {
            System.out.println("El año no es bisiesto");
        }

    }

}