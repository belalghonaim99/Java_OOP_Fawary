public class CarFactory {

    public static Car createCar(String engineType) {
        switch (engineType.toLowerCase()) {
            case "gas":
                return new Car(new Gas());
            case "electric":
                return new Car(new Electronic());
            case "hybrid":
                return new Car(new HybirdEngine());
            default:
                throw new IllegalArgumentException("Invalid engine type");
        }
    }

    public static void replaceEngine(Car car, String engineType) {
        switch (engineType.toLowerCase()) {
            case "gas":
                car.setEngine(new Gas());
                break;
            case "electric":
                car.setEngine(new Electronic());
                break;
            case "hybrid":
                car.setEngine(new HybirdEngine());
                break;
            default:
                throw new IllegalArgumentException("Invalid engine type");
        }
    }
}