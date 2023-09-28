import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[]args){
        long celu;
        int indicador;
        long temporal;
        screen.println("ingrese un numero de celular");
        celu = keyboard.nextLong();
        temporal = (celu)/10000000;
        indicador = Math.toIntExact(temporal);
        screen.println("el indicativo es " + indicador);


    }
}