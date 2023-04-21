package cat.alex_i_gerard.laberintos.objects;

import java.util.Scanner;

public class Jugador {

    /**
     * La Clase Jugador on trobem el nom y els moviments actuals amb
     * els seus getters y setters y un metode per preguntar el seu nom.
     */

    private static String nombre;

    private int movimientosActuales;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public static int getMovimientosActuales() {
        return 0;
    }

    public void setMovimientosActuales(int movimientosActuales) {
        this.movimientosActuales = movimientosActuales;
    }

    public static String getNom() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void nombreJugador(Scanner scanner){
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        Jugador jugador = new Jugador(nombre);

        System.out.println(Jugador.getNom() +" es hora de jugar: ");
    }
}
