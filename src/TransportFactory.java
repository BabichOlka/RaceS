import java.lang.reflect.InvocationTargetException;

public class TransportFactory {
    public static Transport getTransportbyName(String name){
       String carPath = name;
        switch (name){
        case "BMW": return getBMW(carPath);
        case "Volvo": return getVolvo(carPath);
        case "Opel": return getOpel(carPath);
        default: return getDefaultCar(carPath);

         }
    }
    public static Transport getDefaultCar (String carInput){

      Class<?> curClass;

        try{ curClass = Class.forName(carInput);
            Class[] param ={String.class,Engine.class,Wheels.class,Point.class};
            return (Transport) curClass.getConstructor(param)
                    .newInstance("Defoltclass",new Engine("DE",20),new Wheels("Dw",Math.random()),null);
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException| NoSuchMethodException | InvocationTargetException e ){
            e.printStackTrace();}
            return null;



        }
    public static BMW getBMW(String carInput){

        Class<?> curClass;

        try{ curClass = Class.forName(carInput);
            Class[] param ={String.class,Engine.class,Wheels.class,Point.class};
            return (BMW) curClass.getConstructor(param)
                    .newInstance("BMW",new Engine("BMWE",20),
                            new Wheels("BMWw",Math.random()),null);
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException| NoSuchMethodException | InvocationTargetException e ){
            e.printStackTrace();}
        return null;



    }
    public static Volvo getVolvo(String carInput){

        Class<?> curClass;

        try{ curClass = Class.forName(carInput);
            Class[] param ={String.class,Engine.class,Wheels.class,Point.class};
            return (Volvo) curClass.getConstructor(param)
                    .newInstance("Volvo",new Engine("VolvoE",30),new Wheels("Volvow",Math.random()) ,null);
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException| NoSuchMethodException | InvocationTargetException e ){
            e.printStackTrace();}
        return null;



    }
    public static Opel getOpel(String carInput){

        Class<?> curClass;

        try{ curClass = Class.forName(carInput);
            Class[] param ={String.class,Engine.class,Wheels.class,Point.class};
            return (Opel) curClass.getConstructor(param)
                    .newInstance("Opel",new Engine("OpelE",15),new Wheels( "Opelw",Math.random()),null);
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException| NoSuchMethodException | InvocationTargetException e ){
            e.printStackTrace();}
        return null;



    }
    }

