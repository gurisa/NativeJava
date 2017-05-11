import java.util.Scanner;

public abstract class Toko {
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

  protected abstract void informasi_toko();
  protected abstract String rewrite_kredit(boolean status);
  protected abstract String rewrite_status(char status);
  protected abstract void informasi_barang(int max);
}
