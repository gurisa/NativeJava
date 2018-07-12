import java.util.Scanner;

public class Test{
    
    public static void main(String[] args){
        double sisi, panjang, lebar;

        Scanner input = new Scanner(System.in);
        
        sisi = input.nextDouble();
        panjang = input.nextDouble();
        lebar = input.nextDouble();
        
        Persegi persegi = new Persegi(sisi);
        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);

        persegi.hitungLuas();
        persegi.hitungKeliling();
        
        persegiPanjang.hitungLuas();
        persegiPanjang.hitungKeliling();
    }
}