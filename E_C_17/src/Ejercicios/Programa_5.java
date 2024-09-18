package Ejercicios;
import java.util.Scanner;
public class Programa_5 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir día, mes y año
        System.out.println("Introduce el día:");
        int dia = scanner.nextInt();
        System.out.println("Introduce el mes (1-12):");
        int mes = scanner.nextInt();
        System.out.println("Introduce el año:");
        int año = scanner.nextInt();

        // Variable para almacenar el número máximo de días del mes
        int diasMaximos;

        // Determinar la cantidad de días del mes usando switch
        switch (mes) {
            case 1:  // Enero
            case 3:  // Marzo
            case 5:  // Mayo
            case 7:  // Julio
            case 8:  // Agosto
            case 10: // Octubre
            case 12: // Diciembre
                diasMaximos = 31;
                break;
            case 4:  // Abril
            case 6:  // Junio
            case 9:  // Septiembre
            case 11: // Noviembre
                diasMaximos = 30;
                break;
            case 2:  // Febrero
                diasMaximos = 28; // No estamos considerando años bisiestos
                break;
            default:
                diasMaximos = -1; // Mes inválido
                break;
        }

        // Verificar si la fecha es válida
        if (diasMaximos == -1) {
            System.out.println("El mes ingresado no es válido.");
        } else if (dia < 1 || dia > diasMaximos) {
            System.out.println("El día ingresado no es válido.");
        } else {
            System.out.println("La fecha es válida: " + dia + "/" + mes + "/" + año);
        }
    } 
}
