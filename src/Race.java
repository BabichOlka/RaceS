
import point.Point;
import point.Rout;
import transport.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Race {
    public static <Transport> void main(String[] args) {
        Rout rout = generateRout();

        System.out.println("Do you want to stsrt? y/n ?");
        try{
        Scanner in = new Scanner(System.in);
        if (in.next().equals("y"))
        System.out.println("Start!");
        String input = in.next();
        if (input != "y" & "n" ){
            throw new Exception("You pressed the wrong button");
             }
        }
        catch (Exception e){
            e.getMessage();
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Please, choose your car:BMW, Volvo, Opel, Car (as Default)");
        String playerCarName = in.next();
        Car playerCar =  TransportFactory.getTransportbyName(playerCarName);

        System.out.println("Please, choose enemy car: BMW, Volvo, Opel, Car (as Default)");
        String enemyCarName = in.next();
        Car enemyCar =  TransportFactory.getTransportbyName(enemyCarName);

        enemyCar.setCurrentPosition(rout.getPointList().get(0));
        playerCar.setCurrentPosition(rout.getPointList().get(0));

        System.out.println("PlayerCar"+ playerCar);
        System.out.println("EnemyCar" + enemyCar);

        startGame(rout,playerCar,enemyCar);

}
     static Rout generateRout(){
        List<Point> points = new ArrayList<>();
        for (int i = 0 ; i < 200; i++){
            points.add(new Point(Math.random()*10,Math.random()*10,Math.random()));
        }
        return new Rout(points);

}
    static void startGame(Rout rout, Car player,Car enemy){
        String input = "y";
        int iPlayer = 0;
        int iEnemy = 0;

        do {
            System.out.println("Do you want to continue? Press any key to continue, 'n' to exit");
            input = new  Scanner(System.in).next();
            if (iPlayer + rout.getPointList().size() > rout.getPointList().size()) break;
            if (iEnemy + rout.getPointList().size() >  rout.getPointList().size()) break;;
            player.setCurrentPosition(rout.getPointList().get(iPlayer));

            enemy.setCurrentPosition(rout.getPointList().get(iEnemy));

            iPlayer+= player.getCurrentSpeed();
            System.out.println( "Player" + iPlayer );
            iEnemy+= enemy.getCurrentSpeed();
            System.out.println( "Enemy" + iEnemy  );
        }
        while (!input.equals("n"));
        if (iPlayer >  iEnemy) System.out.println(" Player wins! ");
        else System.out.println( "Enemy wins!");
    }
}

