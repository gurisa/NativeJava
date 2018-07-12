import java.util.Stack;

public class CobaStack{
    
    public static void main(String[] args){
        //buat stack dengan nama bilangan untuk 
        //menampung bilangan bulat
        Stack bilangan = new Stack();
        
        //tambahkan angka 1-5 di stack
        for (int i = 1; i <= 5; i++) {
            bilangan.push(i);
        }

        //hilangkan angka 4 dan 5 dari stack        
        bilangan.pop();
        bilangan.pop();

        //munculkan angka pada elemen terakhir
        System.out.println(bilangan.peek());
           
    }
}