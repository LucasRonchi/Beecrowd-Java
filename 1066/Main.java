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

        int num;
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;

        for (int i = 0; i < 5; i++) {
            num = scanner.nextInt();

            if (num % 2 == 0.0) {
                par++;
            } else {
                impar++;
            }
            
            if (num > 0) {
                positivo++;
            } else if (num < 0) {
                negativo++;
            }
        }

        System.out.printf("%d valor(es) par(es)%n", par);
        System.out.printf("%d valor(es) impar(es)%n", impar);
        System.out.printf("%d valor(es) positivo(s)%n", positivo);
        System.out.printf("%d valor(es) negativo(s)%n", negativo);

        scanner.close();
    }
}
