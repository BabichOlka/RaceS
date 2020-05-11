package transport;

import java.awt.*;
import point.CofExeption;
import point.Point;

public class Car extends Transport {

    public Car(String name, Engine engine, Wheels wheels, Point currentPosition){
        super(name,engine,wheels,currentPosition);
    }
}