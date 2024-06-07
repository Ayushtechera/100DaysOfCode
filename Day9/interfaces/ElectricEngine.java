package interfaces;

// Using same interface in different classes
public class ElectricEngine implements Engine {

    @Override
    public void acc() {
        System.out.println("ElectricEngine accelerate");
        
    }

    @Override
    public void start() {
        System.out.println("ElectricEngine start");
        
    }

    @Override
    public void stop() {
        System.out.println("ElectricEngine stop");
        
    }                    

}
