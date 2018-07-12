public class Test {
    
    public static void main(String[] args){
        //instansiasi objek dari kelas makanan dan kelas provinsi
        //nama makanan: nasi padang; asal provinsi: Sumatra Barat
        Makanan makanan = new Makanan("Nasi Padang");
        Provinsi provinsi = new Provinsi("Sumatra Barat");
        
        //relasikan dua kelas tersebut dalam bentuk assosiasi
        
        
        //tampilkan nama makanan dan asal provinsinya 
        System.out.println(makanan.getNamaMakanan());
        System.out.println(provinsi.getNamaProvinsi());
        
    }
}