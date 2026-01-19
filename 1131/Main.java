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

        int inter = 0;
        int gremio = 0;
        int empate = 0;
        int novoGrenal;

        do {
            int golsInter = scanner.nextInt();
            int golsGremio = scanner.nextInt();

            if (golsInter > golsGremio) {
                inter++;
            } else if (golsGremio > golsInter) {
                gremio++;
            } else {
                empate++;
            }

            do {
                System.out.println("Novo grenal (1-sim 2-nao)");

                novoGrenal = scanner.nextInt();
            } while (novoGrenal != 1 && novoGrenal != 2);
        } while (novoGrenal == 1);

        int total = inter + gremio + empate;

        System.out.println(total + " grenais");
        System.out.println("Inter:" + inter);
        System.out.println("Gremio:" + gremio);
        System.out.println("Empates:" + empate);
        if (inter > gremio) {
            System.out.println("Inter venceu mais");
        } else if (gremio > inter) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }

        scanner.close();
    }
}
