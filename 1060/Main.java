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

        double num;
        int count = 0;

        for (int i = 0; i < 6; i++) {
            num = scanner.nextDouble();
            if (num > 0) {
                count++;
            }
        }

        System.out.printf("%d valores positivos%n", count);

        scanner.close();
    }
}
