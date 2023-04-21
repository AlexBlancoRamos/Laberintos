package cat.alex_i_gerard.laberintos.io;

import cat.alex_i_gerard.laberintos.base.Constants;


import java.util.Scanner;

public class Movimientos {

    public static boolean movimientos(char[][] tableroLaberinto){

        Scanner scanner = new Scanner(System.in);

            char movimiento;

            System.out.print("Eliga su movimiento (a/w/s/d): ");
            movimiento = scanner.next().charAt(0);
            int filaActual = Constants.getFilaActual();
            int columnaActual = Constants.getColumnaActual();
            boolean laberintoCompletado =Constants.isLaberintoCompletado();

            switch (movimiento) {
                case 'w':
                    if (filaActual > 0 && tableroLaberinto[filaActual - 1][columnaActual] != '|' && tableroLaberinto[filaActual - 1][columnaActual] != '-') {
                        tableroLaberinto[filaActual - 1][columnaActual] = 'X';
                        tableroLaberinto[filaActual][columnaActual] = ' ';
                        filaActual--;
                        Constants.setFilaActual(Constants.getFilaActual()-1);
                    }else{
                        System.out.println("Error moviment incorrecte");
                    }
                    break;
                case 's':
                    if (filaActual < tableroLaberinto.length - 1 && tableroLaberinto[filaActual + 1][columnaActual] != '|' && filaActual < tableroLaberinto.length - 1 && tableroLaberinto[filaActual + 1][columnaActual] != '-') {
                        tableroLaberinto[filaActual + 1][columnaActual] = 'X';
                        tableroLaberinto[filaActual][columnaActual] = ' ';
                        filaActual++;
                        Constants.setFilaActual(Constants.getFilaActual() + 1);

                    }else{
                        System.out.println("Error moviment incorrecte");
                    }


                    break;
                case 'a':
                    if (columnaActual > 0 && tableroLaberinto[filaActual][columnaActual - 1] != '|' && tableroLaberinto[filaActual][columnaActual - 1] != '-') {

                            tableroLaberinto[filaActual][columnaActual - 1] = 'X';
                            tableroLaberinto[filaActual][columnaActual] = ' ';
                            columnaActual--;
                            Constants.setColumnaActual(Constants.getColumnaActual()-1);
                    }else{
                        System.out.println("Error moviment incorrecte");
                    }
                    break;
                case 'd':
                    if (columnaActual < tableroLaberinto[filaActual].length - 1 && tableroLaberinto[filaActual][columnaActual + 1] != '|' && columnaActual < tableroLaberinto[filaActual].length - 1 && tableroLaberinto[filaActual][columnaActual + 1] != '-') {
                        if (tableroLaberinto[filaActual][columnaActual+1] == 'S'){
                            System.out.println("Laberinto completado");
                            laberintoCompletado = true;
                            Constants.setLaberintoCompletado(true);
                        }
                            tableroLaberinto[filaActual][columnaActual + 1] = 'X';
                            tableroLaberinto[filaActual][columnaActual] = ' ';
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


