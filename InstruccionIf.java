import java.util.Scanner;

public class InstruccionIf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una edad: ");
        int edad = entrada.nextInt();

        // Condicional IF: Solo se ejecuta si la condición es verdadera (true)
        if (edad >= 18) {
            System.out.println("Mayor de edad");
        }

        System.out.println("Adiós!");

        entrada.close(); // Buena práctica para cerrar el Scanner
    } // Fin del método main
} // Fin de la clase InstruccionIf