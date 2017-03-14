/*
  AppName: ETok (E-Toko) Versi 1.2
  @Author: Raka Suryaardi Widjaja
*/

import java.util.Scanner;

public class ETok {
  public static String AppName;
  public static String AppVers;
  public static String AppAuth;

  public static Scanner input = new Scanner(System.in);
  public static ETok E_TOKO = new ETok();
  public static Toko Gurisa = new Toko();
  public static Barang barang_1 = new Barang();
  public static Barang barang_2 = new Barang();

  ETok() {
    //konstruktor inisialisasi 'engine' aplikasi ETok.
    this.AppName = "ETok (E-Toko)";
    this.AppVers = "1.2";
    this.AppAuth = "Raka Suryaardi Widjaja";
  }

  public static void set_barang() { //inisialisasi barang
    barang_1.nama = "Indomie Ayam Bawang";
    barang_1.jumlah = 50;
    barang_1.satuan = "Pcs";
    barang_1.harga = 2200.0f;

    barang_2.nama = "Beras Pandan Wangi";
    barang_2.jumlah = 200;
    barang_2.satuan = "Kg";
    barang_2.harga = 13000.0f;
  }

  public static void tentang() { //tentang ETok
    System.out.print("--- " + AppName + " ---\n\n");
    System.out.print("AppName     : " + AppName + "\n");
    System.out.print("AppVersion  : " + AppVers + "\n");
    System.out.print("AppAuthor   : " + AppAuth + "\n");
    System.out.print("\n");
  }

  public static void main_menu() { //menu utama aplikasi
    int menu;
    boolean exit = false;
    do {
      System.out.print("--- " + AppName + " ---\n\n");
      System.out.print("1. Lihat Toko\n");
      System.out.print("2. Lihat Barang\n");
      System.out.print("3. Belanja (new!)\n");
      System.out.print("4. Tentang ETok\n");
      System.out.print("0. Keluar\n\n");
      System.out.print("Pilih Menu : ");
      menu = input.nextInt();
      switch (menu) {
        case 0 : exit = true; break;
        case 1 : Gurisa.informasi_toko(); break;
        case 2 : set_barang();
                 barang_1.informasi_barang();
                 barang_2.informasi_barang();
                 break;
        case 3 : break;
        case 4 : tentang(); break;
        default : break;
      }
    } while ((menu >= 0 || menu <= 4) && (!exit));
  }

  public static void main(String[] args) {
    main_menu();
  }
}
