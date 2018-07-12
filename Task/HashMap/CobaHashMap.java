import java.util.HashMap;

public class CobaHashMap{
    
    public static void main(String[] args){
        HashMap<String,String> pasangan=new HashMap<>();
        
        pasangan.put("Hamish Daud","Raisa");
        pasangan.put("Iko Uwais","Audy");
        pasangan.put("Anjasmara","Dian Nitami");
        
        //munculkan nama istri dari masing-masing suami dengan urutan yang 
        //sesuai dengan output yang diberikan
        System.out.println(pasangan.get("Anjasmara"));
        System.out.println(pasangan.get("Hamish Daud"));
        System.out.println(pasangan.get("Iko Uwais"));
    }
}