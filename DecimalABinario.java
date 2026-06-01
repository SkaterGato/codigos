import java.util.Scanner;

public class DecimalABinario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número decimal entero positivo: ");
        int numero = teclado.nextInt();

        // Si el usuario introduce 0, el binario es directamente 0
        if (numero == 0) {
            System.out.println("El número en binario es: 0");
        } else {
            int numeroOriginal = numero;
            String binario = ""; // Usaremos un String para ir acumulando los bits

            // Ciclo while para realizar las divisiones sucesivas
            while (numero > 0) {
                int residuo = numero % 2;      // Obtenemos el residuo (0 o 1)
                
                // IMPORTANTE: Colocamos el residuo AL PRINCIPIO de la cadena
                // para que el resultado final quede invertido automáticamente.
                binario = residuo + binario;   
                
                numero = numero / 2;           // Dividimos el número entre 2 para la siguiente vuelta
            }

            // Mostramos el resultado final
            System.out.println("\n---------------------------------");
            System.out.println("Número Decimal: " + numeroOriginal);
            System.out.println("Número Binario: " + binario);
            System.out.println("---------------------------------");
        }

        teclado.close();
    }
}