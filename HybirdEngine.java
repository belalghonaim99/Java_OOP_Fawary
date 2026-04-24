public class HybirdEngine implements Engine
{
    Gas gasEngine = new Gas();
    Electronic electronicEngine = new Electronic();

    int speed = 0;

    public void changeEngine()
    {
        if(speed < 50)
        {
            electronicEngine.setSpeed(speed);
            System.out.println("Using Electric Engine Your Current Speed: " + speed);
        }
        else
        {
            gasEngine.setSpeed(speed);
            System.out.println("Switch to  Gas Engine Your Current Speed:  " + speed);
        }
    }
    public void increase()
    {
        speed = speed + 1; // increase engine by 1km/h
        changeEngine();
    }

    public void decrease()
    {
        if(speed > 0)
        {
            speed = speed - 1;
        }
        changeEngine();
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
        changeEngine();
    }
    public int getSpeed()
    {
        return speed;
    }
    public void start()
    {
        System.out.println("Hybird Engine Started");
    }
    public void stop()
    {
        speed = 0;
        gasEngine.stop();
        electronicEngine.stop();
        System.out.println("Hybird Engine Stopped");
    }
}