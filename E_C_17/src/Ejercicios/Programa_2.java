package Ejercicios;

import java.util.Scanner;
public class Programa_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int num = scanner.nextInt();

        // Definimos una variable que indica si es negativo (-1), cero (0) o positivo (1)
        int estado;
        if (num > 0) {
            estado = 1;
        } else if (num < 0) {
            estado = -1;
        } else {
            estado = 0;
        }

        // Usamos switch para mostrar el resultado
        switch (estado) {
            case 1:
                System.out.println("El número es positivo.");
                break;
            case -1:
                System.out.println("El número es negativo.");
                break;
            case 0:
                System.out.println("El número es cero.");
                break;
        }
    }
}
