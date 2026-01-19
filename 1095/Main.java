import java.io.IOException;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    public static void main(String[] args) throws IOException {
        for (int i = 1, j = 60; j >= 0; i += 3, j -= 5) {
            System.out.printf("I=%d J=%d%n", i, j);
        }
    }
}
