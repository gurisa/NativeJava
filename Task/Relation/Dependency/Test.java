public class Test{
    
    public static void main(String[] args){
        //instansiasi objek dari kelas yang dibutuhkan
        //nama penumpang: Budi; nomor bus: 10
        Penumpang penumpang = new Penumpang("Budi");
                
        //relasikan dua kelas tersebut dalam bentuk dependency
        Bus bus = new Bus("10", penumpang);
        
        //tampilkan nama penumpang dan nomor bus
        System.out.println(bus.getPenumpang().getNamaPenumpang());
        System.out.println(bus.getNomorBus());
        
    }
}