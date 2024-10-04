package Lab_5;
import java.util.Scanner;

public class Soldados {
    public static void main(String[] args) {
        final int NUM_SOLDADOS = 5;
        String[] nombres = new String[NUM_SOLDADOS];
        int[] nivelesVida = new int[NUM_SOLDADOS];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < NUM_SOLDADOS; i++) {
            System.out.println("Ingrese el nombre del Soldado " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
            System.out.print("Ingrese el nivel de vida del Soldado " + (i + 1) + ": ");
            nivelesVida[i] = sc.nextInt();
            sc.nextLine(); 
        }
        System.out.println("\nDatos de los soldados:");
        for (int i = 0; i < NUM_SOLDADOS; i++) {
            System.out.println("Soldado: " + nombres[i] + ", Nivel de Vida: " + nivelesVida[i]);
        }

        sc.close();
    }
}
