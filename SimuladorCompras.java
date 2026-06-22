import java.util.Scanner;

public class SimuladorCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double precio;
        double subtotal = 0;
        int contadorProductos = 0;
        
        System.out.println("=== SIMULADOR DE CARRITO DE COMPRAS ===");
        System.out.println("Ingresa los precios de los productos. Digita '0' para finalizar la compra.\n");
        
        do {
            System.out.print("Precio del producto #" + (contadorProductos + 1) + ": $");
            precio = scanner.nextDouble();
            
            // Validamos que no se ingresen precios negativos
            if (precio < 0) {
                System.out.println("Error: El precio no puede ser negativo. Inténtalo de nuevo.\n");
            } 
            // Si el precio es válido y diferente de cero, lo sumamos al carrito
            else if (precio > 0) {
                subtotal += precio;
                contadorProductos++;
            }
            
        } while (precio != 0); // El ciclo se repite hasta que el usuario ingresa 0
        
        // Al terminar el ciclo, mostramos el ticket de compra si se agregaron productos
        System.out.println("\n=================================");
        System.out.println("        TICKET DE COMPRA         ");
        System.out.println("=================================");
        System.out.println("Total de productos: " + contadorProductos);
        System.out.printf("Subtotal:            $%.2f\n", subtotal);
        
        // Calculamos un impuesto simulado (IVA / IGV del 18%)
        double impuesto = subtotal * 0.18;
        double totalFinal = subtotal + impuesto;
        
        System.out.printf("Impuesto (18%%):      $%.2f\n", impuesto);
        System.out.println("---------------------------------");
        System.out.printf("TOTAL A PAGAR:       $%.2f\n", totalFinal);
        System.out.println("=================================");
        System.out.println("¡Gracias por su compra!");
        
        scanner.close();
    }
}