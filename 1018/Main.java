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
        
        int valor = scanner.nextInt();
        System.out.println(valor);

        int[] notas = {100, 50, 20, 10, 5, 2, 1};

        for (int nota : notas) {
            int quantidade = 0;

            while (valor >= nota) {
                valor = valor - nota;
                quantidade++;
            }

            System.out.printf("%d nota(s) de R$ %d,00%n", quantidade, nota);
        }

        scanner.close();
    }
}
