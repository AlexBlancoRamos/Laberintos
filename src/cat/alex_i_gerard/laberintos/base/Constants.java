package cat.alex_i_gerard.laberintos.base;

/**
 * En esta clase hay constantes que se necessitan actualizar en varias clases y se utilizan en varias clases.
 * I necessitamos poder accedir desde diferentes clases.
 */
public class Constants {

    private static int filaActual = 0;
    private static int columnaActual= 0;

    private static boolean laberintoCompletado = false;

    public static boolean isLaberintoCompletado() {
        return laberintoCompletado;
    }

    public static void setLaberintoCompletado(boolean laberintoCompletado) {
        Constants.laberintoCompletado = laberintoCompletado;
    }

    public static int getFilaActual() {
        return filaActual;
    }

    public static void setFilaActual(int filaActual) {
        Constants.filaActual = filaActual;
    }

    public static int getColumnaActual() {
        return columnaActual;
    }

    public static void setColumnaActual(int columnaActual) {
        Constants.columnaActual = columnaActual;
    }
}
