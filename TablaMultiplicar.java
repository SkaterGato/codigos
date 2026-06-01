import java.util.Scanner; // Importamos el lector de teclado

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Solicitamos al usuario el número de la tabla
        System.out.print("¿De qué número deseas ver la tabla de multiplicar?: ");
        int numero = teclado.nextInt();

        System.out.println("\n=======================");
        System.out.println("   TABLA DEL " + numero);
        System.out.println("=======================");

        // 2. Usamos el ciclo 'for' para ir del 1 al 12
        // i++ hace que la variable 'i' aumente de 1 en 1 en cada vuelta
        for (int i = 1; i <= 12; i++) {
            int resultado = numero * i; // Calculamos la multiplicación actual
            
            // Estructuramos la salida para que se vea bonita (ej: 5 x 1 = 5)
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        System.out.println("=======================");
        
        teclado.close(); // Cerramos el scanner
    }
}