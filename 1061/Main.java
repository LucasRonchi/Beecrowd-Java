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

        scanner.next();
        int startDay = scanner.nextInt();
        int startHours = scanner.nextInt();
        scanner.next();
        int startMinutes = scanner.nextInt();
        scanner.next();
        int startSeconds = scanner.nextInt();
        
        int start = startSeconds +
                    startMinutes * 60 +
                    startHours * 3600 +
                    startDay * 86400;

        scanner.next();
        int endDay = scanner.nextInt();
        int endHours = scanner.nextInt();
        scanner.next();
        int endMinutes = scanner.nextInt();
        scanner.next();
        int endSeconds = scanner.nextInt();

        int end = endSeconds +
                  endMinutes * 60 +
                  endHours * 3600 +
                  endDay * 86400;

        int seconds = end - start;

        int days = seconds / 86400;
        seconds %= 86400;

        int hours = seconds / 3600;
        seconds %= 3600;

        int minutes = seconds / 60;
        seconds %= 60;

        System.out.printf("%d dia(s)%n", days);
        System.out.printf("%d hora(s)%n", hours);
        System.out.printf("%d minuto(s)%n", minutes);
        System.out.printf("%d segundo(s)%n", seconds);

        scanner.close();
    }
}
