package cat.alex_i_gerard.laberintos.ui;

import java.io.*;
import cat.alex_i_gerard.laberintos.base.Constants;
import cat.alex_i_gerard.laberintos.objects.Monster;


/**
 * Primero hay un metode que lee el laberinto i lo inici, donde tambien llamo a las constantes de filaActual i columnaActual
 * del personaje para tener control de la posicion de esta.
 * Y despues otro metodo para mostrar el mapa.
 */
public class Lectura_Mostar_mapa {

    /**
     * El metodo para leer el mapa y guardar-lo en un array
     * @param tableroLaberinto1
     */
    public static void iniciarLaberinto1(char[][] tableroLaberinto1){

        String line;
            int filaActual = Constants.getFilaActual();
            int columnaActual = Constants.getColumnaActual();

            int i = 0;
            try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\alexb\\Laberintos\\src\\cat\\alex_i_gerard\\laberintos\\files\\maps\\Laberinto_1.txt"))) {
                while ((line = br.readLine()) != null) {
                    for (int j = 0; j < line.length(); j++) {
                        tableroLaberinto1[i][j] = line.charAt(j);
                        if (tableroLaberinto1[i][j] == 'X') {
                            Constants.setFilaActual(i);
                            Constants.setColumnaActual(j);
                        }
                        if (tableroLaberinto1[i][j] == 'M'){
                            //Monster.setFila(i);
                            //Monster.setColumna(j);
                        }
                    }
                    i += 1;
                }
            } catch (IOException exc) {
                System.out.println("I/O Error: " + exc);
            }
    }

    /**
     * El metodo para printar el mapa
     * @param tableroLaberinto1
     */
    public static void mostrarLaberinto1(char[][] tableroLaberinto1){
        for (int z = 0; z < tableroLaberinto1.length; z++) {
            for (int y = 0; y < tableroLaberinto1[z].length; y++) {
                System.out.print(tableroLaberinto1[z][y] + " ");
            }
            System.out.println();
        }
    }
}

