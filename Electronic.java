public class Electronic implements Engine{
    int speed = 0;

    public void increase()
    {
        speed = speed + 1 ;
    }
    public void decrease()
    {
        if(speed > 0)
        {
            speed = speed - 1 ;
        }
    }
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
    public int getSpeed()
    {
        return speed;
    }
    public void start()
    {
        System.out.println("Electric Engine Started");
    }
    public void stop()
    {
        System.out.println("Electric Engine Started");
    }
}
