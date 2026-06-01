import java.util.Scanner;

public class ContarPrimosRango {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Solicitar los límites del rango
        System.out.print("Introduce el número de inicio del rango: ");
        int inicio = teclado.nextInt();

        System.out.print("Introduce el número de fin del rango: ");
        int fin = teclado.nextInt();

        int contadorPrimos = 0; // Guardará el total de números primos encontrados

        System.out.println("\nLos números primos encontrados en este rango son:");

        // 2. PRIMER FOR: Recorre el rango desde 'inicio' hasta 'fin'
        for (int i = inicio; i <= fin; i++) {
            
            // Los números menores o iguales a 1 no son primos
            if (i <= 1) {
                continue; // Salta al siguiente número del rango
            }

            boolean esPrimo = true; // Asumimos que el número 'i' es primo

            // 3. SEGUNDO FOR (Anidado): Verifica si 'i' tiene algún divisor además de 1 y de 'i'
            // Evaluamos desde 2 hasta la raíz cuadrada de 'i' (es el método más eficiente rápido)
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) { // Si el residuo es cero, encontramos otro divisor
                    esPrimo = false; // Ya no es primo
                    break;           // Rompemos este ciclo interno para no perder tiempo
                }
            }

            // 4. Si después de revisar los divisores 'esPrimo' sigue siendo verdadero
            if (esPrimo) {
                System.out.print(i + " "); // Imprimimos el número primo
                contadorPrimos++;          // Lo sumamos a nuestro contador total
            }
        }

        // 5. Mostramos el conteo final
        System.out.println("\n\n=========================================");
        System.out.println("Total de números primos encontrados: " + contadorPrimos);
        System.out.println("=========================================");

        teclado.close();
    }
}