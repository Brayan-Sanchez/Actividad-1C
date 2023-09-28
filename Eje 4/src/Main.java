import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[]args){
        System.out.print("Ingrese la cantidad de dinero: ");
        int cantidadDinero = keyboard.nextInt();
                int monedasDeMil = cantidadDinero / 1000;
                cantidadDinero %= 1000;
                int monedasDeQuinientos = cantidadDinero / 500;
                cantidadDinero %= 500;
                int monedasDeDoscientos = cantidadDinero / 200;
                cantidadDinero %= 200;
                int monedasDeCien = cantidadDinero / 100;
                cantidadDinero %= 100;
                int monedasDeCincuenta = cantidadDinero / 50;
                cantidadDinero %= 50;
                int monedasDeUno = cantidadDinero;
                System.out.println("Desglose de monedas:");
                System.out.println("$1000: " + monedasDeMil);
                System.out.println("$500: " + monedasDeQuinientos);
                System.out.println("$200: " + monedasDeDoscientos);
                System.out.println("$100: " + monedasDeCien);
                System.out.println("$50: " + monedasDeCincuenta);
                System.out.println("$1: " + monedasDeUno);
            }
        }

