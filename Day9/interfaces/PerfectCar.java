package interfaces;
public class PerfectCar {
    private Engine engine;
    private StereoSystem player = new CDPlayer();

    public PerfectCar(){
         engine = new PowerEngine();               
    }
    
    public PerfectCar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startmusic(){
        player.start();
    }

    public void stopmusic(){
        player.stop();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }






}
