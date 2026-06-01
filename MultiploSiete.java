public class MultiploSiete {
    public static void main(String[] args) {

        for (int i = 10; i <= 100; i++) {

            if (i % 7 == 0) {
                System.out.println("Primer múltiplo: " + i);
                break;
            }
        }
    }
}