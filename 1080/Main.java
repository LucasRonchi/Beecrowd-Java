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

        int n;
        int max = Integer.MIN_VALUE;
        int position = 0;

        for (int i = 1; i <= 100; i++) {
            n = scanner.nextInt();

            if (n > max) {
                max = n;
                position = i;
            }
        }
        System.out.println(max);
        System.out.println(position);

        scanner.close();
    }
}
