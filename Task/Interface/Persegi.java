public class Persegi implements BangunDatar {

    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public void hitungLuas() {
        System.out.println(this.sisi * this.sisi);
    }
    
    public void hitungKeliling() {
        System.out.println(4 * this.sisi);
    }
    
}