/*
  AppName: ETok (E-Toko) Versi 1.3
  @Author: Raka Suryaardi Widjaja
*/

import java.util.Scanner;

public class ETok extends Toko {
  public static String AppName;
  public static String AppVers;
  public static String AppAuth;

  public static ETok Gurisa = new ETok();
  public static Barang barang_1 = new Barang();
  public static Barang barang_2 = new Barang();

  ETok() {
    //konstruktor untuk inisialisasi ETok (Gurisa Devs).
    super.nama = "Gurisa Devs";
    super.alamat = "https://www.gurisa.com/";
    super.pemilik = "Raka Suryaardi Widjaja";
    super.kredit = true;
    super.status = 'A';

    //konstruktor inisialisasi 'engine' aplikasi ETok.
    this.AppName = "ETok (E-Toko)";
    this.AppVers = "1.3";
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

  public static void belanja_tunai(int jumlah_transaksi) { //fitur belanja
    Scanner input = new Scanner(System.in);
    Belanja belanja_tunai = new Belanja();

    char confirm = 'Y';
    String kode_barang;
    int jumlah_barang, count_jumlah_barang = 0;
    float uang_dibayarkan, total_biaya = 0, sum_harga_barang = 0;

    System.out.print("\n======\n");
    System.out.print("TRX/" + jumlah_transaksi + "\n");
    System.out.print("======\n\n");
    do {
      //kode_barang = "";
      //System.out.print("Kode Barang   : ");
      //kode_barang = input.nextLine(); //ceritanya cek dari database.
      System.out.print("Nama Barang   : " + barang_1.nama + "\n");//ceritanya cek dari database.
      System.out.print("Jumlah Barang : ");
      jumlah_barang = input.nextInt();
      System.out.print("Harga Barang  : " + barang_1.harga + "\n"); //ceritanya cek dari database.
      total_biaya = belanja_tunai.biaya_barang(barang_1.harga, jumlah_barang);
      System.out.print("Total Biaya   : " + total_biaya + "\n\n");

      System.out.print("Tambahkan barang lagi [Y/T] : ");confirm = input.next().charAt(0);
      System.out.print("-------------------------------\n");
      count_jumlah_barang += jumlah_barang;
      sum_harga_barang += total_biaya;
      if (confirm != 'Y') {
        break;
      }
    } while (confirm == 'Y');

    System.out.print("\nTotal Belanja   : " + count_jumlah_barang + " Barang = Rp" + sum_harga_barang);
    System.out.print("\nUang Dibayarkan : "); uang_dibayarkan = input.nextFloat();
    System.out.print("\nKembalian       : " + belanja_tunai.kembalian(uang_dibayarkan, sum_harga_barang));
    System.out.print("\n\n");
    System.out.print("~~~ ETok, kenyamanan tiada henti(^_^)/ ~~~\n");
    System.out.print("\n");
  }

  public static void tentang() { //tentang ETok
    System.out.print("--- " + AppName + " ---\n\n");
    System.out.print("AppName     : " + AppName + "\n");
    System.out.print("AppVersion  : " + AppVers + "\n");
    System.out.print("AppAuthor   : " + AppAuth + "\n");
    System.out.print("\n");
  }

  public static void main(String[] args) { //program utama
    Scanner input = new Scanner(System.in);

    int menu, trx = 0;
    boolean exit = false;
    set_barang();

    do {
      System.out.print("=== " + AppName + " ===\n\n");
      System.out.print("1. Lihat Toko\n");
      System.out.print("2. Lihat Barang\n");
      System.out.print("3. Belanja Tunai (development!)\n");
      System.out.print("4. Tentang ETok\n");
      System.out.print("0. Keluar\n\n");
      System.out.print("Pilih Menu : ");
      menu = input.nextInt();
      switch (menu) {
        case 0 : exit = true; break;
        case 1 : Gurisa.informasi_toko(); break;
        case 2 : barang_1.informasi_barang();
                 barang_2.informasi_barang();
                 break;
        case 3 : trx++; belanja_tunai(trx); break;
        case 4 : tentang(); break;
        default : break;
      }
    } while ((menu >= 0 || menu <= 4) && (!exit));
  }
}
