package singleton.SingletonBasicEx;

public class SingletonEx {
    //static field
    private static final SingletonEx singleton = new SingletonEx();

    //constructor
    private SingletonEx(){
        System.out.println("Ex");
    }

    //static method
    static SingletonEx getInstance(){
        return singleton;
    }

}
