package cat.alex_i_gerard.laberintos.objects;

import java.io.IOException;

/**
 * La clase Laberinto_3 que se extiende de Laberintos y obtiene sus atributos y los modifica para este laberinto
 */

public class Laberinto_3 extends Laberintos {

    public Laberinto_3(int vidas, int movimientosMaximos){
        super(vidas, movimientosMaximos);
    }

    public static int getMovimientosMaximos() {
        return 45;
    }

    public static int getVidas() {
        return 1;
    }
}
