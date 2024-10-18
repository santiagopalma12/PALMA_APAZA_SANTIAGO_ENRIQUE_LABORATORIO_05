package labFP2;

import java.util.ArrayList;

public class VideoJuego2 {
    public static void main(String[] args) {
        Soldado[][] tablero = new Soldado[10][10];
        ArrayList<Soldado> soldados = new ArrayList<>();
        int numeroSoldados = (int) (Math.random() * 11);
        int vidaTotal = 0;

        for (int i = 0; i < numeroSoldados; i++) {
            Soldado soldado;
            int vida, fila, columna;
            do {
                vida = (int) (Math.random() * 6) + 1;
                fila = (int) (Math.random() * 10);
                columna = (int) (Math.random() * 10);
                soldado = new Soldado("Soldado" + i, vida, fila, columna);
            } while (verificar(tablero, soldado));
            tablero[fila][columna] = soldado;
            soldados.add(soldado);
            vidaTotal += vida;
        }

        mostrar(tablero);
        mostrarDatosEjercito(soldados, vidaTotal);
    }

    public static boolean verificar(Soldado[][] tablero, Soldado soldado) {
        return tablero[soldado.getFila()][soldado.getColumna()] != null;
    }

    public static void mostrar(Soldado[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == null) {
                    System.out.print("_________| ");
                } else {
                    System.out.print(tablero[i][j].getNombre() + " | ");
                }
            }
            System.out.println();
        }
    }

    public static void mostrarDatosEjercito(ArrayList<Soldado> soldados, int vidaTotal) {
        double promedioVida = (double) vidaTotal / soldados.size();
        System.out.println("Nivel de vida total del ejército: " + vidaTotal);
        System.out.println("Promedio de nivel de vida: " + promedioVida);
        
        System.out.println("Datos de todos los soldados:");
        for (Soldado soldado : soldados) {
            System.out.println(soldado.getNombre() + " - Vida: " + soldado.getNivelVida());
        }
    }
}
