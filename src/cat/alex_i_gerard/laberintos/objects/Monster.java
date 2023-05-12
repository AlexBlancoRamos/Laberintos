package cat.alex_i_gerard.laberintos.objects;
import static cat.alex_i_gerard.laberintos.base.Game.*;
import static cat.alex_i_gerard.laberintos.ui.Lectura_Mostar_mapa.*;


import java.util.Random;

public class Monster extends Esser{

    public Monster(int fila, int columna) {
        super(fila,columna);
    }

    Random randomJ = new Random(System.currentTimeMillis());

    int fila = 9;

    int columna = 1;

    @Override
    public boolean move() {

        int move = randomJ.nextInt(4);


        if (move == 0) {
            if (columna > 0 && tableroLaberinto1[fila][columna - 1] != '|' && tableroLaberinto1[fila][columna - 1] != '-') {
                tableroLaberinto1[fila][columna - 1] = 'M';
                tableroLaberinto1[fila][columna] = ' ';
                columna = columna - 1;
            }
        }
        if (move == 2) {
            if (columna > 0 && tableroLaberinto1[fila][columna +1] != '|' && tableroLaberinto1[fila][columna + 1] != '-') {
                tableroLaberinto1[fila][columna + 1] = 'M';
                tableroLaberinto1[fila][columna] = ' ';
                columna = columna + 1;
            }}

            if (move == 1) {
                if (fila > 0 && tableroLaberinto1[fila - 1][columna] != '|' && tableroLaberinto1[fila - 1][columna] != '-') {
                    tableroLaberinto1[fila - 1][columna] = 'M';
                    tableroLaberinto1[fila][columna] = ' ';
                    fila = fila - 1;
                }
            }

            if (move == 3) {
                if (fila > 0 && tableroLaberinto1[fila + 1][columna] != '|' && tableroLaberinto1[fila + 1][columna] != '-') {
                    tableroLaberinto1[fila + 1][columna] = 'M';
                    tableroLaberinto1[fila][columna] = ' ';
                    fila = fila + 1;
                }
            }
        return false;
    }
}
