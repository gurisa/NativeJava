public class Barang {
  protected String nama, satuan;
  protected int jumlah;
  protected float harga;
	
  public void informasi_barang() { //menampilkan informasi barang
    System.out.print("-- INFORMASI Barang --\n\n");
    System.out.print("Nama Barang     : " + nama + "\n");
    System.out.print("Jumlah Barang   : " + jumlah + " " + satuan + "\n");
    System.out.print("Harga Barang    : " + harga + "\n");
    System.out.print("\n");
  }
}
