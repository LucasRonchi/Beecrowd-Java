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

        int tempo = scanner.nextInt();
        int velocidade = scanner.nextInt();

        double combustivel = tempo * velocidade / 12.0;

        System.out.printf("%.3f%n", combustivel);

        scanner.close();
    }
}
