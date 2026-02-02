import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int fatorial = 1;

        for (int i = 2; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println(fatorial);

        scanner.close();
    }
}
