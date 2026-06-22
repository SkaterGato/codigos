import java.util.Scanner;

public class FactorialNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce un número entero positivo: ");
        int numero = teclado.nextInt();
        
        // Usamos long porque el factorial de números grandes supera el límite de un int
        long factorial = 1; 
        
        // Validamos que el número no sea negativo
        if (numero < 0) {
            System.out.println("¡Error! El factorial no está definido para números negativos.");
        } else {
            // Bucle for que realiza las multiplicaciones acumuladas
            for (int i = 1; i <= numero; i++) {
                factorial *= i; // Es lo mismo que: factorial = factorial * i;
            }
            
            System.out.println("------------------------------------");
            System.out.println("El factorial de " + numero + " (i!) es: " + factorial);
            System.out.println("------------------------------------");
        }
        
        teclado.close();
    }
}