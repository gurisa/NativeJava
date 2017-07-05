package app.main;

public class Menu {
	public void main(String AppName) {
			System.out.print("=== " + AppName + " ===\n\n");
      System.out.print("1. Toko\n");
      System.out.print("2. Barang\n");
      System.out.print("3. Konsumen\n");
      System.out.print("4. Belanja\n");
      System.out.print("5. Tentang\n");
      System.out.print("6. Dokumentasi\n");
      System.out.print("0. Keluar\n\n");
      System.out.print("Pilih Menu (0/../6) : ");      
	}
	
	public void barang(String AppName) {
			System.out.print("\n=====================\n");
      System.out.print("=== " + AppName + " ===\n");
      System.out.print("==== MENU BARANG ====\n");
      System.out.print("=====================\n\n");
      System.out.print("1. Lihat Semua Barang\n");
      System.out.print("2. Lihat Barang (#Kode)\n");
      System.out.print("3. Tambah Barang\n");
      System.out.print("0. Kembali\n\n");
      System.out.print("Pilih Menu (0/../3) : ");
	}
	
	public void toko(String AppName) {
			System.out.print("\n=====================\n");
      System.out.print("=== " + AppName + " ===\n");
      System.out.print("===== MENU TOKO =====\n");
      System.out.print("=====================\n\n");
      System.out.print("1. Lihat Informasi Toko\n");
      System.out.print("2. Ubah Informasi Toko\n");
      System.out.print("0. Kembali\n\n");
      System.out.print("Pilih Menu (0/../2) : ");
	}
	
	public void konsumen(String AppName) {
	    System.out.print("\n=====================\n");
      System.out.print("=== " + AppName + " ===\n");
      System.out.print("=== MENU KONSUMEN ===\n");
      System.out.print("=====================\n\n");
      System.out.print("1. Lihat Konsumen\n");
      System.out.print("2. Tambah Konsumen\n");
      System.out.print("3. Ubah Konsumen\n");
      System.out.print("4. Hapus Konsumen\n");
      System.out.print("0. Kembali\n\n");
      System.out.print("Pilih Menu (0/../4) : ");	
	}
	
	  public void dokumentasi(String AppName, String AppAuth, String AppVers) {
	  	String msg = "\nAppName \t: " + AppName + "\n@Author \t: " + AppAuth + "\nAppVersion \t: " + AppVers + "\n\nDescription:\n";
	  	msg += "ETok (Toko Elektronik) adalah toko virtual atau biasa dikenal dengan 'Toko Online'.";
			msg += "Pengembangan ETok didasarkan pada rasa ingin tahu saya mengenai e-commerce,";
			msg += "meskipun seperti yang diketahui bahwa e-commerce dewasa kini sudah sangat 'merajarela'";
			msg += "namun bukan berarti tidak ada peluang sama sekali untuk e-commerce yang sedang menitik karirnya.";
			msg += "Pelanggan mempunyai haknya sendiri untuk belanja di tempat yang ia inginkan.\n\n";
			msg += "'Pembeli adalah raja!' ~Unknown source\n\n";
			msg += "Changelog:\n";
			msg += "1.0 \tVersi awal (ada di Folder: Tugas 4)\n";
			msg += "1.1 \tUpdate dari Tugas 4.\n";
			msg += "\tPenambahan variabel dengan tipe data yang berbeda.\n";
			msg += "1.2 \tUpdate dari Tugas 5.\n";
			msg += "\tPenambahan konstruktor, this dan atribut.\n";
			msg += "1.3 \tUpdate dari Tugas 6.\n";
			msg += "\tPengubahan class mengguankan teknik pewarisan (inheritance).\n";
			msg += "1.4 \tUpdate dari Tugas 8.\n";
			msg += "\tPenambahan metode overriding, key super dan constructor.\n";
			msg += "1.5 \tUpdate dari Tugas 10.\n";
			msg += "\tPenambahan teknik abstraksi toko.\n";
			msg += "1.6 \tUpdate dari Tugas 11.\n";
			msg += "\tPerbaikan fitur tambah barang dengan menggunakan array of object.\n";
			msg += "\tPenambahan kelas konsumen dan teknik enkapsulasi.\n";
			msg += "1.7 \tUpdate dari Tugas 12.\n";
			msg += "\tPerbaikan dan penyempurnaan fitur.\n";
			msg += "\tPenambahan teknik interface dan implementasinya.\n";
			msg += "1.8 \tUpdate dari Tugas 13.\n";
			msg += "\tPenambahan fitur Generic class.\n";
    	System.out.print(msg + "\n");
  }
}