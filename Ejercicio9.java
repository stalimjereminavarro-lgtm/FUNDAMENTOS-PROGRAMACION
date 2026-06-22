public class Ejercicio9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {

            if (i % 17 == 0) {
                System.out.println("Múltiplo de 17 encontrado: " + i);
                break;
            }

            System.out.println(i);
        }
    }
}