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

        int start = scanner.nextInt();

        if (start % 2 == 0) {
            start++;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(start);
            start += 2;
        }

        scanner.close();
    }
}
