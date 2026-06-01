import java.util.Scanner; // Importamos el lector de teclado

public class ContarPositivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        int contadorPositivos = 0; // Aquí guardaremos cuántos positivos van

        // Pedimos el primer número antes de entrar al ciclo
        System.out.print("Introduce un número (usa 0 para terminar): ");
        numero = teclado.nextInt();

        // El ciclo "while" continuará MIENTRAS el número NO sea 0
        while (numero != 0) {
            
            // Si el número es mayor que cero, es positivo
            if (numero > 0) {
                contadorPositivos++; // Sumamos 1 al contador
            }
            
            // Volvemos a pedir otro número dentro del ciclo
            System.out.print("Introduce otro número (usa 0 para terminar): ");
            numero = teclado.nextInt();
        }

        // Cuando se digita 0, el ciclo termina y venimos aquí
        System.out.println("\n--- Proceso Terminado ---");
        System.out.println("Cantidad de números positivos ingresados: " + contadorPositivos);
        
        teclado.close(); // Cerramos el scanner
    }
}