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
        
        while (true) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x < y) {
                System.out.println("Crescente");
            } else if (x > y) {
                System.out.println("Decrescente");
            } else {
                break;
            }
        }

        scanner.close();
    }
}
