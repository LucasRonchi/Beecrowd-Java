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

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a < (b + c) && b < (a + c) && c < (a + b)) {
            double perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f%n", perimetro);
        } else {
            double area = (a + b) * c / 2;
            System.out.printf("Area = %.1f%n", area);
        }

        scanner.close();
    }
}
