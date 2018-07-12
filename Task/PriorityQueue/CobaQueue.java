import java.util.PriorityQueue;

public class CobaQueue{
    
    public static void main(String[] args){
        //buat Queue dengan nama bilangan untuk 
        //menampung bilangan bulat
        PriorityQueue<Integer> bilangan = new PriorityQueue<Integer>();
        
        //tambahkan angka 1-5 di Queue
        for (int i = 1; i <= 5; i++) {
            bilangan.add(i);
        }
        
        //munculkan angka yang ada di Queue menggunakan foreach
        for (Integer data : bilangan) {
            System.out.println(data);
        }
           
    }
}