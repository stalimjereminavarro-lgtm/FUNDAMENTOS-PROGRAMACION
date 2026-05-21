import java.util.Scanner;

public class SalarioBonificacion {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el salario: ");
        double salario = entrada.nextDouble();

        System.out.print("Ingrese los años de trabajo: ");
        int anios = entrada.nextInt();

        if (anios > 5 && salario < 2000) {
            System.out.println("Tiene bono");
        }

        if ((anios > 5 && salario >= 2000) ||
            (anios <= 5 && salario < 2000)) {

            System.out.println("Tiene bono menor");
        }

        if (anios <= 5 && salario >= 2000) {
            System.out.println("No tiene bono");
        }

    }

}