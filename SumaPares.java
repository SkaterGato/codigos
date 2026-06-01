public class SumaPares {
    public static void main(String[] args) {
        int suma = 0; // Variable acumuladora para guardar el total

        // El ciclo for empieza en 2, corre mientras i sea menor o igual a 100,
        // y avanza de 2 en 2 (i += 2) para saltarse los impares.
        for (int i = 2; i <= 100; i += 2) {
            suma += i; // Sumamos el número par actual al total acumulado
        }

        // Mostramos el resultado final en la consola
        System.out.println("=========================================");
        System.out.println("La suma de los números pares del 1 al 100 es: " + suma);
        System.out.println("=========================================");
    }
}