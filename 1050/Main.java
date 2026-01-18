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

        int ddd = scanner.nextInt();

        Map<Integer, String> tabela = new HashMap<>();

        tabela.put(61, "Brasilia");
        tabela.put(71, "Salvador");
        tabela.put(11, "Sao Paulo");
        tabela.put(21, "Rio de Janeiro");
        tabela.put(32, "Juiz de Fora");
        tabela.put(19, "Campinas");
        tabela.put(27, "Vitoria");
        tabela.put(31, "Belo Horizonte");

        String destination = tabela.getOrDefault(ddd, "DDD nao cadastrado");

        System.out.println(destination);

        scanner.close();
    }
}
