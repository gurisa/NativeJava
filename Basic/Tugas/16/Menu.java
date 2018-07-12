package app.main;

public class Menu {
	public void main(String AppName) {
			System.out.print("=== " + AppName + " ===\n\n");
      System.out.print("1. Toko\n");
      System.out.print("2. Barang\n");
      System.out.print("3. Konsumen\n");
      System.out.print("4. Belanja\n");
      System.out.print("5. Tentang\n");
      System.out.print("0. Keluar\n\n");
      System.out.print("Pilih Menu : ");      
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
      System.out.print("Pilih Menu : ");
	}
	
	public void toko(String AppName) {
			System.out.print("\n=====================\n");
      System.out.print("=== " + AppName + " ===\n");
      System.out.print("===== MENU TOKO =====\n");
      System.out.print("=====================\n\n");
      System.out.print("1. Lihat Informasi Toko\n");
      System.out.print("2. Ubah Informasi Toko\n");
      System.out.print("0. Kembali\n\n");
      System.out.print("Pilih Menu : ");
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
      System.out.print("Pilih Menu : ");	
	}
}