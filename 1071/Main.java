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

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int start = Math.min(n1, n2) + 1;
        int end = Math.max(n1, n2);

        int sum = 0;

        for (int i = start; i < end; i++) {
            if (i % 2 != 0.0) {
                sum += i;
            }
        }

        System.out.println(sum);

        scanner.close();
    }
}
