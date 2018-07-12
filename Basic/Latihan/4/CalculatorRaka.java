import java.util.Scanner;

public class CalculatorRaka extends Calculator {

  protected double hasilTambah(double x, double y) {
    return x + y;
  }
  protected double hasilKurang(double x, double y) {
    return x - y;
  }
  protected double hasilKali(double x, double y) {
    return x * y;
  }
  protected double hasilBagi(double x, double y) {
    return x / y;
  }

  public static void main(String[] args) {
    double operand1, operand2;
    Scanner input = new Scanner(System.in);
    Calculator calc = new CalculatorRaka();

    System.out.print("Masukan bilangan 1 : ");
    operand1 = input.nextDouble();
    System.out.print("Masukan bilangan 2 : ");
    operand2 = input.nextDouble();

    System.out.print("Hasil penjumlahan " + operand1 + " dan " + operand2 + " adalah " + calc.hasilTambah(operand1, operand2) + "\n");
    System.out.print("Hasil pengurangan " + operand1 + " dan " + operand2 + " adalah " + calc.hasilKurang(operand1, operand2) + "\n");
    System.out.print("Hasil perkalian " + operand1 + " dan " + operand2 + " adalah " + calc.hasilKali(operand1, operand2) + "\n");
    System.out.print("Hasil pembagian " + operand1 + " dan " + operand2 + " adalah " + calc.hasilBagi(operand1, operand2) + "\n");
  }
}
