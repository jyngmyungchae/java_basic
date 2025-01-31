package poly.basic;

public class Dog extends Animal implements Fly {

    @Override
    public void sound (){
        System.out.println("멍");
    }

    @Override
    public void fly() {
        System.out.println("fly dog");
    }
}
