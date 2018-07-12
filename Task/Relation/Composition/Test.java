import java.util.*;

public class Test{
    
    public static void main(String[] args){
        //instansiasi objek dari kelas yang dibutuhkan
        //merek mobil: BMW; merek roda: BridgeStone
        Roda roda1 = new Roda("BridgeStone");
        List<Roda> roda = new ArrayList<Roda>();
        roda.add(roda1);
        
        //relasikan dua kelas tersebut dalam bentuk composition        
        Mobil mobil = new Mobil("BMW", roda);

        //tampilkan merek mobil dan merek roda
        System.out.println(mobil.getMerekMobil());

        List <Roda> rodas = mobil.getRoda();
        for (Roda data : rodas) {
            System.out.println(data.getMerekRoda());
        }
        
    }
}