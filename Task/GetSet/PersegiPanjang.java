class PersegiPanjang {
    protected int panjang;
    protected int lebar;
    
    public void setLebar(int angka) {
        this.lebar = angka;
    }
    
    public void setPanjang(int angka) {
        this.panjang = angka;
    } 
    
    public int getLebar() {
        return this.lebar;
    }
    
    public int getPanjang() {
        return this.panjang;
    }

    public static void main(String[] args) {
      PersegiPanjang pp = new PersegiPanjang();
      pp.setLebar(10);
      System.out.println(pp.getLebar());
      pp.setPanjang(20);
      System.out.println(pp.getPanjang());
    }
}