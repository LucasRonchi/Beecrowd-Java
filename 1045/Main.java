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

        if ((a >= (b + c)) || (b >= (a + c)) || (c >= (a + b))) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (((a * a) == (b * b + c * c)) || ((b * b) == (a * a + c * c)) || ((c * c) == (a * a + b * b))) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (((a * a) > (b * b + c * c)) || ((b * b) > (a * a + c * c)) || ((c * c) > (a * a + b * b))) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if ((a == b) && (b == c)) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if ((a == b) || (b == c) || (c == a)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        scanner.close();
    }
}
