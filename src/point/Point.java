package point;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.solvd.lab.v2.automation.c9.reader.impl.PropertyFileReader;
import com.solvd.lab.v2.automation.c9.exception.UnableToReadException;
import com.solvd.lab.v2.automation.c9.writer.impl.StreamTextFileWriter;
import com.solvd.lab.v2.automation.c9.exception.UnableToWriteException;
import com.solvd.lab.v2.automation.c9.reader.impl.StreamTextFileReader;


public class Point {
    private double x;
    private double y;
    private double cof;
    private List<Point> pointList;

    public Point(double x, double y, double cof) {
        this.x = x;
        this.y = y;
        this.cof = cof;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {

        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getCof() {
        return cof;
    }

    public void setCof(double cof) throws CofExeption {
        if ( cof < 0) {
                throw new CofExeption("Cof is incorrect!");
        }
        this.cof = cof;
    }

    public static void main(String[] args) throws IOException {
        String path = "src/point/point.properties";
        File f = new File(path);
        StreamTextFileReader str = null;
        ;

        try {
          str = new StreamTextFileReader(f);
            ///System.out.println(str.read());
            String line = str.read();
            String[] inpupCharArray = line.split("\t");
            for (int i=0; i>inpupCharArray.length-1;i++){
            List<Point> pointList = new ArrayList<>();
                if (inpupCharArray[i].contains(",")){
                    Point point = new Point(Double.valueOf(inpupCharArray[0]),
                            Double.valueOf(inpupCharArray[3]),Math.random());
                    System.out.println("Point"+ i + point);
                    pointList.add(point);


                }
            }


        } catch (UnableToReadException e) {
            System.exit(2);
        }

        }

    }



