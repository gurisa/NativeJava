/*
  AppName: ETok (E-Toko) Versi 1.0
  @Author: Raka Suryaardi Widjaja
*/

public class ETok {
  public static void main(String[] args) {
    Toko Gurisa = new Toko();
    Gurisa.nama = "Toko Gurisa";
    Gurisa.alamat = "https://www.gurisa.com/";
    Gurisa.pemilik = "Raka Suryaardi Widjaja";
    Gurisa.informasi_toko();

    Barang barang_1 = new Barang();
    Barang barang_2 = new Barang();

    barang_1.nama = "Indomie Ayam Bawang";
    barang_1.jumlah = 50;
    barang_1.satuan = "Pcs";
    barang_1.harga = 2200.00;
    barang_1.informasi_barang();

    barang_1.nama = "Beras Pandan Wangi";
    barang_1.jumlah = 200;
    barang_1.satuan = "Kg";
    barang_1.harga = 13000.00;
    barang_1.informasi_barang();
  }
}
