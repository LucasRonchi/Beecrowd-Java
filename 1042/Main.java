import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        
        int[] numeros = {n1, n2, n3};
        int[] numerosSort = {n1, n2, n3};

        Arrays.sort(numerosSort);

        System.out.println(numerosSort[0]);
        System.out.println(numerosSort[1]);
        System.out.println(numerosSort[2]);
        System.out.println();
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);

        scanner.close();
    }
}
