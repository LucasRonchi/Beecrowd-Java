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

        int days = scanner.nextInt();

        int years = days / 365;
        days = days % 365;

        int months = days / 30;
        days = days % 30;

        System.out.printf("%d ano(s)%n", years);
        System.out.printf("%d mes(es)%n", months);
        System.out.printf("%d dia(s)%n", days);

        scanner.close();
    }
}
