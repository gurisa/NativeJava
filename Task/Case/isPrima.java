
class isPrima {

  public static boolean isPrima(int bilangan) {
    int i, counter = 0;
    if (bilangan > 1) {
      for (i = 1; i <= bilangan; i++) {
        if (bilangan % i == 0) {
          counter++;
        }
      }
    }
    return (counter == 2 ? true : false);
  }

  public static void main(String[] args) {
    int i;
    for (i = -100; i <= 100; i++) {
      // if (isPrima(i)) {
        System.out.print(i + " " + isPrima(i) + "\n");
      // }
      
    }
    
  }
}