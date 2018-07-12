import java.util.LinkedList;

public class CobaLinkedList {
    
    public static void main(String[] args){
        //buat linkedlist dengan nama pecahan untuk 
        //menampung bilangan pecahan
        LinkedList<Double> pecahan = new LinkedList<Double>();
        
        //tambahkan angka 10.05; 12.78; 5.76; 4.58; 20.87 di linkedlist
		pecahan.add(10.05);
        pecahan.add(12.78);
        pecahan.add(5.76);
        pecahan.add(4.58);
        pecahan.add(20.87);
        
        //munculkan angka yang ada di linked list menggunakan foreach
        for (Double data : pecahan) {
            System.out.println(data);
        }
           
    }
}