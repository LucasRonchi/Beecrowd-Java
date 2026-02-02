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
        int sum = 0;
        int count = 0;

        while (true) {
            n = scanner.nextInt();
            
            if (n < 0) {
                break;
            }

            sum += n;
            count++;
        }

        double media = (double) sum / count;

        System.out.printf("%.2f%n", media);

        scanner.close();
    }
}
