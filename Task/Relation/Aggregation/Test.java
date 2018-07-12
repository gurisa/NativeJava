import java.util.*;

public class Test{
    
    public static void main(String[] args){
        //instansiasi objek dari kelas yang dibutuhkan
        //merek rak: Olympic; judul buku: Harry Potter
        Buku buku1 = new Buku("Harry Potter");
                
        //relasikan dua kelas tersebut dalam bentuk aggregation
        List <Buku> buku = new ArrayList<Buku>();
        buku.add(buku1);
        RakBuku rak1 = new RakBuku("Olympic", buku);

        //tampilkan merek rak dan judul buku        
        System.out.println(rak1.getMerekRak());

        List <Buku> books = rak1.getBuku();
        for (Buku book : books) {
            System.out.println(book.getJudulBuku());
        }
                
    }
}