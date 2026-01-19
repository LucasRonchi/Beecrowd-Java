import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int quantia;
        String tipo;

        int ratos = 0;
        int sapos = 0;
        int coelhos = 0;

        for (int i = 0; i < n; i++) {
            quantia = scanner.nextInt();
            tipo = scanner.next();

            if (tipo.equals("R")) {
                ratos += quantia;
            } else if (tipo.equals("S")) {
                sapos += quantia;
            } else if (tipo.equals("C")) {
                coelhos += quantia;
            }
        }

        int total = ratos + sapos + coelhos;

        double coelhosPercentual = (coelhos * 100.0) / total;
        double ratosPercentual = (ratos * 100.0) / total;
        double saposPercentual = (sapos * 100.0) / total;

        System.out.printf("Total: %d cobaias%n", total);
        System.out.printf("Total de coelhos: %d%n", coelhos);
        System.out.printf("Total de ratos: %d%n", ratos);
        System.out.printf("Total de sapos: %d%n", sapos);
        System.out.printf("Percentual de coelhos: %.2f %%%n", coelhosPercentual);
        System.out.printf("Percentual de ratos: %.2f %%%n", ratosPercentual);
        System.out.printf("Percentual de sapos: %.2f %%%n", saposPercentual);

        scanner.close();
    }
}
