//gunakan konsep inheritance pada java (lihat kelas diagram)
public class Mahasiswa extends Manusia {
    //deklarasikan atribut sesuai kelas diagram
    private String nim, namaUniversitas;

    //buat konstruktor sesuai kelas diagram
    public Mahasiswa(String nim, String namaUniversitas, Manusia manusia) {
      super(manusia.getNama(), manusia.getUmur());
      this.nim = nim;
      this.namaUniversitas = namaUniversitas;
    }
    
    //buat getter dan setter sesuai kelas diagram
    public String getNim() {
      return this.nim;
    }
    
    public void setNim(String nim) {
      this.nim = nim;
    }

    public String getNamaUniversitas() {
      return this.namaUniversitas;
    }
    
    public void setNamaUniversitas(String namaUniversitas) {
      this.namaUniversitas = namaUniversitas;
    }
    
}