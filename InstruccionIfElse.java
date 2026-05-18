import java.util.Scanner;

public class InstruccionIfElse {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una edad: ");
        int edad = entrada.nextInt();

        if (edad >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }

        System.out.println("Adiós!");

        // Buena práctica: cerrar el Scanner
        entrada.close();
    }
}