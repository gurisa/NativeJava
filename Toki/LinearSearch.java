
import java.util.Scanner;

public class LinearSearch {
    
  public static boolean between(int data, int min, int max) {
    return (data >= min && data <= max) ? true : false;
  }

  public static int linearSearch(int[] data, int D) {
    int i;

    for (i = 0; i < data.length; i++) {
      if (data[i] == D) {
        return i;
      }
    }
    return -1;

  }

  public static void main(String[] args) {
    int i, N, D;
    Scanner Input = new Scanner(System.in);

    // do {
      N = Input.nextInt(); 
      D = Input.nextInt();
    // } while(!between(N, 1, 1000000) || !between(D, 0, 100000));
    
    int[] data = new int[N];

    for (i = 0; i < N; i++) {
      // do {
        data[i] = Input.nextInt();
      // } while(!between(data[i], 1, 1000000));
    }
    System.out.print(linearSearch(data, D));
  }
  
}