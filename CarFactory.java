public class CarFactory {
    public static Car createCar(String engineType)
    {
            if(engineType == "gas")
            {
                return new Car(new Gas());
            }
            else if (engineType == "electric")
            {
                return new Car(new Electronic());
            } 
            else if(engineType == "hybrid")
            {
                return new Car(new HybirdEngine());
            }
            else
            {
                throw new IllegalArgumentException("Invalid engine type");
            }
        }
    public static void replaceEngine(Car car, String engineType)
    {
        if(engineType == "gas")
        {
            car.setEngine(new Gas());
        }
        else if(engineType == "electronic")
        {
            car.setEngine(new Electronic());
        }
        else if(engineType == "hyrbid")
        {
            car.setEngine(new HybirdEngine());
        }
        else
        {
            System.out.println("Invalid Engine Type");
        }
    }
}
