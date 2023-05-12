package cat.alex_i_gerard.laberintos.objects;

import cat.alex_i_gerard.laberintos.base.Constants;
import static cat.alex_i_gerard.laberintos.base.Game.*;

import java.util.Scanner;

/**
 * La Clase Jugador on trobem el nom y els moviments actuals amb
 * els seus getters y setters y un metode per preguntar el seu nom.
 */
public class Jugador extends Esser{


    private static String nombre;

    private int movimientosActuales;

    public Jugador(int fila, int columna) {
        super(fila,columna);
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


    @Override
    public boolean move() {

        Scanner scanner = new Scanner(System.in);

        char movimiento;

        System.out.print("Eliga su movimiento (a/w/s/d): ");
        movimiento = scanner.next().charAt(0);
        int filaActual = Constants.getFilaActual();
        int columnaActual = Constants.getColumnaActual();
        boolean laberintoCompletado =Constants.isLaberintoCompletado();

        switch (movimiento) {
            case 'w':
                if (filaActual > 0 && tableroLaberinto1[filaActual - 1][columnaActual] != '|' && tableroLaberinto1[filaActual - 1][columnaActual] != '-') {
                    tableroLaberinto1[filaActual - 1][columnaActual] = 'X';
                    tableroLaberinto1[filaActual][columnaActual] = ' ';
                    filaActual--;
                    Constants.setFilaActual(Constants.getFilaActual()-1);
                }else{
                    System.out.println("Error moviment incorrecte");
                }
                break;
            case 's':
                if (filaActual < tableroLaberinto1.length - 1 && tableroLaberinto1[filaActual + 1][columnaActual] != '|' && filaActual < tableroLaberinto1.length - 1 && tableroLaberinto1[filaActual + 1][columnaActual] != '-') {
                    tableroLaberinto1[filaActual + 1][columnaActual] = 'X';
                    tableroLaberinto1[filaActual][columnaActual] = ' ';
                    filaActual++;
                    Constants.setFilaActual(Constants.getFilaActual() + 1);

                }else{
                    System.out.println("Error moviment incorrecte");
                }


                break;
            case 'a':
                if (columnaActual > 0 && tableroLaberinto1[filaActual][columnaActual - 1] != '|' && tableroLaberinto1[filaActual][columnaActual - 1] != '-') {

                    tableroLaberinto1[filaActual][columnaActual - 1] = 'X';
                    tableroLaberinto1[filaActual][columnaActual] = ' ';
                    columnaActual--;
                    Constants.setColumnaActual(Constants.getColumnaActual()-1);
                }else{
                    System.out.println("Error moviment incorrecte");
                }
                break;
            case 'd':
                if (columnaActual < tableroLaberinto1[filaActual].length - 1 && tableroLaberinto1[filaActual][columnaActual + 1] != '|' && columnaActual < tableroLaberinto1[filaActual].length - 1 && tableroLaberinto1[filaActual][columnaActual + 1] != '-') {
                    if (tableroLaberinto1[filaActual][columnaActual+1] == 'S'){
                        System.out.println("Laberinto completado");
                        laberintoCompletado = true;
                        Constants.setLaberintoCompletado(true);
                    }
                    tableroLaberinto1[filaActual][columnaActual + 1] = 'X';
                    tableroLaberinto1[filaActual][columnaActual] = ' ';
                    columnaActual++;
                    Constants.setColumnaActual(Constants.getColumnaActual()+1);
                }else{
                    System.out.println("Error moviment incorrecte");
                }
                break;
            default:
                System.out.println("Movimiento invalido!!");
        }

        return laberintoCompletado;
    }
}
