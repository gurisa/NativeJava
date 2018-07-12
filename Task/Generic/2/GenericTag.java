public class GenericTag <E> {
    private E data1;
    private E data2;
    private E temp;
    
    //buat getter setter untuk masing-masing data
    public E getData1() {
        return this.data1;
    }

    public E getData2() {
        return this.data2;
    }

    public E getTemp() {
        return this.temp;
    }

    public void setData1(E data1) {
        this.data1 = data1;
    }

    public void setData2(E data2) {
        this.data2 = data2;
    }

    public void setTemp(E temp) {
        this.temp = temp;
    }
    
    //lengkapi generic method untuk tukar data1 dengan data2
    public void tukarData(){
        this.temp = this.data1;
        this.data1 = this.data2;
        this.data2 = this.temp;
    }
}