public class third {
    public static void main(String[] args) {


        String name = "Ayush Kashyap";
        changename(name);
        System.out.println(name);//the name is not get change 
        
    }
    static void changename(String naam){ 
        naam = "Rahul rana";   //here we're not changing the original obeject but creating the new object.That's why the change in name is not reflecting
    }
}
