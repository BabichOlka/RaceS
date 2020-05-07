import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Race {
    public static void main(String[] args) {
        Rout rout = generateRout();
//        BMW bmw = generateBMW();
//        Volvo volvo = generateVolvo();
//        bmw.setCurrentPosition(rout.getPointList().get(0));
//        volvo.setCurrentPosition(rout.getPointList().get(0));
        System.out.println("Do you want to stsrt? y/n ?");
        Scanner in = new Scanner(System.in);
        if (in.next().equals("y"))
        System.out.println("Start!");

        System.out.println("Please, choose your car: BMW, Volvo, Opel, Car (as Default)");
        String playerCarName = in.next();
        Transport playerCar = TransportFactory.getTransportbyName(playerCarName);

        System.out.println("Please, choose enemy car: BMW, Volvo, Opel, Car (as Default)");
        String enemyCarName = in.next();
        Transport enemyCar = TransportFactory.getTransportbyName(enemyCarName);

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
//      static BMW generateBMW(){
//        Engine bmwEngine = new Engine("BMWE",5);
//        Wheels bmwWheels = new Wheels("BMWW", Math.random());
//        return new BMW("BMW", bmwEngine, bmwWheels, null );
// }
//    static Volvo generateVolvo(){
//        Engine volvoEngine = new Engine("VolvoE",10);
//        Wheels volvoWheels = new Wheels("VolvoW", Math.random());
//        return new Volvo("Volvo", volvoEngine, volvoWheels, null );
    //}
    static void startGame(Rout rout, Transport player,Transport enemy){
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

