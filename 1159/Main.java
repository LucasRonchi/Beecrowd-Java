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
            int n = scanner.nextInt();

            if (n == 0) {
                break;
            }

            if (n % 2 != 0) {
                n++;
            }

            int sum = 0;

            for (int i = 0; i <= 8; i += 2) {
                sum += n + i;
            }

            System.out.println(sum);
        }

        scanner.close();
    }
}
