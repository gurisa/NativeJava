import java.util.Scanner;

class InputOutput {

  String jenis_kelamin(char kelamin) {
    String str_kelamin = "Laki-Laki";
    if (kelamin == 'P') {
      str_kelamin = "Perempuan";
    }
    return str_kelamin;
  }

  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    InputOutput kasus = new InputOutput();
    String nama;
    char kelamin;
    int tinggi;

    System.out.print("\n------------------\n");
    System.out.print("---INPUT/OUTPUT---\n");
    System.out.print("------------------\n");

    System.out.print("\nNama                : ");
    nama = input.nextLine();
    while (true) {
      System.out.print("\nJenis Kelamin (L/P) : ");
      kelamin = input.next().charAt(0);
      if (kelamin == 'L' || kelamin == 'P') {
        break;
      }
      System.out.print("Masukkan jenis kelamin dengan benar!");
    }
    String get_kelamin = kasus.jenis_kelamin(kelamin);
    System.out.print("\nTinggi (cm)         : ");
    tinggi = input.nextInt();

    System.out.print("\nHalo " + nama + ",\n");
    System.out.print("\nSelamat datang di program Input/Output sederhana.");
    System.out.print("\nBerdasarkan data yang anda masukkan berikut adalah hasil analisis kami.");
    System.out.print("\nJenis kelamin anda adalah " +  get_kelamin + " dan tinggi badan anda adalah " + tinggi + "cm.\n\n");
  }
}
