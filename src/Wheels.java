import java.util.Random;

public class Wheels extends  TransportComponent {


    private double cof;

    public Wheels(String name, double cof) {
        super(name);
        this.cof = cof;
          }

    public double getCof() {
        return cof;
    }

    public void setCof(double cof) {
        this.cof = cof;
    }


}
