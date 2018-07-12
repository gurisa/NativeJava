import java.util.Scanner;

public class Toko {
  protected String nama, pemilik, alamat;
  protected char status;
  protected boolean kredit;
  protected int counter = 0;
  protected final int max_barang = 100;
  protected Barang[] barang = new Barang[max_barang];
		
  Toko() {
    //konstruktor untuk inisialisasi Toko.
    nama = "(nil)";
    pemilik = "(nil)";
    alamat = "(nil)";
    status = 'N';
    kredit = false;
  }
  
  public String rewrite_kredit(boolean status) {
    //representasi status pembayaran kredit di toko
    String text_status = "Tidak";
    if (status) {
      text_status = "Ya";
    }
    return text_status;
  }

  public String rewrite_status(char status) { //representasi status toko
    String text_status;
    switch (status) {
      case 'A': text_status = "Aktif"; break;
      case 'N': text_status = "Tidak Aktif"; break;
      case 'B': text_status = "Diblokir"; break;
      case 'D': text_status = "Dihapus"; break;
      default: text_status = "Tidak diketahui"; break;
    }
    return text_status;
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
    
  public void informasi_toko() { //menampilkan informasi toko
    System.out.print("=== INFORMASI TOKO ===\n\n");
    System.out.print("Nama Toko         : " + nama + "\n");
    System.out.print("Alamat Toko       : " + alamat + "\n");
    System.out.print("Pemilik Toko      : " + pemilik + "\n");
    System.out.print("Pembayaran Kredit : " + rewrite_kredit(kredit) + "\n");
    System.out.print("Status Toko       : " + rewrite_status(status) + "\n");
    System.out.print("\n");
  }
}
