public class Ejercicio7 {
    public static void main(String[] args) {
        String texto = "Hola Mundo Java";

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c == ' ') {
                continue;
            }

            System.out.print(c);
        }
    }
}