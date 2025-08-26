package IF2000_2025.IntroduccionProgra.logic;

import java.util.Random;

public class Ejercicios_Semana2_PracticaEnClase {

  public Ejercicios_Semana2_PracticaEnClase() {

  }

  public void ejercicioA() {
    int filas = 5;
    int columnas = 5;
    
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        if (i == 0 || i == filas - 1 || j == 0 || j == columnas - 1) {
          System.out.print(" * ");
        } else {
          System.out.print("   ");
        }
      }
      System.out.println("");
    }
  }

  public void ejercicioB() {
    int fila = 12;

    for (int i = fila; i > 0; i--) {
      for (int j = i ; j > 0; j--) {
        System.out.print(" * ");
      }
      System.out.println("");
    }
  }

  public void ejercicioC() {
    int fila = 12;

    for (int i = 0; i < fila; i++) {
      for (int j = 0 ; j < i; j++) {
        System.out.print("   ");
      }

      for (int k = 0; k < fila - i; k++) {
        System.out.print(" * ");
      }
      System.out.println("");
      
    }
  }

  public void ejercicioD(int[] numeros) {
    int[] copiaOriginal = numeros.clone();
    
    for (int i = 0; i < numeros.length - 1; i++) {
      for (int j = 0; j < numeros.length - 1; j++) {
        if (numeros[j] > numeros[j + 1]) {
          int temp = numeros[j];
          numeros[j] = numeros[j + 1];
          numeros[j + 1] = temp;
        }
      }
    }
    // Mostrar resultado
    System.out.println("Números originales: ");
    for (int num : copiaOriginal) {
        System.out.print(num + " ");
    }
    System.out.println("");
    System.out.println("Ordenado ascendente: ");
    for (int num : numeros) {
        System.out.print(num + " ");
    }
    System.out.println("");
  }

  public void ejercicioE() {
    int[] numeros = new int[100];
    Random rand = new Random();

    for (int i = 0; i < numeros.length; i++) {
        numeros[i] = rand.nextInt(101);
    }

    int[] copiaOriginal = numeros.clone();
    
    for (int i = 0; i < numeros.length - 1; i++) {
      for (int j = 0; j < numeros.length - 1; j++) {
        if (numeros[j] < numeros[j + 1]) {
          int temp = numeros[j + 1];
          numeros[j + 1] = numeros[j];
          numeros[j] = temp;
        }
      }
    }

    // Mostrar resultado
    System.out.println("Números originales: ");
    for (int num : copiaOriginal) {
        System.out.print(num + " ");
    }
    System.out.println("");
    System.out.println("Ordenado descendente: ");
    for (int num : numeros) {
        System.out.print(num + " ");
    }
    System.out.println("");
  }

  public void ejercicioF() {
    // Creamos una matriz 8x8 para el tablero
    char[][] tablero = new char[8][8];

    // Inicializamos todas las casillas con espacio vacío
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            tablero[i][j] = ' ';
        }
    }

    // Colocar fichas Negras (N) en las primeras 3 filas en casillas alternas
    for (int fila = 0; fila < 3; fila++) {
        for (int col = 0; col < 8; col++) {
            if ((fila + col) % 2 == 0) {
                tablero[fila][col] = 'N';
            }
        }
    }

    // Colocar fichas Rojas (R) en las últimas 3 filas en casillas alternas
    for (int fila = 5; fila < 8; fila++) {
        for (int col = 0; col < 8; col++) {
            if ((fila + col) % 2 == 0) {
                tablero[fila][col] = 'R';
            }
        }
    }

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
            System.out.print(tablero[i][j] + "   ");
        }
        System.out.println();
        letraFila++;
    }
  }
}