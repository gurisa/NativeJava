import java.util.Scanner;

public class Test {
  
  public static void main(String[] args) {
      double sisi, panjang, lebar;
      
      Scanner input = new Scanner(System.in);

      sisi = input.nextDouble();
      panjang = input.nextDouble();
      lebar = input.nextDouble();

      Persegi persegi = new Persegi(sisi);
      PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);

      Persegi.siapaKamu();
      persegi.hitungLuas();
      persegi.hitungKeliling();

      PersegiPanjang.siapaKamu();
      persegiPanjang.hitungLuas();
      persegiPanjang.hitungKeliling();
  }
}