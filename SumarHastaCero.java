import java.util.Scanner;

public class SumarHastaCero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int sumaAcumulada = 0; // Variable para almacenar el total
        
        System.out.println("--- Acumulador de Números ---");
        System.out.println("Introduce números para sumarlos. Ingresa el 0 para terminar.\n");
        
        do {
            System.out.print("Introduce un número: ");
            numero = scanner.nextInt();
            
            sumaAcumulada += numero; // Sumamos el número ingresado al total
            
        } while (numero != 0); // El ciclo se repite MIENTRAS el número NO sea cero
        
        System.out.println("\nEl ciclo ha terminado.");
        System.out.println("La suma total de los números ingresados es: " + sumaAcumulada);
        
        scanner.close();
    }
}