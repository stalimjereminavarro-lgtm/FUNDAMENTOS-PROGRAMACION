import java.util.Scanner;

public class InstruccionIf {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("===== VERIFICAR MAYOR DE EDAD =====");

        System.out.print("Ingrese una edad: ");
        int edad = entrada.nextInt();

        if (edad >= 18) {
            System.out.println("La persona es mayor de edad.");
        }

        System.out.println("Adios");
        entrada.close();
    }

}