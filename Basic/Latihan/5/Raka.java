public class Raka extends Mahasiswa {
  protected void kuliah(String nama, String waktu) {
    System.out.print(nama + " kuliah pada " + waktu + "\n");
  }

  protected void lulus(String nama, int nilai) {
    if (nilai >= 70) {
      System.out.print("Selamat, " + nama + " anda lulus dengan nilai " + nilai + "\n");
    }
  }

  protected void tdklulus(String nama, int nilai) {
    if (nilai < 70) {
      System.out.print("Maaf, " + nama + " anda belum lulus dengan nilai " + nilai + "\n");
    }
  }

  public static void main(String[] args) {
    Mahasiswa mhs = new Raka();
    mhs.kuliah("Raka S.W.","Selasa s.d. Jumat");
    mhs.lulus("Raka S.W.", 100);
    mhs.tdklulus("Raka S.W.", 50);
  }
}
