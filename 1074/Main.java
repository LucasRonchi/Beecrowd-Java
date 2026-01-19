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

        int n = scanner.nextInt();
        int x;

        for (int i = 0; i < n; i++) {
            x = scanner.nextInt();

            if (x == 0) {
                System.out.println("NULL");
            } else {
                if (x % 2 == 0) {
                    System.out.print("EVEN ");
                } else {
                    System.out.print("ODD ");
                }
                if (x > 0){
                    System.out.println("POSITIVE");
                } else {
                    System.out.println("NEGATIVE");
                }
            }

        }

        scanner.close();
    }
}
