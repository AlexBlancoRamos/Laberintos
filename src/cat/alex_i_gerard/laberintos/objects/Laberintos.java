package cat.alex_i_gerard.laberintos.objects;

/**
 * Clase laberintos que tiene los atributos que exporta a los otros laberintos
 * i los getters de estos atributos
 */
public class Laberintos {

    private int vidas;
    private int movimientosMaximos;


    public Laberintos(int vidas, int movimientosMaximos) {
        this.vidas = vidas;
        this.movimientosMaximos = movimientosMaximos;
    }


    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public void setMovimientosMaximos(int movimientosMaximos) {
        this.movimientosMaximos = movimientosMaximos;
    }



}
