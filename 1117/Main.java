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

        int quantidade = 0;
        double sum = 0;

        while (quantidade < 2) {
            double nota = scanner.nextDouble();

            if (nota >= 0.0 && nota <= 10.0) {
                sum += nota;
                quantidade++;
            } else {
                System.out.println("nota invalida");
            }
        }

        double media = (sum) / quantidade;

        System.out.printf("media = %.2f%n", media);

        scanner.close();
    }
}
