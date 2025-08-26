package IF2000_2025.IntroduccionProgra.logic;

public class Quiz3 {
  public Quiz3() {

  }

  public void ejercicioA() {
    int filas = 9;
    int columnas = 9;
    
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        if (i == 0 || i == filas - 1 || j == 0 || j == columnas - 1 || (i == filas / 2 && j == columnas / 2))  {
          System.out.print(" * ");
        } else {
          System.out.print("   ");
        }
      }
      System.out.println("");
    }
  }
}