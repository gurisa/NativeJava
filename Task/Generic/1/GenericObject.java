public class GenericObject <T> {
    private T data1;
    private T data2;
    private T temp;
    
    //buat getter setter untuk masing-masing data
    
    public T getData1() {
        return this.data1;
    }

    public T getData2() {
        return this.data2;
    }

    public T getTmp() {
        return this.temp;
    }

    public void setData1(T data1) {
        this.data1 = data1;
    }

    public void setData2(T data2) {
        this.data2 = data2;
    }

    public void setTmp(T temp) {
        this.temp = temp;
    }

    //lengkapi generic method untuk tukar data1 dengan data2
    public void tukarData() {
        this.temp = this.data1;
        this.data1 = this.data2;
        this.data2 = this.temp;
    }
}