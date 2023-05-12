package cat.alex_i_gerard.laberintos.objects;


public abstract class Esser {

    private int fila;
    private int columna;

    public Esser(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public abstract boolean move();


}
