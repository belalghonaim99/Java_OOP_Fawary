public class Car 
{
    Engine engine;
    int speed = 0;

    public Car(Engine engine) {
        this.engine = engine;
    }
    public void setEngine(Engine engine)
    {
        this.engine = engine;
    }
    public void updateEngine(Engine engine)
    {
        this.engine = engine;
    }

    public void start()
    {
        speed = 0;
        engine.start();
    }
    public void stop()
    {
        speed = 0;
        engine.setSpeed(speed);
        engine.stop();
    }
    
    public void accelerate()
    {
        if(speed < 200)
        {
            speed = speed + 20;
            engine.setSpeed(speed);
            System.out.println("Car Speed " + speed);
        }
    }
    public void brake()
    {
        if(speed > 0 )
        {
            speed -= 20;
        }
        else if (speed < 0)
        {
            speed = 0;

        engine.setSpeed(speed);
        System.out.println("Car Speed " + speed);
        }
    }
}
