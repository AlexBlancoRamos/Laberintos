package cat.alex_i_gerard.laberintos.objects;

public class Laberintos {

    /**
     * Clase laberintos que tiene los atributos que exporta a los otros laberintos
     * i los getters de estos atributos
     */

    private int vidas;
    private int movimientosMaximos;


    public Laberintos(int vidas, int movimientosMaximos) {
        this.vidas = vidas;
        this.movimientosMaximos = movimientosMaximos;
    }

    public static int getVidas() {
        return 3;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public void setMovimientosMaximos(int movimientosMaximos) {
        this.movimientosMaximos = movimientosMaximos;
    }

    public static int getMovimientosMaximos() {
        return 25;
    }


}
