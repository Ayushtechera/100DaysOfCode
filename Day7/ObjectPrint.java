public class ObjectPrint {
    int num;

    ObjectPrint(int num){
        this.num = num;

    }

    @Override
    public String toString() {
       return "ObjectPrint{num="+ num +"}";
    }


    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(234);
        System.out.println(obj);
    }
    
}
