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

        double num = scanner.nextDouble();

        if(num < 0 || num > 100) {
            System.out.println("Fora de intervalo");
        } else if( num > 75.0) {
            System.out.println("Intervalo (75,100]");
        } else if( num > 50.0) {
            System.out.println("Intervalo (50,75]");
        } else if( num > 25.0) {
            System.out.println("Intervalo (25,50]");
        } else if( num >= 0.0) {
            System.out.println("Intervalo [0,25]");
        }

        scanner.close();
    }
}
