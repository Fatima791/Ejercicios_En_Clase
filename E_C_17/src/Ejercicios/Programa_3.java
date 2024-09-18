
package Ejercicios;

import java.util.Scanner;
   public class Programa_3 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Introduce el segundo número:");
        int num2 = scanner.nextInt();

        int resultado;
        if (num1 > num2) {
            resultado = 0;
        } else if (num1 < num2) {
            resultado = 1;
        } else {
            resultado = 2;
        }

        switch (resultado) {
            case 0:
                System.out.println("Orden: " + num1 + ", " + num2);
                break;
            case 1:
                System.out.println("Orden: " + num2 + ", " + num1);
                break;
            case 2:
                System.out.println("Los números son iguales.");
                break;
        }
    } 
}
