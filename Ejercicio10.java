public class Ejercicio10 {
    public static void main(String[] args) {
        String texto = "Yo estudio  en la UPLA y programo java";

        String[] palabras = texto.split(" ");

        for (String palabra : palabras) {
            if (palabra.length() < 3) {
                continue;
            }

            System.out.println(palabra);
        }
    }
}