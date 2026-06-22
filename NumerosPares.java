public class NumerosPares {
    public static void main(String[] args) {
        
        System.out.println("--- Números pares entre 1 y 100 ---");
        
        // El bucle empieza en 2 y aumenta de 2 en 2
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
            
            // Salto de línea cada 10 números para que se vea ordenado en la terminal
            if (i % 20 == 0) {
                System.out.println();
            }
        }
        
        System.out.println("\n------------------------------------");
    }
}