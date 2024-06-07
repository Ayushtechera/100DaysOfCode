package interfaces;

public class Main {
    public static void main(String[] args) {
        //  Car car = new Car();
        // Engine car = new Car(); // we can use interface as a type of reference variable also.
        //  car.start();
        //  car.stop();
        //  car.acc();
        //  car.StereoCompany();

        // StereoSystem carSystem = new Car();
        // carSystem.stop();

        PerfectCar car2 = new PerfectCar();

        car2.start();
        car2.startmusic();
        car2.upgradeEngine();
        car2.start();                        


    }
}
