import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[]args){
        float horas;
        float vhora;
        float reten;
        float salbruto;
        float salneto;
        float retenfuente;
        screen.println("ingrese el valor de la hora");
        vhora = keyboard.nextFloat();
        screen.println("ingrese las horas trabajadas");
        horas = keyboard.nextFloat();
        screen.println("ingrese el porcentaje de retencion");
        reten = keyboard.nextFloat();
        salbruto = horas*vhora;
        retenfuente = salbruto*(reten/100);
        salneto = salbruto - retenfuente;
        screen.println("El salario en bruto es "+ salbruto);
        screen.println("La retencion en la fuente es de "+ retenfuente+"%");
        screen.println("El salario neto es de "+ salneto);





    }
}