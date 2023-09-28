import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Ingrese el ancho de la pantalla en cm: ");
        double anchoCm = keyboard.nextDouble();
        System.out.print("Ingrese el alto de la pantalla en cm: ");
        double altoCm = keyboard.nextDouble();
        double diagonalCm = Math.sqrt(Math.pow(anchoCm, 2) + Math.pow(altoCm, 2));
        double pulgadas = diagonalCm / 2.54; // Convertir de cm a pulgadas (1 pulgada = 2.54 cm)
        System.out.println("El tamaño de la pantalla es de " + pulgadas + " pulgadas");
    }
}