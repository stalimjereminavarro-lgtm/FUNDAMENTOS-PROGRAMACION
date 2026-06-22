public class Ejercicio3 {
    public static void main(String[] args) {
        int[] numeros = {5, 8, 12, 20, 35};

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 20) {
                System.out.println("Número encontrado");
                break;
            }
        }
    }
}