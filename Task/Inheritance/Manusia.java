public class Manusia {
    //deklarasikan atribut sesuai kelas diagram
    private String nama;
    private Integer umur;
    
    //buat konstruktor sesuai kelas diagram
    public Manusia (String nama, Integer umur) {
      this.nama = nama;
      this.umur = umur;
    }
    
    //buat getter dan setter sesuai atribut yang ada
    
    public String getNama() {
      return this.nama;
    }
    
    public void setNama(String nama) {
      this.nama = nama;
    }

    public Integer getUmur() {
      return this.umur;
    }

    public void setUmur(Integer umur) {
      this.umur = umur;
    }

}