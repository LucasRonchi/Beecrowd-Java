import java.io.IOException;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i <= 20; i += 2) {
            double iNum = i / 10.0;

            for (int j = 1; j <= 3; j++) {
                double jNum = j + iNum;

                if (i % 10 == 0) {
                    System.out.printf("I=%.0f J=%.0f%n", iNum, jNum);
                } else {
                    System.out.printf("I=%.1f J=%.1f%n", iNum, jNum);
                }
            }
        }
    }
}
