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
        double sum = 0;
        int quant = 0;

        for (int i = 0; i < 6; i++) {
            num = scanner.nextDouble();
            if (num > 0) {
                sum += num;
                quant++;
            }
        }

        double mean = sum / quant;

        System.out.println(quant + " valores positivos");
        System.out.printf("%.1f%n", mean);

        scanner.close();
    }
}
