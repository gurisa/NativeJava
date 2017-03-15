import java.util.Scanner;

public class Quiz {
  public static Scanner input = new Scanner(System.in);

  public static int isWithinRange(float x, float min, float max) { //memeriksa range nilai
    byte result = 1;//return 1 jika x diantara min dan max, selain itu return 0
    if (x < min || x > max) {
      result = 0;
    }
    return result;
  }

  public static void main(String[] args) {
    float grade_points = 0, sum_grade_points = 0, average_students = 0;
    int count_students = 0, passed_students = 0, failed_students = 0;
    boolean exit = false;

    /*
      ---------------------------------------------------------
                                Data
      ---------------------------------------------------------
      1. Banyak Mahasiswa dengan IP Valid;
      2. Banyak Mahasiswa lulus; (grade_points >= 2.75)
      3. Banyak Mahasiswa tidak lulus;
      4. Rata-rata IP (grade_points) di kelas tersebut,
         data grade_points salah diabaikan;
      5. Jika tidak ada IP valid, tampilkan pesan "Tidak ada data".
      ---------------------------------------------------------
    */
    System.out.println("Mulai menjalankan aplikasi.");
    System.out.println("Catatan: Perhatikan pengaturan 'seperator' dan 'decimal delimiter'.");
    System.out.println("\n--------------------------------------\n");
    
    do {
      System.out.print("Masukan IP Mahasiswa                : ");
      grade_points = input.nextFloat();
      if (isWithinRange(grade_points, 0f, 4f) == 1) {
        count_students++;
        if (isWithinRange(grade_points, 2.75f, 4f) == 1) {
          passed_students++;
        }
        else {
          failed_students++;
        }
        sum_grade_points += grade_points;
      }
      else if (grade_points == -999) {
        exit = true;
      }
      else {
        //abaikan
      }
    } while (!exit);

    System.out.println("\n--------------------------------------\n");
    if (count_students > 0) {
      average_students = sum_grade_points / count_students;
      System.out.println("Banyak Mahasiswa                    : " + count_students);
      System.out.println("Banyak Mahasiswa Lulus (IP >= 2.75) : " + passed_students);
      System.out.println("Banyak Mahasiswa Tidak Lulus        : " + failed_students);
      System.out.println("Rata-Rata IP Mahasiswa              : " + average_students);
    }
    else {
      System.out.println("Tidak ada data.");
    }
    System.out.println("\n--------------------------------------\n");
    System.out.println("Aplikasi selesai dieksekusi.");
  }
}

