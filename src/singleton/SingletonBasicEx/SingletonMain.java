package singleton.SingletonBasicEx;

public class SingletonMain {
    public static void main(String[] args) {

        //SingletonEx singleton1 = new SingletonEx(); // 호출 불가

        System.out.println(SingletonEx.getInstance());

        SingletonEx s1 = SingletonEx.getInstance();
        SingletonEx s2 = SingletonEx.getInstance();

        if(s1 == s2){
            System.out.println("s1 = s2");
        }else {
            System.out.println("s1 != s2");
        }
    }
}