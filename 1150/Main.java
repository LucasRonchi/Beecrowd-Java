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

        int x = scanner.nextInt();
        int z;

        do {
            z = scanner.nextInt();
        } while (z <= x);

        int sum = 0;
        int i = 0;

        while (sum < z) {
            sum += x + i;
            i++;
        }

        System.out.println(i);

        scanner.close();
    }
}
