interface StrukturGalat {
  public void message(String kode);
}

interface StrukturKonsumen {
  public String rewriteGender(char kode);
  //public String konsumenExist(char kode);
}

interface Konfigurasi {
	private String Name, Version, Author;
}

interface Belanja {
  public int kembalian(int uang_masuk, int total_biaya);
  public int biaya_barang(int harga_satuan, int jumlah_barang);
}

interface Pembayaran {
  public void pembayaran_tunai();
  public void pembayaran_kredit();
}
