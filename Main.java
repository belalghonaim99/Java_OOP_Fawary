public class Main {
    public static void main(String[] args) {
    Gas gas = new Gas();
    gas.setSpeed(200);
    gas.start();
    gas.decrease();
    gas.getSpeed();
    gas.increase();
    gas.stop();    
}
}