import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Ingrese los segundos: ");
        float totalSegundos = keyboard.nextFloat();
        float segundosEnUnDia = 24 * 60 * 60;
        float segundosEnUnaHora = 60 * 60;
        float segundosEnUnMinuto = 60;
        float dias = totalSegundos / segundosEnUnDia;
        totalSegundos %= segundosEnUnDia;
        float horas = totalSegundos / segundosEnUnaHora;
        totalSegundos %= segundosEnUnaHora;
        float minutos = totalSegundos / segundosEnUnMinuto;
        float segundos = totalSegundos % segundosEnUnMinuto;

        System.out.println("Equivalente en días: " + dias);
        System.out.println("Equivalente en horas: " + horas);
        System.out.println("Equivalente en minutos: " + minutos);
        System.out.println("Equivalente en segundos: " + segundos);
    }
}

