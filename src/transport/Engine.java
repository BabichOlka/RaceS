package transport;

public class Engine extends TransportComponent {


    private int maxSpeed;

    public Engine(String name, int maxSpeed) {
        super(name);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) throws SpeedExeption {
        if (maxSpeed < 0){
            throw new SpeedExeption("Speed is incorrect!");
        }
        this.maxSpeed = maxSpeed;
    }
}
