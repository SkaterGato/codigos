import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Genera un número aleatorio entre 1 y 100
        int numeroSecreto = random.nextInt(100) + 1;
        int intentoUsuario;
        int contadorIntentos = 0;
        
        System.out.println("=== ¡JUEGO DE ADIVINANZA! ===");
        System.out.println("He pensado un número entre 1 y 100. ¿Puedes adivinar cuál es?\n");
        
        // Iniciamos el ciclo para pedir los intentos
        do {
            System.out.print("Introduce tu número: ");
            intentoUsuario = scanner.nextInt();
            contadorIntentos++; // Sumamos un intento en cada vuelta
            
            // Damos pistas al usuario
            if (intentoUsuario < numeroSecreto) {
                System.out.println("El número secreto es MAYOR. ¡Inténtalo de nuevo!\n");
            } else if (intentoUsuario > numeroSecreto) {
                System.out.println("El número secreto es MENOR. ¡Inténtalo de nuevo!\n");
            }
            
        } while (intentoUsuario != numeroSecreto); // El ciclo sigue mientras no acierte
        
        // Mensaje de éxito al salir del ciclo
        System.out.println("\n¡FELICIDADES! Has adivinado el número secreto (" + numeroSecreto + ").");
        System.out.println("Te ha tomado " + contadorIntentos + " intentos.");
        
        scanner.close();
    }
}