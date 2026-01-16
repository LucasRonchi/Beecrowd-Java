import java.io.IOException;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int codigo = scanner.nextInt();
        int quantidade = scanner.nextInt();

        Map<Integer, Double> tabela = new HashMap<>();

        tabela.put(1, 4.00);
        tabela.put(2, 4.50);
        tabela.put(3, 5.00);
        tabela.put(4, 2.00);
        tabela.put(5, 1.50);

        double price = tabela.getOrDefault(codigo, null);

        double total = quantidade * price;

        System.out.printf("Total: R$ %.2f%n", total);

        scanner.close();
    }
}