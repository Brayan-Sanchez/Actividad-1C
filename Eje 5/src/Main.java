import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        double dolar;
        double peso;
        double euro;
        screen.println("Ingrese la cantidad en pesos cl");
        peso = keyboard.nextDouble();
        dolar = peso/4077;
        euro = peso/4302;
        screen.println("la cantidad de pesos a dolares es "+ dolar);
        screen.println("la cantidad de pesos a euros es "+ euro);
    }
}