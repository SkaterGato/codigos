import java.util.Scanner;

public class ContadorIntentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double temperatura;
        int intentos = 0; // Variable para contar los intentos totales
        
        System.out.println("--- Registro Médico de Temperatura ---");
        
        do {
            System.out.print("Ingresa la temperatura corporal del paciente (°C): ");
            temperatura = scanner.nextDouble();
            intentos++; // Sumamos un intento por cada valor introducido
            
            // Si el valor es inválido, mostramos un mensaje de error
            if (temperatura < 35.0 || temperatura > 42.0) {
                System.out.println("Valor fuera de rango biológico. Inténtalo de nuevo.\n");
            }
            
        } while (temperatura < 35.0 || temperatura > 42.0); // Se repite si está fuera de rango
        
        // Al salir del ciclo, imprimimos el éxito y la estadística de intentos
        System.out.println("\n¡Temperatura registrada exitosamente: " + temperatura + "°C!");
        System.out.println("Número total de intentos requeridos: " + intentos);
        
        scanner.close();
    }
}