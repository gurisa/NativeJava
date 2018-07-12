/*
  AppName: ETok (E-Toko) Versi 1.5
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
    //konstruktor inisialisasi 'engine' aplikasi ETok.
    this.AppName = "ETok (E-Toko)";
    this.AppVers = "1.4";
    this.AppAuth = "Raka Suryaardi Widjaja";

    //keyword super untuk mengubah konstruktor parent inisialisasi ETok (Toko Gurisa Devs).
    /*
    super.nama = "Gurisa Devs";
    super.alamat = "https://www.gurisa.com/";
    super.pemilik = "Raka Suryaardi Widjaja";
    super.kredit = true;
    super.status = 'A';
    */
  }

  public void informasi_toko() { //override dari method parent
    System.out.print("=== INFORMASI TOKO ===\n\n");
    System.out.print("Nama Toko         : " + nama + "\n");
    System.out.print("Alamat Toko       : " + alamat + "\n");
    System.out.print("Pemilik Toko      : " + pemilik + "\n");
    System.out.print("Pembayaran Kredit : " + rewrite_kredit(kredit) + "\n");
    System.out.print("Status Toko       : " + rewrite_status(status) + "\n");
    System.out.print("======================\n\n");//ada tambahan garis ini saja :3
    System.out.print("\n");
  }

  public String rewrite_kredit(boolean status) {//override dari method parent
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
      //penambahan status untuk melihat perbedaan override
      case 'O' : text_status = "Buka"; break;
      case 'C' : text_status = "Tutup"; break;
      default: text_status = "Tidak diketahui"; break;
    }
    return text_status;
  }

  public void informasi_barang(int max) { //menampilkan informasi toko
    int i;
    System.out.print("=== INFORMASI BARANG ===\n\n");
    if (max > 0) {
		  for (i = 0; i <= max; i++) {
		    System.out.print("Nama Barang         : " + barang[i].nama + "\n");
		    System.out.print("Jumlah Barang       : " + barang[i].jumlah + "\n");
		    System.out.print("Satuan Barang      	: " + barang[i].satuan + "\n");
		    System.out.print("Harga Barang 				: " + barang[i].harga + "\n");
		    System.out.print("\n");
		  }
    }
    else {
    	System.out.print("Tidak ada data barang.\n\n");
    }
  }

  public void tambah_barang(int counter) { //inisialisasi barang
  	Scanner input = new Scanner(System.in);
  	char confirm = 'Y';
  	int i = counter;

  	do {
  		System.out.print("=== TAMBAH BARANG ===\n\n");
	    System.out.print("Nama Barang         : ");barang[i].nama = input.nextLine();
	    System.out.print("Jumlah Barang       : ");barang[i].jumlah = input.nextInt();
	    System.out.print("Satuan Barang       : ");barang[i].satuan = input.nextLine();
	    System.out.print("Harga Barang        : ");barang[i].harga = input.nextFloat();
	    System.out.print("Tambahkan barang lagi [Y/T] : ");confirm = input.next().charAt(0);
	    i++;
      if (confirm != 'Y' || confirm != 'y') {
        break;
      }
    } while (confirm == 'Y' || confirm == 'y');
  }

  public void set_toko() {
    Scanner input = new Scanner(System.in);
    System.out.print("Nama Toko         : ");Gurisa.nama = input.nextLine();
    System.out.print("Alamat Toko       : ");Gurisa.alamat = input.nextLine();
    System.out.print("Pemilik Toko      : ");Gurisa.pemilik = input.nextLine();
    System.out.print("Pembayaran Kredit : ");Gurisa.kredit = input.nextBoolean();
    System.out.print("Status Toko       : ");Gurisa.status = input.next().charAt(0);
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
      if (confirm != 'Y' || confirm != 'y') {
        break;
      }
    } while (confirm == 'Y' || confirm == 'y');

    System.out.print("\nTotal Belanja   : " + count_jumlah_barang + " Barang = Rp" + sum_harga_barang);
    System.out.print("\nUang Dibayarkan : "); uang_dibayarkan = input.nextFloat();
    System.out.print("\nKembalian       : " + belanja_tunai.kembalian(uang_dibayarkan, sum_harga_barang));
    System.out.print("\n\n");
    System.out.print("~~~ ETok, kenyamanan tiada henti(^_^)/ ~~~\n");
    System.out.print("\n");
  }

  public void tentang() { //tentang ETok
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
      System.out.print("2. Ubah Informasi Toko (new!)\n");
      System.out.print("3. Lihat Barang\n");
      System.out.print("4. Tambah Barang (new!)\n");
      System.out.print("5. Belanja Tunai (development!)\n");
      System.out.print("6. Tentang ETok\n");
      System.out.print("0. Keluar\n\n");
      System.out.print("Pilih Menu : ");
      menu = input.nextInt();
      switch (menu) {
        case 0 : exit = true; break;
        case 1 : Gurisa.informasi_toko(); break;
        case 2 : Gurisa.set_toko(); break;
        case 3 : Gurisa.informasi_barang(Gurisa.counter);break;
        case 4 : Gurisa.tambah_barang(Gurisa.counter); break;
        case 5 : trx++; belanja_tunai(trx); break;
        case 6 : Gurisa.tentang(); break;
        default : break;
      }
    } while ((menu >= 0 || menu <= 4) && (!exit));
  }

}
