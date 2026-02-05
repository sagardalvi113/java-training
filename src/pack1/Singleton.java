package pack1;

public class Singleton {

    private static Singleton singleton;
    public static Singleton getInstance(){

        if(singleton == null){
            singleton = new Singleton();
            return singleton;
        }else {
            return singleton;
        }

    }
}
