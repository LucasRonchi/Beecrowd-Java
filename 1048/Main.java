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
        int gain;
        
        if (salary <= 400.0) {
            gain = 15;
        } else if (salary <= 800.0) {
            gain = 12;
        } else if (salary <= 1200.0) {
            gain = 10;
        } else if (salary <= 2000.0) {
            gain = 7;
        } else {
            gain = 4;
        }

        double adjustment = salary * gain / 100.0;
        double newSalary = salary + adjustment;

        System.out.printf("Novo salario: %.2f%n", newSalary);
        System.out.printf("Reajuste ganho: %.2f%n", adjustment);
        System.out.printf("Em percentual: %d %%%n", gain);

        scanner.close();
    }
}
