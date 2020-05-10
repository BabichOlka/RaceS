package transport;

import java.awt.*;

import point.CofExeption;
import point.Point;
import point.Rout;


abstract class Transport {
    private int currentSpeed;
    private Point currentPosition;
    private String name;
    private Engine engine;
    private Wheels wheels;

    public Transport(String name, Engine engine, Wheels wheels, Point currentPosition){
    this.name = name;
    this.engine = engine;
    this.wheels = wheels;
    this.currentPosition = currentPosition;

}

    public Point getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Point currentPosition) {
        this.currentPosition = currentPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public int getCurrentSpeed()  {
        try {
            this.engine.setMaxSpeed(-1);
        }
        catch (SpeedExeption speed){
            System.err.println(speed.getMessage());
        }
        try {
            this.currentPosition.setCof(-1);
        }
        catch (CofExeption cof){
            System.err.println(cof.getMessage());
        }

        return  (int)( this.engine.getMaxSpeed()*((this.wheels.getCof()+this.currentPosition.getCof())/2));


    }
}
