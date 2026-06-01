import java.util.Scanner;

public class ValidarContrasena {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Definimos la contraseña correcta (nuestro "secreto")
        String contrasenaCorrecta = "Java123";
        String intento;

        System.out.println("--- SISTEMA DE SEGURIDAD ---");
        
        // Pedimos la contraseña por primera vez
        System.out.print("Introduce la contraseña para ingresar: ");
        intento = teclado.nextLine(); // Usamos nextLine() para leer texto

        // 2. El ciclo while se ejecuta MIENTRAS el intento NO sea igual a la contraseña correcta
        // El símbolo '!' al principio significa "NEGACIÓN" (NO es igual)
        while (!intento.equals(contrasenaCorrecta)) {
            System.out.println("❌ Contraseña incorrecta. Acceso denegado.\n");
            
            // Volvemos a pedir la contraseña dentro del bucle
            System.out.print("Inténtalo de nuevo: ");
            intento = teclado.nextLine();
        }

        // 3. Si el ciclo termina, significa que el intento coincide con la contraseña correcta
        System.out.println("\n=========================================");
        System.out.println("🔓 ¡Acceso Concedido! Bienvenido al sistema.");
        System.out.println("=========================================");

        teclado.close();
    }
}