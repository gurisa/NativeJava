public class PersegiPanjang extends BangunDatar {
  private double panjang, lebar;

  public PersegiPanjang(double panjang, double lebar) {
    this.panjang = panjang;
    this.lebar = lebar;
  }

  public void hitungLuas() {
    System.out.println(this.panjang * this.lebar);
  }

  public void hitungKeliling() {
    System.out.println(2 * (this.panjang + this.lebar));
  }

  public static void siapaKamu() {
    System.out.println("Saya Persegi Panjang");
  }

}