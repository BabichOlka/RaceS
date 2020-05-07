
public class Engine extends  TransportComponent {


    private int maxSpeed;

    public Engine(String name, int maxSpeed) {
        super(name);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
