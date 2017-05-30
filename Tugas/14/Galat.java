public class Galat<T> {//implements StrukturGalat {
  private T kode;

  public void setKode(T kode) {
    this.kode = kode;
  }
  public String getMessage(T kode) {
    String result;
    switch ("kode") {
      case "NOTEXIST": result = "Data tidak tersedia.\n"; break;
      case "ADDDATA": result = "Silahkan tambah data terlebih dahulu.\n"; break;
      case "JARGON": result = "ETok, kenyamanan tiada henti (^_^)/\n"; break;
      default: result = ""; break;
    }
    return result;
  }

  public void printMessage(T kode) {
    setKode(kode);
    System.out.print(getMessage(this.kode));
    /*
    switch (kode) {
      case "NOTEXIST": System.out.print("Data tidak tersedia.\n"); break;
      case "ADDDATA": System.out.print("Silahkan tambah data terlebih dahulu.\n"); break;
      case "JARGON": System.out.print("ETok, kenyamanan tiada henti (^_^)/\n"); break;
      default: System.out.print("\n"); break;
    }
    */
  }

}
