public class Test {
    
    public static void main(String[] args){
        GenericObject gObject = new GenericObject();
        gObject.setData1(5);
        gObject.setData2(3);
        gObject.tukarData();
        System.out.println(gObject.getData1());
        System.out.println(gObject.getData2());
        
        gObject.setData1("Budi");
        gObject.setData2("Andi");
        gObject.tukarData();
        System.out.println(gObject.getData1());
        System.out.println(gObject.getData2());
    }
}