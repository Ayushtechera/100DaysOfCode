package interfaces;

public class CDPlayer implements StereoSystem {
    @Override
    public void StereoCompany() {
        System.out.println("Company is bose");
        
    }

    @Override
    public void stop() {
        System.out.println("stop the music");
        
    }

    @Override
    public void start() {
        System.out.println("start the music");
        
    }
}
