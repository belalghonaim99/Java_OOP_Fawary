public class Main {
    public static void main(String[] args) {

        Car car = CarFactory.createCar("hybrid");

        car.start();
        car.accelerate(); // 20
        car.accelerate(); // 40
        car.accelerate(); // 60 -> switch to gas
        car.brake();      // 40 -> switch to electric
        car.stop();

        System.out.println("---- Changing Engine ----");

        CarFactory.replaceEngine(car, "Gas");

        car.start();
        car.accelerate();
        car.stop();
    }
}