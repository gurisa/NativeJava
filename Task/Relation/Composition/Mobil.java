import java.util.*;

public class Mobil {
    private String merekMobil;
    private final List<Roda> roda;

    //buat konstruktor dari atribut yang akan ada
    public Mobil(String merekMobil, List<Roda> roda){
        this.merekMobil = merekMobil;
        this.roda = roda;
    }
    
    //buatlah getter dan setter sesuai dengan atribut yang akan ada
    public String getMerekMobil() {
        return this.merekMobil;
    }
   
    public void setMerekMobil(String merekMobil) {
        this.merekMobil = merekMobil;
    }
    
    public List<Roda> getRoda(){         
        return roda;  
    }

}