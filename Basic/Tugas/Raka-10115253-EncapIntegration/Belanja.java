public class Belanja {
  protected String nama, satuan;
  protected int jumlah, uang_masuk, total_biaya;

  public int kembalian(int uang_masuk, int total_biaya) {
    return (uang_masuk - total_biaya);
  }

  public int biaya_barang(int harga_satuan, int jumlah_barang) {
    return (harga_satuan * jumlah_barang);
  }
}
