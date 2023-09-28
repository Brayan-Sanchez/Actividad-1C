import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[]args){
        int num=0;
        int res=0;
        screen.println("ingrese un numero entero");
        num = keyboard.nextInt();
        res = num % 2;
        screen.println("su residuo es " + res);

    }
}