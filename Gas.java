public class Gas implements Engine{
    private int speed = 0;
    
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
    public void increase()
    {
        speed = speed + 1;
    }
    public void decrease()
    {
        if(speed > 0) {
            speed = speed - 1;
        }
    }
    public int getSpeed()
    {
        return speed;
    }
    public void start()
    {
        System.out.println("Gas Engine Started");
    }
    public void stop()
    {
        speed = 0;
        System.out.println("Gas Engine Stopped");
        
    }
}
