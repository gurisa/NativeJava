public class Bus{
    private String nomorBus;
    private Penumpang penumpang;

    //buat konstruktor dari atribut yang akan ada
    public Bus(String nomorBus, Penumpang penumpang){
        this.nomorBus = nomorBus;
        this.penumpang = penumpang;
    }
    
    //buatlah getter dan setter sesuai dengan atribut yang akan ada
    public String getNomorBus() {
        return this.nomorBus;
    }
   
    public void setNomorBus(String nomorBus) {
        this.nomorBus = nomorBus;
    }
    
    public Penumpang getPenumpang(){         
        return penumpang;  
    }
    
    public void setPenumpang(Penumpang penumpang){         
        this.penumpang = penumpang;
    }

}