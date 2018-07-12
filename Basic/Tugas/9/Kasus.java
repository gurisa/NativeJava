/*
	Author: Raka Suryaardi Widjaja
	Note:
		Hi dear!
		Do not cheating, cheating broke yourself ;)

	@Gurisa Devs(https://www.gurisa.com/)
*/
import java.util.Scanner;

public class Kasus {
	public static Scanner input = new Scanner(System.in);
	final int max = 100;

	public void pilihanA(int N) {
		int i, min = 0, banyaknya = 0;
		int[] data = new int[max];
		for (i = 1; i <= N; i++) {
			System.out.print("Data Ke-" + i + " : ");data[i] = input.nextInt();
			if (i == 1) {
				min = data[i];
			}

			if (min > data[i]) {
				min = data[i];
				banyaknya = 1;
			}
			else if (min == data[i]) {
				banyaknya++;
			}
		}
		System.out.print("==================================================\n");
		System.out.print("Nilai Minimum \t\t: " + min + "\n");
		System.out.print("Banyaknya Tampil \t: " + banyaknya);
	}

	public void pilihanB(int N) {
		int i, max = 0, banyaknya = 0;
		int data;
		for (i = 1; i <= N; i++) {
			System.out.print("Data Ke-" + i + " : ");data = input.nextInt();
			if (i == 1) {
				max = data;
			}

			if (max < data) {
				max = data;
				banyaknya = 1;
			}
			else if (max == data) {
				banyaknya++;
			}
		}
		System.out.print("==================================================\n");
		System.out.print("Nilai Maksimum \t\t: " + max + "\n");
		System.out.print("Banyaknya Tampil \t: " + banyaknya);
	}

	public static void main(String[] args) {
		Kasus Try = new Kasus();

		int N = 0;
		char pil;
		boolean valid = false;

		System.out.print("=========================\n");
		System.out.print("===== STUDI KASUS 2 =====\n");
		System.out.print("=========================\n\n");
		do {
			System.out.print("Masukan Banyaknya Data \t\t: ");N = input.nextInt();
		} while (N < 1);

		do {
			System.out.print("Pilihan Tugas [A=Min; B=Max] \t: ");pil = input.next().charAt(0);
			if (pil == 'A' || pil == 'a' || pil == 'B' || pil =='b') {
				valid = true;
			}
		} while (valid == false);
		System.out.print("==================================================\n");

		if (pil == 'A' || pil == 'a') {
			Try.pilihanA(N);
		}
		else if (pil == 'B' || pil == 'b') {
			Try.pilihanB(N);
		}
		System.out.print("\n==================================================\n");
	}
}
