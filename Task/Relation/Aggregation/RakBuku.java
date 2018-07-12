import java.util.*;

public class RakBuku{
    private String merekRak;
    private List<Buku> buku;

    //buat konstruktor dari atribut yang akan ada
    public RakBuku(String merekRak, List<Buku> buku) {
        this.merekRak = merekRak;
        this.buku = buku;        
    }
    //buatlah getter dan setter sesuai dengan atribut yang akan ada
    public String getMerekRak() {
        return this.merekRak;
    }
   
    public void setMerekRak(String merekRak) {
        this.merekRak = merekRak;
    }

    public List<Buku> getBuku() {
        return buku;
    }
}