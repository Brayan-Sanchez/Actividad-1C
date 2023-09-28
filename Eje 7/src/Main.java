import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Ingrese el largo del acuario (cm): ");
        double largo = keyboard.nextDouble();
        System.out.print("Ingrese el ancho del acuario (cm): ");
        double ancho = keyboard.nextDouble();
        System.out.print("Ingrese la altura del acuario (cm): ");
        double alto = keyboard.nextDouble();
        double volumenAcuario = (largo * ancho * alto) / 1000.0;
        double litrosRequeridos = volumenAcuario * 0.9;
        System.out.println("Los litros requeridos para llenar al 90% son: " + litrosRequeridos + " litros");
    }
}