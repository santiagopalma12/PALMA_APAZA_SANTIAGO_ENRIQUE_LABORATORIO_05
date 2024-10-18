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
    }

    public static boolean verificar(Soldado[][] tablero, Soldado soldado) {
        return tablero[soldado.getFila()][soldado.getColumna()] != null;
    }
}
