interface BelanjaTunai {
  public void test_tunai();
}

interface BelanjaKredit {
  public void test_kredit();
}

public class Belanja implements BelanjaTunai, BelanjaKredit {
  protected String nama, satuan;
  protected int jumlah, uang_masuk, total_biaya;

  public int kembalian(int uang_masuk, int total_biaya) {
    return (uang_masuk - total_biaya);
  }

  public int biaya_barang(int harga_satuan, int jumlah_barang) {
    return (harga_satuan * jumlah_barang);
  }

  public void test_tunai() {
    System.out.print("TUNAI");
  }

  public void test_kredit() {
    System.out.print("KREDIT");
  }
}
