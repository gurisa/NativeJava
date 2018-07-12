/*
  AppName: ETok (E-Toko) Versi 1.8
  @Author: Raka Suryaardi Widjaja
*/

package app.main;

import java.util.Scanner;
import app.engine.Galat;
import app.engine.Operations;

public class ETok extends Toko  {
  private static String AppName, AppVers, AppAuth;
  
  private static Scanner Input = new Scanner(System.in);
  private static ETok Gurisa = new ETok();
  private static Galat Catcher = new Galat();
	private static Menu Menu = new Menu();
	private static Operations<String> Me = new Operations<String>();
	
  ETok() {
    //konstruktor inisialisasi 'engine' aplikasi ETok.
    this.AppName = "ETok (E-Toko)";
    this.AppVers = "1.8";
    this.AppAuth = "Raka Suryaardi Widjaja";
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
      case 'O': text_status = "Buka"; break;
      case 'C': text_status = "Tutup"; break;
      default: text_status = "Tidak diketahui"; break;
    }
    return text_status;
  }

	public boolean barang_exist(int kode, int max) {
		boolean res = false;
		if ((kode >= 0) && (kode < max)) {
			res = true;
		}
		return res;
	}

	public boolean barang_available(int max) {
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
    System.out.print("\n=== INFORMASI BARANG ===\n\n");
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
      Catcher.message("NOTEXIST");
    }
  }

  public int add_barang(int counter_barang) { //inisialisasi barang
  	char confirm = 'Y';
    String nama, satuan;
    int jumlah, harga;

  	do {
  		System.out.print("\n=== TAMBAH BARANG ===\n\n");
      Input.nextLine();
	    System.out.print("Nama Barang         : ");nama = Input.nextLine();
	    System.out.print("Satuan Barang       : ");satuan = Input.nextLine();
      System.out.print("Jumlah Barang       : ");jumlah = Input.nextInt();
	    System.out.print("Harga Barang        : ");harga = Input.nextInt();
      Input.nextLine();
	    System.out.print("Tambahkan barang lagi [Y/T] : ");confirm = Input.next().charAt(0);
      barang[counter_barang] = new Barang();
      barang[counter_barang].setBarang(nama, satuan, jumlah, harga);
	    counter_barang++;
    } while (Character.toString(confirm).matches("^[yY]*$"));//regular expression, regex
    return counter_barang;
  }

  public void get_toko() { //override dari method parent
    System.out.print("\n=== INFORMASI TOKO ===\n\n");
    System.out.print("Nama Toko         : " + nama + "\n");
    System.out.print("Alamat Toko       : " + alamat + "\n");
    System.out.print("Pemilik Toko      : " + pemilik + "\n");
    System.out.print("Pembayaran Kredit : " + rewrite_kredit(kredit) + "\n");
    System.out.print("Status Toko       : " + rewrite_status(status) + "\n");
    System.out.print("======================\n\n");
    System.out.print("\n");
  }

  public void set_toko() {
    Input.nextLine();
    System.out.print("Nama Toko         \t\t: ");Gurisa.nama = Input.nextLine();
    System.out.print("Alamat Toko       \t\t: ");Gurisa.alamat = Input.nextLine();
    System.out.print("Pemilik Toko      \t\t: ");Gurisa.pemilik = Input.nextLine();
    System.out.print("Pembayaran Kredit [true/false] \t: ");Gurisa.kredit = Input.nextBoolean();
    System.out.print("Status Toko [A/N/B/D/O/C] \t: ");Gurisa.status = Input.next().charAt(0);
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
	      System.out.print("Kode Barang   : "); kode_barang = Input.nextInt();
	      while (!Gurisa.barang_exist(kode_barang, max_barang)) {
	      	System.out.print("Data Barang Tidak Ditemukan.\n");
	      	System.out.print("Kode Barang   : "); kode_barang = Input.nextInt();
	      }
	      System.out.print("Nama Barang   : " + barang[kode_barang].getNama() + "\n");
	      System.out.print("Jumlah Barang : "); jumlah_barang = Input.nextInt();
	      System.out.print("Harga Barang  : "+ barang[kode_barang].getHarga() + "\n");
	      total_biaya = belanja.biaya_barang(barang[kode_barang].getHarga(), jumlah_barang);
	      System.out.print("Total Biaya   : " + total_biaya + "\n\n");
	      System.out.print("Tambahkan barang lagi [Y/T] : ");confirm = Input.next().charAt(0);
	      System.out.print("-------------------------------\n");
	      count_jumlah_barang += jumlah_barang;
	      sum_harga_barang += total_biaya;
	    } while (Character.toString(confirm).matches("^[yY]*$"));//regular expression, regex

	    System.out.print("\nTotal Belanja   : " + count_jumlah_barang + " Barang \t\t Rp" + sum_harga_barang);
	    System.out.print("\nUang Dibayarkan : "); uang_dibayarkan = Input.nextInt();
	    System.out.print("Kembalian       : " + belanja.kembalian(uang_dibayarkan, sum_harga_barang));
	    System.out.print("\n\n");
	    Catcher.message("JARGON");
	    System.out.print("\n");
  	//} while ();
  }
  
  public void menu_konsumen() { //menu konsumen, method mandiri
    byte menu;
    boolean exit = false;

    do {
			Menu.konsumen(AppName);
      while (!Input.hasNextByte()) {
        System.out.print("Pilih Menu : ");
        Input.next();
      }
      menu = Input.nextByte();
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
  
  public void menu_toko() { //menu toko, method mandiri
    byte menu;
    boolean exit = false;

    do {
      Menu.toko(AppName);
      while (!Input.hasNextByte()) {
        System.out.print("Pilih Menu : ");
        Input.next();
      }
      menu = Input.nextByte();
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
      Menu.barang(AppName);
      while (!Input.hasNextByte()) {
        System.out.print("Pilih Menu : ");
        Input.next();
      }
      menu = Input.nextByte();
      switch (menu) {
        case 0 : exit = true; break;
        case 1 : Gurisa.get_all_barang(max); break;
        case 2 : if (barang_available(max)) {
                    System.out.print("\nMasukan Kode Barang : ");
                    while (!Input.hasNextInt()) {
                      System.out.print("Masukan Kode Barang : ");
                      Input.next();
                    }
                    kode = Input.nextInt();
                    if (Gurisa.barang_exist(kode, max)) {
                      Gurisa.get_barang(kode);
                    }
                    else {
                      Catcher.message("NOTEXIST");
                    }
                 }
                 else {
                   Catcher.message("NOTEXIST");Catcher.message("ADDDATA");
                 }
                 break;
        case 3 : Gurisa.counter_barang = Gurisa.add_barang(max);
                 max = Gurisa.counter_barang;
                 break;
				default : break;
      }
    } while ((menu >= 0 || menu <= 3) && (!exit));
  }

  public static void main(String[] args) { //program utama
    int trx = 0;
    byte menu;
    boolean exit = false;
		//Me.print(Me.count_r(trx));
				
    do {      
			Menu.main(AppName);
			while (!Input.hasNextByte()) {
        System.out.print("Pilih Menu : ");
        Input.next();
      }
      menu = Input.nextByte();
      switch (menu) {
        case 0 : exit = true; break;
        case 1 : Gurisa.menu_toko(); break;
        case 2 : Gurisa.menu_barang(Gurisa.counter_barang); break;
        case 3 : Gurisa.menu_konsumen(); break;
        case 4 : if (Gurisa.barang_available(Gurisa.counter_barang)) {
				        	 trx++; Gurisa.menu_belanja(trx, Gurisa.counter_barang);
				         }
				         else {
				         	 Catcher.message("NOTEXIST");Catcher.message("ADDDATA");
				        }
         				 break;
        case 5 : Gurisa.tentang(); break;
        default : break;
      }
    } while ((menu >= 0 || menu <= 5) && (!exit));
  }
}
