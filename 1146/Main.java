import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                break;
            }

            for (int i = 1; i <= x; i++) {
                sb.append(i);
                if (i < x) sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
