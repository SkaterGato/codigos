import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion; // Variable para almacenar la decisión del usuario
        
        do {
            // 1. Mostrar el menú en pantalla
            System.out.println("\n=== MENÚ DE OPCIONES ===");
            System.out.println("1. Saludar");
            System.out.println("2. Ver fecha y año actual");
            System.out.println("3. Mostrar mensaje secreto");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción (1-4): ");
            
            opcion = scanner.nextInt();
            System.out.println(); // Espacio en blanco para mejorar el diseño
            
            // 2. Evaluar la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.println("¡Hola! Esperamos que estés teniendo un excelente día.");
                    break;
                case 2:
                    System.out.println("Estamos en el año 2026.");
                    break;
                case 3:
                    System.out.println("Secreto: ¡El café ayuda a escribir mejor código en Java!");
                    break;
                case 4:
                    System.out.println("Saliendo del sistema... ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige un número del 1 al 4.");
                    break;
            }
            
        } while (opcion != 4); // El ciclo se repite MIENTRAS la opción NO sea 4 (Salir)
        
        scanner.close();
    }
}