/*
  AppName: ETok (E-Toko) Versi 1.7
  @Author: Raka Suryaardi Widjaja
*/

import java.util.Scanner;

public class ETok extends Toko {
  private static String AppName, AppVers, AppAuth;
  private static Scanner input = new Scanner(System.in);
  private static ETok Gurisa = new ETok();
  private static Galat Catcher = new Galat();

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

  public void tentang() { //tentang ETok, method mandiri
    System.out.print("--- " + AppName + " ---\n\n");
    System.out.print("AppName     : " + AppName + "\n");
    System.out.print("AppVersion  : " + AppVers + "\n");
    System.out.print("AppAuthor   : " + AppAuth + "\n");
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
      case 'O' : text_status = "Buka"; break;
      case 'C' : text_status = "Tutup"; break;
      default: text_status = "Tidak diketahui"; break;
    }
    return text_status;
  }

	public boolean barangExist(int kode, int max) {
		boolean res = false;
		if ((kode >= 0) && (kode < max)) {
			res = true;
		}
		return res;
	}

	public boolean barangAvailable(int max) {
		boolean res = false;
		if (max > 0) {
			res = true;
		}
		return res;
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
      Catcher.Message("NOTEXIST");
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
    System.out.print("======================\n\n");
    System.out.print("\n");
  }

  public void set_toko() {
    input.nextLine();
    System.out.print("Nama Toko         : ");Gurisa.nama = input.nextLine();
    System.out.print("Alamat Toko       : ");Gurisa.alamat = input.nextLine();
    System.out.print("Pemilik Toko      : ");Gurisa.pemilik = input.nextLine();
    System.out.print("Pembayaran Kredit : ");Gurisa.kredit = input.nextBoolean();
    System.out.print("Status Toko       : ");Gurisa.status = input.next().charAt(0);
  }

  public void menu_konsumen() { //menu konsumen, method mandiri
    byte menu;
    boolean exit = false;

    do {
      System.out.print("=====================\n");
      System.out.print("=== " + AppName + " ===\n");
      System.out.print("=== MENU KONSUMEN ===\n");
      System.out.print("=====================\n\n");
      System.out.print("1. Lihat Informasi Pelanggan\n");
      System.out.print("2. Tambah Informasi Pelanggan\n");
      System.out.print("3. Ubah Informasi Pelanggan\n");
      System.out.print("4. Hapus Informasi Pelanggan\n");
      System.out.print("0. Kembali\n\n");
      System.out.print("Pilih Menu : ");
      while (!input.hasNextByte()) {
        System.out.print("Pilih Menu : ");
        input.next();
      }
      menu = input.nextByte();
      switch (menu) {
        case 0 : exit = true; break;
        case 1 :  break;
        case 2 :  break;
        case 3 :  break;
        case 4 :  break;
        default : break;
      }
    } while ((menu >= 0 || menu <= 4) && (!exit));
  }

  public void menu_belanja(int jumlah_transaksi, int max_barang) { //menu belanja, method mandiri
    Transaksi belanja = new Transaksi();
    char confirm = 'Y';
    int kode_barang;
    int jumlah_barang, count_jumlah_barang = 0;
    int uang_dibayarkan, total_biaya = 0, sum_harga_barang = 0;
		//do {
    	System.out.print("\n============\n");
	    System.out.print("|| TRX/" + jumlah_transaksi + " ||\n");
	    System.out.print("============\n\n");
	    do {
	      System.out.print("Kode Barang   : "); kode_barang = input.nextInt();
	      while (!Gurisa.barangExist(kode_barang, max_barang)) {
	      	System.out.print("Data Barang Tidak Ditemukan.\n");
	      	System.out.print("Kode Barang   : "); kode_barang = input.nextInt();
	      }
	      System.out.print("Nama Barang   : " + barang[kode_barang].getNama() + "\n");
	      System.out.print("Jumlah Barang : "); jumlah_barang = input.nextInt();
	      System.out.print("Harga Barang  : "+ barang[kode_barang].getHarga() + "\n");
	      total_biaya = belanja.biaya_barang(barang[kode_barang].getHarga(), jumlah_barang);
	      System.out.print("Total Biaya   : " + total_biaya + "\n\n");
	      System.out.print("Tambahkan barang lagi [Y/T] : ");confirm = input.next().charAt(0);
	      System.out.print("-------------------------------\n");
	      count_jumlah_barang += jumlah_barang;
	      sum_harga_barang += total_biaya;
	    } while (Character.toString(confirm).matches("^[yY]*$"));//regular expression, regex

	    System.out.print("\nTotal Belanja   : " + count_jumlah_barang + " Barang \t\t Rp" + sum_harga_barang);
	    System.out.print("\nUang Dibayarkan : "); uang_dibayarkan = input.nextInt();
	    System.out.print("Kembalian       : " + belanja.kembalian(uang_dibayarkan, sum_harga_barang));
	    System.out.print("\n\n");
	    Catcher.Message("JARGON");
	    System.out.print("\n");
  	//} while ();
  }

  public void menu_toko() { //menu toko, method mandiri
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
        default : break;
      }
    } while ((menu >= 0 || menu <= 2) && (!exit));
  }

  public void menu_barang(int max) { //menu barang, method mandiri
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
        case 2 : if (barangAvailable(max)) {
                    System.out.print("\nMasukan Kode Barang : ");
                    while (!input.hasNextInt()) {
                      System.out.print("Masukan Kode Barang : ");
                      input.next();
                    }
                    kode = input.nextInt();
                    if (Gurisa.barangExist(kode, max)) {
                      Gurisa.get_barang(kode);
                    }
                    else {
                      Catcher.Message("NOTEXIST");
                    }
                 }
                 else {
                   Catcher.Message("NOTEXIST");Catcher.Message("ADDDATA");
                 }
                 break;
        case 3 : Gurisa.counter = Gurisa.add_barang(max);
                 max = Gurisa.counter;
                 break;
				default : break;
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
      System.out.print("3. Konsumen\n");
      System.out.print("4. Belanja\n");
      System.out.print("5. Tentang\n");
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
        case 3 : Gurisa.menu_konsumen(); break;
        case 4 : if (Gurisa.barangAvailable(Gurisa.counter)) {
				        	 trx++; Gurisa.menu_belanja(trx, Gurisa.counter);
				         }
				         else {
				         	 Catcher.Message("NOTEXIST");Catcher.Message("ADDDATA");
				        }
         				 break;
        case 5 : Gurisa.tentang(); break;
        default : break;
      }

    } while ((menu >= 0 || menu <= 5) && (!exit));
  }
}
