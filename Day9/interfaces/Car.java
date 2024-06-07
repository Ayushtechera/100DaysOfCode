package interfaces;

// Now here we want to inherit both the properties of cars like Stereo and engine we can access it here it is known as multiple inheritance but we cannot do it normally but we can using Interface using "implement" keyword
public class Car implements Engine, StereoSystem,Brake {
     int a = 334;

    @Override
    public void acc() {
        System.out.println("I accelerate above 1000 rpm");
    }

    @Override
    public void start() {
        System.out.println("I start engine wih a push button");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine like a normal brake");
    }

    @Override
    public void StereoCompany() {
        System.out.println("The brand is Bose");
    }


}
