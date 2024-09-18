package Ejercicios;
import java.util.Scanner;
public class Programa_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Introduce el segundo número:");
        int num2 = scanner.nextInt();

        // Definimos 0 para iguales y 1 para diferentes
        int resultado = (num1 == num2) ? 0 : 1;

        switch (resultado) {
            case 0:
                System.out.println("Los números son iguales.");
                break;
            case 1:
                System.out.println("Los números son diferentes.");
                break;
        }
    }
}
