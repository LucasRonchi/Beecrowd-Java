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
        StringBuilder sb = new StringBuilder();

        int n = scanner.nextInt();
        int last = 1;
        int secondLast = 0;

        if (n >= 1) {
            sb.append(secondLast);
        }

        if (n >= 2) {
            sb.append(" ");
            sb.append(last);
        }

        for (int i = 2; i < n; i++) {
            int newNum = secondLast + last;
            secondLast = last;
            last = newNum;

            sb.append(" ");
            sb.append(last);
        }

        System.out.println(sb);

        scanner.close();
    }
}
