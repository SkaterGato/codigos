import java.util.Scanner;

public class PatronEstrellas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el número de filas para el patrón: ");
        int filas = scanner.nextInt();
        
        System.out.println("\n--- Patrón Generado ---");
        
        // Ciclo externo: controla las filas (de 1 hasta el número ingresado)
        for (int i = 1; i <= filas; i++) {
            
            // Ciclo interno: imprime tantas estrellas como el número de la fila actual (i)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            // Salto de línea para pasar a la siguiente fila
            System.out.println();
        }
        
        scanner.close();
    }
}