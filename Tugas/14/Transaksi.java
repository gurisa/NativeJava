public class Transaksi implements Belanja, Pembayaran {
  private String tanggal_transaksi, waktu_transaksi;
  
  public int kembalian(int uang_masuk, int total_biaya) {
    return (uang_masuk - total_biaya);
  }

  public int biaya_barang(int harga_satuan, int jumlah_barang) {
    return (harga_satuan * jumlah_barang);
  }

  public void pembayaran_tunai() {
    //System.out.print("TUNAI"); //sementara belum digunakan
  }

  public void pembayaran_kredit() {
    //System.out.print("KREDIT"); //sementara belum digunakan
  }
}
