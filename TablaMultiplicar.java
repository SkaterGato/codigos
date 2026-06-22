import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        // Creamos el scanner para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce un número (preferiblemente del 1 al 12): ");
        int numero = teclado.nextInt();
        
        System.out.println("\n--- Tabla de multiplicar del " + numero + " ---");
        
        // Bucle for que va del 1 al 12
        for (int i = 1; i <= 12; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
        System.out.println("------------------------------------");
        
        // Cerramos el scanner
        teclado.close();
    }
}