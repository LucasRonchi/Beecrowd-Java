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

        int startHours = scanner.nextInt();
        int startminutes = scanner.nextInt();
        int endHours = scanner.nextInt();
        int endMinutes = scanner.nextInt();

        int durationHours = endHours - startHours;
        int durationMinutes = endMinutes - startminutes;

        if (durationMinutes < 0) {
            durationHours -= 1;
            durationMinutes += 60;
        }
        if ((durationHours < 0) || (durationMinutes == 0 && durationHours == 0)) {
            durationHours += 24;
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", durationHours, durationMinutes);

        scanner.close();
    }
}
