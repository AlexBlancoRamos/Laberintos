package cat.alex_i_gerard.laberintos.objects;

import java.io.IOException;

public class Laberinto_2 extends Laberintos {

    /**
     * La clase Laberinto_2 que se extiende de Laberintos y obtiene sus atributos y los modifica para este laberinto
     */

    public Laberinto_2(int vidas, int movimientosMaximos){
        super(vidas, movimientosMaximos);
    }

    public static int getMovimientosMaximos() {
        return 50;
    }

    public static int getVidas() {
        return 2;
    }
}
