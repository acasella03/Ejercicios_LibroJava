/* Proyecto - Vamos a jugar a piedra-papel-tijeras contra el ordenador.
 * Tendrás que explicarle al jugador cómo se juega, pedirle que nos dé su jugada
 * (Piedra, PapeL, Tijeras, Salir), generar una jugada aleatoria para el ordenador
 * y decidir quién ha ganado.
 */

import java.util.Scanner;

public class Main {

    private static final String PIEDRA = "P";
    private static final String PAPEL = "L";
    private static final String TIJERAS = "T";
    private static final String SALIR = "S";

    private static final String[] JUEGO = {PIEDRA, PAPEL, TIJERAS};

    private static final int EMPATE = 0;
    private static final int GANAS = 1;
    private static final int PIERDES = 2;

    private static final int ERROR_NO_ENCONTRADA = -1;

    private static final String BIENVENIDA = "Bienvenido al juego Piedra-Papel-Tijeras!";
    private static final String PEDIR_JUGADA = "¿Cuál es tu juaga? " + PIEDRA + " (piedra), " + PAPEL + " (papel), " + TIJERAS + " (tijeras) o " + SALIR + " (salir)";
    private static final String FIN = "Fin de la partida";

    private static final String MSJ_ERROR_NO_ENCONTRADA = "No entiendo tu juagada";

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println(BIENVENIDA);
        System.out.println(PEDIR_JUGADA);

        while (true) {
            int eleccionPC = (int) (Math.random() * JUEGO.length);

            String sEleccionUsuario = s.next();
            if(sEleccionUsuario.equalsIgnoreCase(SALIR)){
                break;
            }

            int eleccionUsuario = convertir(sEleccionUsuario);
            System.out.println("**** Interpretación " + eleccionUsuario);
            if (eleccionUsuario == ERROR_NO_ENCONTRADA) {
                System.err.println(MSJ_ERROR_NO_ENCONTRADA);
                continue;
            }

            int resultado = usuarioGana(eleccionPC, eleccionUsuario);

            switch (resultado) {
                case GANAS:
                    System.out.println("¡Enhorabuena! Tu " + JUEGO[eleccionUsuario] + " gana a " + JUEGO[eleccionPC]);
                    break;
                case PIERDES:
                    System.out.println("¡Lo siento! Tu " + JUEGO[eleccionUsuario] + " pierde ante " + JUEGO[eleccionPC]);
                    break;
                case EMPATE:
                    System.out.println("¡Empate a " + JUEGO[eleccionPC] + "!");
                    break;
            }
            System.out.println("Cuál es tu nueva jugada? P (piedra), L (papel), T (tijeras) o S (salir)");
        }
        System.out.println(FIN);
        s.close();
    }

    private static int convertir(String sEleccionUsuario) {
        for (int i = 0; i < JUEGO.length; i++) {
            if (JUEGO[i].equalsIgnoreCase(sEleccionUsuario)) {
                return i;
            }
        }
        return ERROR_NO_ENCONTRADA;
    }

    private static int usuarioGana(int eleccionPC, int eleccionUsuario) {
        int res = eleccionUsuario - eleccionPC;
        if (res < 0) {
            res += JUEGO.length;
        }
        return res;
    }
}