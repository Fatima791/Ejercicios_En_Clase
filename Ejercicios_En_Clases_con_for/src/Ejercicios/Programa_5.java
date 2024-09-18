
package Ejercicios;


public class Programa_5 {
       public static void main(String[] args) {
        // Ciclo externo para las tablas del 1 al 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i + ":");
            // Ciclo interno para multiplicar por los números del 1 al 10
            for (int j = 1; j <= 10; j++) {
                // Usar switch para imprimir el resultado
                switch (i) {
                    case 1:
                        System.out.println(i + " * " + j + " = " + (i * j));
                        break;
                    case 2:
                        System.out.println(i + " * " + j + " = " + (i * j));
                        break;
                    case 3:
                        System.out.println(i + " * " + j + " = " + (i * j));
                        break;
                    case 4:
                        System.out.println(i + " * " + j + " = " + (i * j));
                        break;
                    case 5:
                        System.out.println(i + " * " + j + " = " + (i * j));
                        break;
                    case 6:
                        System.out.println(i + " * " + j + " = " + (i * j));
                        break;
                    case 7:
                        System.out.println(i + " * " + j + " = " + (i * j));
                        break;
                    case 8:
                        System.out.println(i + " * " + j + " = " + (i * j));
                        break;
                    case 9:
                        System.out.println(i + " * " + j + " = " + (i * j));
                        break;
                    case 10:
                        System.out.println(i + " * " + j + " = " + (i * j));
                        break;
                    default:
                        System.out.println("Número fuera del rango esperado");
                }
            }
            // Espacio entre tablas
            System.out.println();
        }
    }
}
