package Proyecto;
import java.util.Scanner;
public class Banco {
   public static void main(String[] args) {
        // Crear dos cuentas bancarias con saldo inicial
        Cuentas cuenta1 = new Cuentas(4500.00);
        Cuentas cuenta2 = new Cuentas(6300.00);
        
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double monto;

        do {
            // Mostrar el menú
            System.out.println("\nSaldo de la Cuenta No 1: " + cuenta1.consultarSaldo());
            System.out.println("Saldo de la Cuenta No 2: " + cuenta2.consultarSaldo());
            System.out.println("\nElija una opción:");
            System.out.println("1. Abonar a la Cuenta No 1");
            System.out.println("2. Abonar a la Cuenta No 2");
            System.out.println("3. Debitar de la Cuenta No 1");
            System.out.println("4. Debitar de la Cuenta No 2");
            System.out.println("5. Consultar saldos");
            System.out.println("6. Salir");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese un valor para abonar a la cuenta No 1: ");
                    monto = scanner.nextDouble();
                    cuenta1.abonar(monto);
                }
                case 2 -> {
                    System.out.print("Ingrese un valor para abonar a la cuenta No 2: ");
                    monto = scanner.nextDouble();
                    cuenta2.abonar(monto);
                }
                case 3 -> {
                    System.out.print("Ingrese un valor para debitar de la cuenta No 1: ");
                    monto = scanner.nextDouble();
                    cuenta1.debitar(monto);
                }
                case 4 -> {
                    System.out.print("Ingrese un valor para debitar de la cuenta No 2: ");
                    monto = scanner.nextDouble();
                    cuenta2.debitar(monto);
                }
                case 5 -> {
                    System.out.println("\nSaldo de la Cuenta No 1: " + cuenta1.consultarSaldo());
                    System.out.println("Saldo de la Cuenta No 2: " + cuenta2.consultarSaldo());
                }
                case 6 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 6);
    } 
}
