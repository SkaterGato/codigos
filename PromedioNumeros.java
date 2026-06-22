import java.util.Scanner;

public class PromedioNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("¿Cuántos números deseas ingresar?: ");
        int n = scanner.nextInt();
        
        // Variable para acumular la suma de todos los números
        double suma = 0;
        
        // El ciclo for se ejecutará exactamente N veces
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingresa el número " + i + ": ");
            double numero = scanner.nextDouble();
            suma += numero; // Sumamos el número ingresado al total
        }
        
        // Calculamos el promedio dividiendo la suma total entre la cantidad de números (N)
        // Usamos una condición para evitar la división por cero si el usuario ingresa N = 0
        if (n > 0) {
            double promedio = suma / n;
            System.out.println("\n--- Resultados ---");
            System.out.println("La suma total es: " + suma);
            System.out.println("El promedio es: " + promedio);
        } else {
            System.out.println("No se ingresaron números para calcular un promedio.");
        }
        
        scanner.close();
    }
}