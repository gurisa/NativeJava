import java.util.Scanner;

public class Test {
    
    public static void main(String[] args){
        //deklarasikan variabel untuk mengisi parameter yang dibutuhkan
        //nilai diinput dengan menggunakan kelas Scanner
        String nim, nama, namaUniversitas;
        Integer umur;
        Scanner input = new Scanner(System.in);

        System.out.println("\nNIM : ");nim = input.nextLine();
        System.out.println("\nNama : ");nama = input.nextLine();
        System.out.println("\nUmur : ");umur = input.nextInt();input.nextLine();
        System.out.println("\nUniversitas : ");namaUniversitas = input.nextLine();
        
        Manusia manusia = new Manusia(nama, umur);
        Mahasiswa mahasiswa = new Mahasiswa(nim, namaUniversitas, manusia);

        System.out.println(mahasiswa.getNim()); //tampilkan nim mahasiswa
        System.out.println(mahasiswa.getNama()); //tampilkan nama mahasiswa
        System.out.println(mahasiswa.getUmur()); //tampilkan umur mahasiswa
        System.out.println(mahasiswa.getNamaUniversitas()); //tampilkan nama universitas mahasiswa
    }
}