public class Toko {
  protected String nama, pemilik, alamat;
  protected char status;
  protected boolean kredit;

  Toko() {
    //konstruktor untuk inisialisasi Toko.
    nama = "(nil)";
    pemilik = "(nil)";
    alamat = "(nil)";
    status = 'N';
    kredit = false;
  }
  
  public String rewrite_kredit(boolean status) {
    //representasi status pembayaran kredit di toko
    String text_status = "Tidak";
    if (status) {
      text_status = "Ya";
    }
    return text_status;
  }

  public String rewrite_status(char status) { //representasi status toko
    String text_status;
    switch (status) {
      case 'A': text_status = "Aktif"; break;
      case 'N': text_status = "Tidak Aktif"; break;
      case 'B': text_status = "Diblokir"; break;
      case 'D': text_status = "Dihapus"; break;
      default: text_status = "Tidak diketahui"; break;
    }
    return text_status;
  }

  public void informasi_toko() { //menampilkan informasi toko
    System.out.print("=== INFORMASI TOKO ===\n\n");
    System.out.print("Nama Toko         : " + nama + "\n");
    System.out.print("Alamat Toko       : " + alamat + "\n");
    System.out.print("Pemilik Toko      : " + pemilik + "\n");
    System.out.print("Pembayaran Kredit : " + rewrite_kredit(kredit) + "\n");
    System.out.print("Status Toko       : " + rewrite_status(status) + "\n");
    System.out.print("\n");
  }
}
