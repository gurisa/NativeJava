/*
  AppName: ETok (E-Toko) Versi 1.7
  @Author: Raka Suryaardi Widjaja
*/

import java.util.Scanner;

public class ETok extends Toko {
  private static String AppName, AppVers, AppAuth;
  private static Scanner input = new Scanner(System.in);
  private static ETok Gurisa = new ETok();

  ETok() {
    //konstruktor inisialisasi 'engine' aplikasi ETok.
    this.AppName = "ETok (E-Toko)";
    this.AppVers = "1.7";
    this.AppAuth = "Raka Suryaardi Widjaja";

    //keyword super untuk mengubah konstruktor parent inisialisasi ETok.
    /*
    super.nama = "Gurisa Devs";
    super.alamat = "https://www.gurisa.com/";
    super.pemilik = "Raka Suryaardi Widjaja";
    super.kredit = true;
    super.status = 'A';
    */
  }

  public String rewrite_kredit(boolean status) {//override dari method parent
    /*  representasi status pembayaran kredit di toko
        dengan sedikit perbedaan kondisi true dan falsenya. */
    String text_status = "Ya";
    if (!status) {
      text_status = "Tidak";
    }
    return text_status;
  }

  public String rewrite_status(char status) {//override dari method parent
    String text_status;
    switch (status) {
      case 'A': text_status = "Aktif"; break;
      case 'N': text_status = "Tidak Aktif"; break;
      case 'B': text_status = "Diblokir"; break;
      case 'D': text_status = "Dihapus"; break;
      case 'O' : text_status = "Buka"; break;
      case 'C' : text_status = "Tutup"; break;
      default: text_status = "Tidak diketahui"; break;
    }
    return text_status;
  }

  public void get_barang(int kode) {
    System.out.print("\n=== INFORMASI BARANG ===\n\n");
    System.out.print("Kode Barang \t: " + kode + "\n");
    System.out.print("Nama Barang \t: " + barang[kode].getNama() + "\n");
    System.out.print("Jumlah Barang \t: " + barang[kode].getJumlah() + "\n");
    System.out.print("Satuan Barang \t: " + barang[kode].getSatuan() + "\n");
    System.out.print("Harga Barang \t: " + barang[kode].getHarga() + "\n");
    System.out.print("----------------------------------\n");
    System.out.print("\n");
  }

  public void get_all_barang(int max) { //menampilkan informasi toko
    int i;
    System.out.print("=== INFORMASI BARANG ===\n\n");
    if (max > 0) {
		  for (i = 0; i < max; i++) {
        System.out.print("Kode Barang \t: " + i + "\n");
		    System.out.print("Nama Barang \t: " + barang[i].getNama() + "\n");
		    System.out.print("Jumlah Barang \t: " + barang[i].getJumlah() + "\n");
		    System.out.print("Satuan Barang \t: " + barang[i].getSatuan() + "\n");
		    System.out.print("Harga Barang \t: " + barang[i].getHarga() + "\n");
		    System.out.print("----------------------------------\n");
        System.out.print("\n");
		  }
    }
    else {
    	System.out.print("Tidak ada data barang.\n\n");
    }
  }

  public int add_barang(int counter) { //inisialisasi barang
  	char confirm = 'Y';
    String nama, satuan;
    int jumlah, harga;

  	do {
  		System.out.print("=== TAMBAH BARANG ===\n\n");
      input.nextLine();
	    System.out.print("Nama Barang         : ");nama = input.nextLine();
	    System.out.print("Satuan Barang       : ");satuan = input.nextLine();
      System.out.print("Jumlah Barang       : ");jumlah = input.nextInt();
	    System.out.print("Harga Barang        : ");harga = input.nextInt();
      input.nextLine();
	    System.out.print("Tambahkan barang lagi [Y/T] : ");confirm = input.next().charAt(0);
      barang[counter] = new Barang();
      barang[counter].setBarang(nama, satuan, jumlah, harga);
	    counter++;
    } while (Character.toString(confirm).matches("^[yY]*$"));//regular expression, regex
    return counter;
  }

  public void get_toko() { //override dari method parent
    System.out.print("=== INFORMASI TOKO ===\n\n");
    System.out.print("Nama Toko         : " + nama + "\n");
    System.out.print("Alamat Toko       : " + alamat + "\n");
    System.out.print("Pemilik Toko      : " + pemilik + "\n");
    System.out.print("Pembayaran Kredit : " + rewrite_kredit(kredit) + "\n");
    System.out.print("Status Toko       : " + rewrite_status(status) + "\n");
    System.out.print("======================\n\n");//ada tambahan garis ini saja :3
    System.out.print("\n");
    /*
      bandingkan dengan method di parent,
      method di parent tidak ada garis
      penutup berupa ====== pada akhir informasi toko.
    */
    //super.informasi_toko();
  }

  public void set_toko() {
    input.nextLine();
    System.out.print("Nama Toko         : ");Gurisa.nama = input.nextLine();
    System.out.print("Alamat Toko       : ");Gurisa.alamat = input.nextLine();
    System.out.print("Pemilik Toko      : ");Gurisa.pemilik = input.nextLine();
    System.out.print("Pembayaran Kredit : ");Gurisa.kredit = input.nextBoolean();
    System.out.print("Status Toko       : ");Gurisa.status = input.next().charAt(0);
  }

