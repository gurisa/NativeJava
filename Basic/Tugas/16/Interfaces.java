package app.main;

interface StrukturKonsumen {
  public String rewriteGender(char kode);
}

interface Belanja {
  public int kembalian(int uang_masuk, int total_biaya);
  public int biaya_barang(int harga_satuan, int jumlah_barang);
}

interface Pembayaran {
  public void pembayaran_tunai();
  public void pembayaran_kredit();
}
