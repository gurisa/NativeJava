import java.util.Scanner;

public class Matriks3x3 {
  final byte max = 3;
  protected static Scanner input = new Scanner(System.in);
  protected Integer[][] matriksA;
  protected Integer[][] matriksB;
  protected Integer[][] matriksC;

  Matriks3x3 () {
    this.matriksA = new Integer[max][max];
    this.matriksB = new Integer[max][max];
    this.matriksC = new Integer[max][max];
  }

  public void setMatriks(char matriks) {
    byte i, j;
    if (matriks == 'A' || matriks == 'B') {
      System.out.print("Input Matriks " + matriks + " : \n");
      for (i = 0; i < max; i++) {
        for (j = 0; j < max; j++) {
          if (matriks == 'A') {
            this.matriksA[i][j] = input.nextInt();
          }
          else {
            this.matriksB[i][j] = input.nextInt();
          }
        }
        System.out.print("\n");
      }
      System.out.print("\n");
    }
    else if (matriks == 'C') {
      // shouldn't be null when operate
      for (i = 0; i < max; i++) {
        for (j = 0; j < max; j++) {
          this.matriksC[i][j] = 0;
        }
      }
    }
  }

  public void showMatriks(char matriks) {
    byte i, j;
    if (matriks == 'A' || matriks == 'B' || matriks == 'C') {
      System.out.print("Matriks " + matriks + "\n");
      System.out.print("---------\n\n");
      for (i = 0; i < max; i++) {
        for (j = 0; j < max; j++) {
          if (matriks == 'A') {
           System.out.print(this.matriksA[i][j]);
          }
          else if (matriks == 'B') {
            System.out.print(this.matriksB[i][j]);
          }
          else {
            System.out.print(this.matriksC[i][j]);
          }          
          System.out.print(" ");
        } 
        System.out.print("\n");
      }
      System.out.print("\n");
    }  
  }

  public void multiplyMatriks() {
    byte i, j, k;
    System.out.print("Kali Matriks 3x3\n");
    System.out.print("----------------\n\n");
    for (i = 0; i < max; i++) {
      for (j = 0; j < max; j++) {
        for (k = 0; k < max; k++) {
          this.matriksC[i][j] += this.matriksA[i][k] * this.matriksB[k][j];
        }
      }
    }
  }

  // public static void kali(int[][] matriksA, int[][] matriksB){
  //   byte i, j, k;
  //   int[][] matriksC = {{0,0,0},{0,0,0},{0,0,0}};
  //   for (i = 0; i < 3; i++) {
  //     for (j = 0; j < 3; j++) {
  //       for (k = 0; k < 3; k++) {
  //         matriksC[i][j] += matriksA[i][k] * matriksB[k][j];          
  //       }  
  //       System.out.print(matriksC[i][j] + " ");      
  //     }
  //     System.out.print("\n");
  //   }
  // }

  public static void main(String[] args) {
    Matriks3x3 RUN = new Matriks3x3();
    System.out.print("-------------------------\n");
    System.out.print("| Perkalian Matriks 3x3 |\n");
    System.out.print("-------------------------\n\n");
    RUN.showMatriks('A');RUN.showMatriks('B');RUN.showMatriks('C');
    RUN.setMatriks('A');RUN.setMatriks('B');RUN.setMatriks('C');
    RUN.showMatriks('A');RUN.showMatriks('B');RUN.showMatriks('C');
    RUN.multiplyMatriks();
    RUN.showMatriks('A');RUN.showMatriks('B');RUN.showMatriks('C');
    // int[][] matriksA = {{1, 2, 3}, {5, 2, 3}, {1, 2, 5}};
    // int[][] matriksB = {{6, 5, 6}, {1, 2, 3}, {4, 5, 6}};
    // kali(matriksA, matriksB);
  }

}