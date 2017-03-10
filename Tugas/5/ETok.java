/*
  AppName: ETok (E-Toko) Versi 1.1
  @Author: Raka Suryaardi Widjaja
*/

import java.util.Scanner;

public class ETok {
  public static Scanner input = new Scanner(System.in);
  public static Toko Gurisa = new Toko();

  /* kurang tepat alurnya, nanti diperbaiki */
  public static Barang barang_1 = new Barang();
  public static Barang barang_2 = new Barang();
  /* */

  public static void set_toko() { //inisialisasi toko
    Gurisa.nama = "Gurisa Devs";
    Gurisa.alamat = "https://www.gurisa.com/";
    Gurisa.pemilik = "Raka Suryaardi Widjaja";
    Gurisa.kredit = true;
    Gurisa.status = 'A';
    set_barang();
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
    System.out.print("--- ETok (E-Toko) ---\n\n");
    System.out.print("AppName: ETok (E-Toko) Versi 1.1\n");
    System.out.print("@Author: Raka Suryaardi Widjaja\n");
    System.out.print("\n");
  }

  public static void main_menu() { //menu utama aplikasi
    int menu;
    boolean exit = false;
    do {
      System.out.print("--- ETok (E-Toko) ---\n\n");
      System.out.print("1. Lihat Toko\n");
      System.out.print("2. Lihat Barang\n");
      System.out.print("3. Tentang ETok\n");
      System.out.print("0. Keluar\n\n");
      System.out.print("Pilih Menu : ");
      menu = input.nextInt();
      switch (menu) {
        case 0 : exit = true; break;
        case 1 : Gurisa.informasi_toko(); break;
        case 2 : barang_1.informasi_barang();
                 barang_2.informasi_barang();
                 break;
        case 3 : tentang(); break;
        default : break;
      }
    } while ((menu >= 0 || menu <= 3) && (!exit));
  }

  public static void main(String[] args) {
    set_toko();
    main_menu();
  }
}
