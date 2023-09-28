import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Ingrese la distancia: ");
        double distancia = keyboard.nextDouble();
        System.out.print("Ingrese el tiempo: ");
        double tiempo = keyboard.nextDouble();
        double velocidad = distancia / tiempo;
        System.out.println("Para recorrer " + distancia + "en " + tiempo + "la velocidad debe ser " + velocidad );
    }
}