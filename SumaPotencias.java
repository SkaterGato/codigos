import java.util.Scanner;

public class SumaPotencias {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Solicitamos la base (x) y el exponente máximo (n)
        System.out.print("Introduce el valor de la base (x): ");
        double x = teclado.nextDouble();

        System.out.print("Introduce el exponente máximo (n): ");
        int n = teclado.nextInt();

        double sumaTotal = 0;

        // 2. Ciclo for para calcular y sumar cada término desde x^0 hasta x^n
        for (int i = 0; i <= n; i++) {
            // Math.pow(base, exponente) calcula la potencia
            sumaTotal += Math.pow(x, i); 
        }

        // 3. Mostramos el resultado en la consola
        System.out.println("\n=========================================");
        System.out.println("El resultado de la serie para x=" + x + " hasta n=" + n + " es:");
        System.out.println("Resultado: " + sumaTotal);
        System.out.println("=========================================");

        teclado.close();
    }
}