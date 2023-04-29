package cat.alex_i_gerard.laberintos.objects;

/**
 * La clase Laberinto_1 que se extiende de Laberintos y obtiene sus atributos y los modifica para este laberinto
 */
public class Laberinto_1 extends Laberintos {

    public Laberinto_1(int vidas, int movimientosMaximos){
        super(vidas, movimientosMaximos);
    }

    public static int getMovimientosMaximos() {
        return 25;
    }


    public static int getVidas() {
        return 3;
    }
}