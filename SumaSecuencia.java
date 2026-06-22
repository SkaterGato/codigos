public class SumaSecuencia {
    public static void main(String[] args) {
        int sumaTotal = 0;

        System.out.println("--- Números del 1 al 100 ---");

        // Bucle for para recorrer e imprimir los números
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
            
            // Acumulamos el valor de 'i' en la variable sumaTotal
            sumaTotal += i; 
        }

        // Línea en blanco para separar la lista del resultado
        System.out.println("\n----------------------------");
        
        // Mostramos el resultado de la suma
        System.out.println("La suma total de los números es: " + sumaTotal);
    }
}