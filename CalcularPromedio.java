import java.util.Scanner; // Importamos la herramienta para leer el teclado

public class CalcularPromedio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double sumaNotas = 0; // Para ir acumulando el total de las notas
        int contadorNotas = 0; // Para saber cuántas notas se han ingresado
        double nota;

        System.out.println("--- Calculadora de Promedios ---");
        System.out.print("Introduce una nota (o escribe -1 para terminar): ");
        nota = teclado.nextDouble(); // Leemos la primera nota

        // El ciclo se ejecutará MIENTRAS la nota NO sea -1
        while (nota != -1) {
            sumaNotas = sumaNotas + nota; // Sumamos la nota al acumulador
            contadorNotas++;               // Contamos que ya llevamos una nota más

            // Pedimos la siguiente nota dentro del ciclo
            System.out.print("Introduce otra nota (o escribe -1 para terminar): ");
            nota = teclado.nextDouble();
        }

        // Fuera del ciclo, calculamos y mostramos el promedio si se ingresó al menos una nota
        if (contadorNotas > 0) {
            double promedio = sumaNotas / contadorNotas;
            System.out.println("\n---------------------------------");
            System.out.println("Total de notas ingresadas: " + contadorNotas);
            System.out.printf("El promedio final es: %.2f\n", promedio); // %.2f reduce a 2 decimales
            System.out.println("---------------------------------");
        } else {
            System.out.println("\nNo se ingresó ninguna nota válida.");
        }

        teclado.close(); // Cerramos el scanner
    }
}