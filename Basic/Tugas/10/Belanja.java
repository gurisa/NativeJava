public class Belanja {
  //belum digunakan, mungkin besok dilanjutkan lagi.
  protected String nama, satuan;
  protected int jumlah;
  protected float uang_masuk;
  protected float total_biaya;

  public float kembalian(float uang_masuk, float total_biaya) {
    return (uang_masuk - total_biaya);
  }

  public float biaya_barang(float harga_satuan, float jumlah_barang) {
    return (harga_satuan * jumlah_barang);
  }
}