  public static void menu_belanja(int jumlah_transaksi) { //fitur belanja
    Belanja tunai = new Belanja();
    tunai.test_tunai();
    tunai.test_kredit();
    char confirm = 'Y';
    String kode_barang;
    int jumlah_barang, count_jumlah_barang = 0;
    int uang_dibayarkan, total_biaya = 0, sum_harga_barang = 0;

    System.out.print("\n======\n");
    System.out.print("TRX/" + jumlah_transaksi + "\n");
    System.out.print("======\n\n");
    do {
      //kode_barang = "";
      //System.out.print("Kode Barang   : ");
      //kode_barang = input.nextLine(); //ceritanya cek dari database.
      /*
      System.out.print("Nama Barang   : " + barang_1.nama + "\n");//ceritanya cek dari database.
      System.out.print("Jumlah Barang : "); jumlah_barang = input.nextInt();
      System.out.print("Harga Barang  : " + barang_1.harga + "\n"); //ceritanya cek dari database.
      total_biaya = tunai.biaya_barang(barang_1.harga, jumlah_barang);
      System.out.print("Total Biaya   : " + total_biaya + "\n\n");
			*/
      System.out.print("Tambahkan barang lagi [Y/T] : ");confirm = input.next().charAt(0);
      System.out.print("-------------------------------\n");
      //count_jumlah_barang += jumlah_barang;
      //sum_harga_barang += total_biaya;
      if (confirm != 'Y' || confirm != 'y') {
        break;
      }
    } while (confirm == 'Y' || confirm == 'y');

    System.out.print("\nTotal Belanja   : " + count_jumlah_barang + " Barang = Rp" + sum_harga_barang);
    System.out.print("\nUang Dibayarkan : "); uang_dibayarkan = input.nextInt();
    System.out.print("\nKembalian       : " + tunai.kembalian(uang_dibayarkan, sum_harga_barang));
    System.out.print("\n\n");
    System.out.print("~~~ ETok, kenyamanan tiada henti(^_^)/ ~~~\n");
    System.out.print("\n");
  }

  public void tentang() { //tentang ETok, method mandiri
    System.out.print("--- " + AppName + " ---\n\n");
    System.out.print("AppName     : " + AppName + "\n");
    System.out.print("AppVersion  : " + AppVers + "\n");
    System.out.print("AppAuthor   : " + AppAuth + "\n");
    System.out.print("\n");
  }

  public static void menu_toko() { //menu barang, method mandiri
    int kode;
    byte menu;
    boolean exit = false;

    do {
      System.out.print("=====================\n");
      System.out.print("=== " + AppName + " ===\n");
      System.out.print("===== MENU TOKO =====\n");
      System.out.print("=====================\n\n");
      System.out.print("1. Lihat Informasi Toko\n");
      System.out.print("2. Ubah Informasi Toko\n");
      System.out.print("0. Kembali\n\n");
      System.out.print("Pilih Menu : ");
      while (!input.hasNextByte()) {
        System.out.print("Pilih Menu : ");
        input.next();
      }
      menu = input.nextByte();
      switch (menu) {
        case 0 : exit = true; break;
        case 1 : Gurisa.get_toko(); break;
        case 2 : Gurisa.set_toko(); break;
      }
    } while ((menu >= 0 || menu <= 2) && (!exit));
  }

  public static void menu_barang(int max) { //menu barang, method mandiri
    int kode;
    byte menu;
    boolean exit = false;

    do {
      System.out.print("=====================\n");
      System.out.print("=== " + AppName + " ===\n");
      System.out.print("==== MENU BARANG ====\n");
      System.out.print("=====================\n\n");
      System.out.print("1. Lihat Semua Barang\n");
      System.out.print("2. Lihat Barang (#Kode)\n");
      System.out.print("3. Tambah Barang\n");
      System.out.print("0. Kembali\n\n");
      System.out.print("Pilih Menu : ");
      while (!input.hasNextByte()) {
        System.out.print("Pilih Menu : ");
        input.next();
      }
      menu = input.nextByte();
      switch (menu) {
        case 0 : exit = true; break;
        case 1 : Gurisa.get_all_barang(max); break;
        case 2 : System.out.print("\nMasukan Kode Barang : ");
                 while (!input.hasNextInt()) {
                   System.out.print("Masukan Kode Barang : ");
                   input.next();
                 }
                 kode = input.nextInt();
                 if ((kode >= 0) && (kode < max)) {
                   Gurisa.get_barang(kode);
                 }
                 else {
                   System.out.print("Data Barang Tidak Ditemukan.\n\n");
                 }
                 break;
        case 3 : Gurisa.counter = Gurisa.add_barang(max);
                 max = Gurisa.counter;
                 break;
      }
    } while ((menu >= 0 || menu <= 3) && (!exit));
  }

  public static void main(String[] args) { //program utama
    int trx = 0;
    byte menu;
    boolean exit = false;

    do {
      System.out.print("=== " + AppName + " ===\n\n");
      System.out.print("1. Toko\n");
      System.out.print("2. Barang\n");
      System.out.print("3. Belanja\n");
      System.out.print("4. Tentang\n");
      System.out.print("0. Keluar\n\n");
      System.out.print("Pilih Menu : ");
      while (!input.hasNextByte()) {
        System.out.print("Pilih Menu : ");
        input.next();
      }
      menu = input.nextByte();
      switch (menu) {
        case 0 : exit = true; break;
        case 1 : Gurisa.menu_toko(); break;
        case 2 : Gurisa.menu_barang(Gurisa.counter); break;
        case 3 : trx++; menu_belanja(trx); break;
        case 4 : Gurisa.tentang(); break;
        default : break;
      }

    } while ((menu >= 0 || menu <= 4) && (!exit));
  }
}
