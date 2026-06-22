import java.util.Scanner;

public class VocalesTexto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        String texto = sc.nextLine();

        System.out.println("Vocales encontradas:");

        for (int i = 0; i < texto.length(); i++) {
            char c = Character.toLowerCase(texto.charAt(i));

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.print(c + " ");
            }
        }

        sc.close();
    }
}