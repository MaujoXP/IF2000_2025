package IF2000_2025.Lab_05.logic;

import java.util.Scanner;

public class Tablero {
    private char[][] tablero = new char[8][8];

    public Tablero() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                this.tablero[i][j] = ' ';
            }
        }

        // Colocar fichas Negras (N) en las primeras 3 filas en casillas alternas
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 8; col++) {
                if ((fila + col) % 2 == 0) {
                    this.tablero[fila][col] = 'N';
                }
            }
        }

        // Colocar fichas Rojas (R) en las últimas 3 filas en casillas alternas
        for (int fila = 5; fila < 8; fila++) {
            for (int col = 0; col < 8; col++) {
                if ((fila + col) % 2 == 0) {
                    this.tablero[fila][col] = 'R';
                }
            }
        }
    }
    public void imprimirTablero() {
        // Encabezado de columnas (números)
        System.out.print("   ");
        for (int col = 1; col <= 8; col++) {
            System.out.print(col + "   ");
        }
        System.out.println();

        // Letras de filas (A-H)
        char letraFila = 'A';
        for (int i = 0; i < 8; i++) {
            System.out.print(letraFila + "  ");
            for (int j = 0; j < 8; j++) {
                System.out.print(this.tablero[i][j] + "   ");
            }
            System.out.println();
            letraFila++;
        }
    }

    public void turno_jugador1() {
        System.out.println("\n       Turno del Jugador 1\n");
        imprimirTablero();
        System.out.println("\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("       -----Jugador 1-----\n\nIngrese la posición de la ficha que desea mover (ejemplo A3): ");
        String origen = scanner.nextLine();

        if(!validarMovimiento(origen)) {
            System.out.println("Movimiento origen inválido. Intente de nuevo.");
            turno_jugador1();
        }

        int columna_origen = origen.charAt(1) - '1';
        int fila_origen = origen.charAt(0) - 'A';

        if(!(this.tablero[fila_origen][columna_origen] == 'R')) {
            System.out.println("No hay una ficha roja en la posición de origen. Intente de nuevo.");
            turno_jugador1();
        }

        System.out.print("Ingrese la posición a la que desea mover la ficha (ejemplo B4): ");
        String destino = scanner.nextLine();

        if(!validarMovimiento(destino)) {
            System.out.println("Movimiento destino inválido. Intente de nuevo.");
            turno_jugador1();
        }

        int columna_destino = destino.charAt(1) - '1';
        int fila_destino = destino.charAt(0) - 'A';

        if(this.tablero[fila_destino][columna_destino] != ' ') {
            System.out.println("La posición de destino ya está ocupada. Intente de nuevo.");
            turno_jugador1();
        }

        if(fila_destino == fila_origen - 1 && (columna_destino == columna_origen + 1 || columna_destino == columna_origen -1)) {
            this.tablero[fila_destino][columna_destino] = 'R';
            this.tablero[fila_origen][columna_origen] = ' ';
            System.out.println("Movimiento realizado con éxito.");
            turno_jugador2();
        } else {
            System.out.println("Movimiento inválido para una ficha roja. Intente de nuevo.");
            turno_jugador1();
        }
    }

    public void turno_jugador2() {
        System.out.println("\n       Turno del Jugador 2\n");
        imprimirTablero();
        System.out.println("\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("       -----Jugador 2-----\n\nIngrese la posición de la ficha que desea mover (ejemplo A3): ");
        String origen = scanner.nextLine();

        if(!validarMovimiento(origen)) {
            System.out.println("Movimiento origen inválido. Intente de nuevo.");
            turno_jugador2();
        }

        int columna_origen = origen.charAt(1) - '1';
        int fila_origen = origen.charAt(0) - 'A';

        if(!(this.tablero[fila_origen][columna_origen] == 'N')) {
            System.out.println("No hay una ficha negra en la posición de origen. Intente de nuevo.");
            turno_jugador2();
        }

        System.out.print("Ingrese la posición a la que desea mover la ficha (ejemplo B4): ");
        String destino = scanner.nextLine();

        if(!validarMovimiento(destino)) {
            System.out.println("Movimiento destino inválido. Intente de nuevo.");
            turno_jugador2();
        }

        int columna_destino = destino.charAt(1) - '1';
        int fila_destino = destino.charAt(0) - 'A';

        if(this.tablero[fila_destino][columna_destino] != ' ') {
            System.out.println("La posición de destino ya está ocupada. Intente de nuevo.");
            turno_jugador2();
        }

        if(fila_destino == fila_origen + 1 && (columna_destino == columna_origen + 1 || columna_destino == columna_origen - 1)) {
            this.tablero[fila_destino][columna_destino] = 'N';
            this.tablero[fila_origen][columna_origen] = ' ';
            System.out.println("Movimiento realizado con éxito.");
            turno_jugador1();
        } else {
            System.out.println("Movimiento inválido para una ficha negra. Intente de nuevo.");
            turno_jugador2();
        }
    }

    private boolean validarMovimiento(String movimiento) {
        if(movimiento.charAt(0) < 'A' || movimiento.charAt(0) > 'H') {
            return false;
        }
        else if(movimiento.charAt(1) < '1' || movimiento.charAt(1) > '8') {
            return false;
        }

        return true;
    }
}
