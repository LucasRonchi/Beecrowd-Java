import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double[] test = {0.0, 0.0, 0.0};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                test[j] = scanner.nextDouble();
            }

            double mean = (test[0] * 2 + test[1] * 3 + test[2] * 5) / 10;

            System.out.printf("%.1f%n", mean);
        }

        scanner.close();
    }
}
