package cat.alex_i_gerard.laberintos.base;
import cat.alex_i_gerard.laberintos.objects.*;
import cat.alex_i_gerard.laberintos.ui.Escritura_FinalPartidas;
import cat.alex_i_gerard.laberintos.ui.Lectura_Mostar_mapa;
import cat.alex_i_gerard.laberintos.io.Movimientos;

import java.io.IOException;
import java.util.Scanner;


public class Game {
    public static void main(String[] args) throws IOException {

        /**
         * La clase Game es la execucio del joc.
         * On podem trobar les variable necessaries per executar el joc
         * Els primers metodes executats que no esta dintre del while son: La demanda del nom del jugador i la lectura del mapa
          */

        char[][] tableroLaberinto1 = new char[11][12];
        Scanner scanner = new Scanner(System.in);
        int labActual = 1;
        int vidas = Laberinto_1.getVidas();
        int movimentsMaxims = Laberinto_1.getMovimientosMaximos();
        int movimentsActuals = Jugador.getMovimientosActuales();

        int laberintosCompletados = 0;


        Jugador.nombreJugador(scanner);
        Lectura_Mostar_mapa.iniciarLaberinto1(tableroLaberinto1);

        System.out.println("Laberinto1 :");

        /**
         * El while del game comienza comprobando si en el movimiento anterior ya has completado el laberinto justo despues comprueba si
         * has hecho mas moviemientos de lo posibles justo despues pregunta que movimiento quieres hacer i suma 1 a tu contador de movimientos
         * En caso de que hayas hecho mas movimientos de los posibles te dice que pierdes 1 vida y vuelves a empezar el laberinto.
         * Y puedes salir del while si completas el laberinto o pierdes todas las vidas
         */

        do{
            System.out.println(vidas);
            boolean laberintoCompletado = Constants.isLaberintoCompletado();
            if(laberintoCompletado){
                Escritura_FinalPartidas.guardarPuntuacioPartida(Jugador.getNom(), vidas, movimentsActuals);
                laberintosCompletados++;
            }
            else if(movimentsActuals < movimentsMaxims){
                Lectura_Mostar_mapa.mostrarLaberinto1(tableroLaberinto1);
                Movimientos.movimientos(tableroLaberinto1);
                movimentsActuals++;
            }
            else{
                movimentsActuals = 0;
                vidas--;
                if (vidas == 0) {
                    System.out.println("Has gastado todas tus vidas, has perdido!!!");
                    Lectura_Mostar_mapa.iniciarLaberinto1(tableroLaberinto1);
                }else{
                System.out.println("Demasiados movimientos pierdes una vida y vuelves a empezar");
                System.out.println("Tienes " + vidas + " vidas.");
                Lectura_Mostar_mapa.iniciarLaberinto1(tableroLaberinto1);}
            }
        }while(laberintosCompletados != 1 && vidas != 0);

        System.out.println("Proximamente habra mas laberintos para retarte!!!");
    }
}