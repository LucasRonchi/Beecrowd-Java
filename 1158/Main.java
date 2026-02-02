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

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int sum = 0;

            if (x % 2 == 0) {
                x += 1;
            }

            for (int j = 0; j < y; j++) {
                sum += x + (j * 2);
            }

            System.out.println(sum);
        }   

        scanner.close();
    }
}
