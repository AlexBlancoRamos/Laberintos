package cat.alex_i_gerard.laberintos.base;
import cat.alex_i_gerard.laberintos.objects.*;
import cat.alex_i_gerard.laberintos.ui.Escritura_FinalPartidas;
import cat.alex_i_gerard.laberintos.ui.Lectura_Mostar_mapa;

import java.io.IOException;
import java.util.Scanner;

/**
 * La clase game es la execucio del joc
 */
public class Game {
    /**
     * On podem trobar les variable necessaries per executar el joc
     * Els primers metodes executats que no esta dintre del while son: La demanda del nom del jugador i la lectura del mapa.
     * El while del game comienza comprobando si en el movimiento anterior ya has completado el laberinto justo despues comprueba si
     * has hecho mas moviemientos de lo posibles justo despues pregunta que movimiento quieres hacer i suma 1 a tu contador de movimientos
     * En caso de que hayas hecho mas movimientos de los posibles te dice que pierdes 1 vida y vuelves a empezar el laberinto.
     * Y puedes salir del while si completas el laberinto o pierdes todas las vidas
     */

    public static char[][] tableroLaberinto1 = new char[11][12];
    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);
        int vidas = Laberinto_1.getVidas();
        int movimentsMaxims = Laberinto_1.getMovimientosMaximos();
        int movimentsActuals = Jugador.getMovimientosActuales();
        int laberintosCompletados = 0;

        Monster m1 = new Monster(9, 1);
        Jugador j1 = new Jugador(Constants.getFilaActual(),Constants.getColumnaActual());

        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println(nombre +" es hora de jugar: ");
        Lectura_Mostar_mapa.iniciarLaberinto1(tableroLaberinto1);
        System.out.println("Laberinto1 :");


        do{
            boolean laberintoCompletado = Constants.isLaberintoCompletado();
            if(laberintoCompletado){
                Escritura_FinalPartidas.guardarPuntuacioPartida(nombre, vidas, movimentsActuals);
                laberintosCompletados++;
            }
            else if(movimentsActuals < movimentsMaxims){
                Lectura_Mostar_mapa.mostrarLaberinto1(tableroLaberinto1);
                j1.move();
                m1.move();
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