import java.io.IOException;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    public static void main(String[] args) throws IOException {
        double s = 1;

        for (int i = 3, j = 1; i <= 39; i += 2, j++) {
            s += (double) i / Math.pow(2, j);
        }

        System.out.printf("%.2f%n", s);
    }
}
