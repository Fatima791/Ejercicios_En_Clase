package Ejercicio;

public class Numeros {
    
    // Método para generar el array con múltiplos de 5
    public int[] generarMultiplosDeCinco() {
        int[] multiplosDeCinco = new int[10];
        
        // Llenar el array alternando múltiplos de 5 pares e impares
        for (int i = 0; i < multiplosDeCinco.length; i++) {
            if (i % 2 == 0) {
                // Múltiplos de 5 impares negativos
                multiplosDeCinco[i] = -(5 * (2 * i + 1));
            } else {
                // Múltiplos de 5 pares negativos
                multiplosDeCinco[i] = -(5 * (2 * i));
            }
        }
        
        return multiplosDeCinco;
    }
    
    // Método para imprimir el array
    public void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // Nueva línea al final
    }
    
    // Método principal para ejecutar el programa
    public static void main(String[] args) {
        // Crear una instancia de la clase
        Numeros multiplos = new Numeros();
        
        // Llamar al método generarMultiplosDeCinco
        int[] arrayMultiplos = multiplos.generarMultiplosDeCinco();
        
        // Imprimir el array usando el método imprimirArray
        multiplos.imprimirArray(arrayMultiplos);
    }
}

