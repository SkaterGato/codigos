import java.util.Scanner;

public class ValidarContrasenaBooleano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final String CONTRASENA_CORRECTA = "Java2026";
        boolean accesoConcedido = false; // Bandera para controlar el ciclo
        
        do {
            System.out.print("Introduce la contraseña de acceso: ");
            String intentoUsuario = scanner.nextLine();
            
            // Comparamos el texto directamente
            if (intentoUsuario.equals(CONTRASENA_CORRECTA)) {
                accesoConcedido = true; // Cambiamos el estado de la bandera para salir
            } else {
                System.out.println("Contraseña incorrecta. Acceso denegado.\n");
            }
            
        } while (!accesoConcedido); // El ciclo se repite mientras accesoConcedido sea false
        
        System.out.println("\n¡Acceso concedido! Bienvenido al sistema.");
        
        scanner.close();
    }
}