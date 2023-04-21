package cat.alex_i_gerard.laberintos.ui;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escritura_FinalPartidas {

    /**
     * En esta clase tenemos un metodo que guarda en un fitxero el nombre del jugador, sus vidas y los movimientos
     * que ha utilizado para superar el laberinto.
     */

    public static void guardarPuntuacioPartida(String nom, int vidas, int movimentsActuals) throws IOException
    {
        System.out.println("Has completado nuestro juego!");
        System.out.println("Has ganado con " + vidas + " vidas.");
        System.out.println("Has ganado haciendo " + movimentsActuals + " movimientos.");
        try {
            FileWriter fw = new FileWriter("C:/Users/alexb/Laberintos/src/cat/alex_i_gerard/laberintos/files/LASTGAMES.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.println("Tu partida ha sido guardada!");
            String str = "El jugador: " + nom + " ha pasado el 1r laberinto con " + vidas + " vidas y en " + movimentsActuals + " movimientos.";

            fw.write(str);
            bw.newLine();

            bw.close();
            fw.close();
        } catch (IOException
                exc
        )
        {
            System.out.println("I/O Error: " + exc);
        }
    }


}
