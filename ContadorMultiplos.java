import java.util.Scanner;

public class ContadorMultiplos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce el valor máximo (N): ");
        int n = teclado.nextInt();
        
        int contador = 0;
        
        // Bucle for que recorre desde 1 hasta N
        for (int i = 1; i <= n; i++) {
            // Si el residuo de dividir 'i' entre 3 es cero, es múltiplo de 3
            if (i % 3 == 0) {
                contador++; 
            }
        }
        
        System.out.println("--------------------------------------------------");
        System.out.println("Entre 1 y " + n + " hay " + contador + " múltiplos de 3.");
        System.out.println("--------------------------------------------------");
        
        teclado.close();
    }
}