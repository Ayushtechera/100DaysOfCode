package abstractDemo;

public class Son extends Parent {

    public Son(int age){
        super(age);
    }

    

    @Override
    void normal() {
        super.normal();
    }



    @Override
    void CountryChoice(){
        System.out.println("I want to go Italy");

    }

    @Override
    void UniversityChoice(){
        System.out.println("I have choosen University of Bologna");
    }
}
