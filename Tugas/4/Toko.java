public class Toko {
  protected String nama, alamat;
  protected String pemilik;

  public void informasi_toko() {
      System.out.print("-- INFORMASI TOKO --\n\n");
      System.out.print("Nama Toko       : " + nama + "\n");
      System.out.print("Alamat Toko     : " + alamat + "\n");
      System.out.print("Pemilik Toko    : " + pemilik + "\n");
      System.out.print("\n");
  }
}
