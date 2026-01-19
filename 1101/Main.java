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

        while (true) {
            int m = scanner.nextInt();
            if (m <= 0) {
                break;
            }
            int n = scanner.nextInt();
            if (n <= 0) {
                break;
            }

            int start = Math.min(m, n);
            int end = Math.max(m, n);

            int sum = 0;

            for (int i = start; i <= end; i++) {
                System.out.print(i + " ");
                sum += i;
            }

            System.out.println("Sum=" + sum);
        }
        
        scanner.close();
    }
}
