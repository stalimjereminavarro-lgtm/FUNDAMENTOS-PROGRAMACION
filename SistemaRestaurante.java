import java.util.Scanner;

public class SistemaRestaurante {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("1. Desayuno");
        System.out.println("2. Almuerzo");
        System.out.println("3. Cena");

        System.out.print("Seleccione una opción: ");
        int opcion = entrada.nextInt();

        switch (opcion) {

            case 1:

                System.out.println("1. Chocolate caliente");
                System.out.println("2. Tamal");

                System.out.print("Seleccione un plato: ");
                int desayuno = entrada.nextInt();

                switch (desayuno) {

                    case 1:
                        System.out.println("Chocolate caliente - S/ 7");
                        break;

                    case 2:
                        System.out.println("Tamal - S/ 6");
                        break;

                    default:
                        System.out.println("Plato inválido");
                        break;

                }

                break;

            case 2:

                System.out.println("1. Tallarines verdes");
                System.out.println("2. Pollo a la brasa");

                System.out.print("Seleccione un plato: ");
                int almuerzo = entrada.nextInt();

                switch (almuerzo) {

                    case 1:
                        System.out.println("Tallarines verdes - S/ 18");
                        break;

                    case 2:
                        System.out.println("Pollo a la brasa - S/ 25");
                        break;

                    default:
                        System.out.println("Plato inválido");
                        break;

                }

                break;

            case 3:

                System.out.println("1. Hamburguesa");
                System.out.println("2. Pizza personal");

                System.out.print("Seleccione un plato: ");
                int cena = entrada.nextInt();

                switch (cena) {

                    case 1:
                        System.out.println("Hamburguesa - S/ 14");
                        break;

                    case 2:
                        System.out.println("Pizza personal - S/ 16");
                        break;

                    default:
                        System.out.println("Plato inválido");
                        break;

                }

                break;

            default:

                System.out.println("Opción inválida");

                break;

        }

    }

}