public class CarFactory {
    public static Car createCar(String engineType)
    {
            if(engineType.toLowerCase()== "gas")
            {
                return new Car(new Gas());
            }
            else if (engineType.toLowerCase() == "electric")
            {
                return new Car(new Electronic());
            } 
            else if(engineType.toLowerCase() == "hybrid")
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
        if(engineType.toLowerCase().equals("gas"))
        {
            car.setEngine(new Gas());
        }
        else if(engineType.toLowerCase().equals("electronic"))
        {
            car.setEngine(new Electronic());
        }
        else if(engineType.toLowerCase().equals("hybrid"))
        {
            car.setEngine(new HybirdEngine());
        }
        else
        {
            System.out.println("Invalid Engine Type");
        }
    }
}
