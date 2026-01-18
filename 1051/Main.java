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
        
        double salary = scanner.nextDouble();
        double imposto = 0.0;

        if (salary > 4500.0) {
            imposto += (1000.0) * 0.08;
            imposto += (1500.0) * 0.18;
            imposto += (salary - 4500.0) * 0.28;
        } else if (salary > 3000.0 && salary <= 4500.0) {
            imposto += (1000.0) * 0.08;
            imposto += (salary - 3000.0) * 0.18;
        } else if (salary > 2000.0 && salary <= 3000.0) {
            imposto += (salary - 2000.0) * 0.08;
        }
        
        if (imposto == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n", imposto);
        }

        scanner.close();
    }
}
