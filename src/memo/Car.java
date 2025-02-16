package memo;

public class Car extends Thread{
    private String name;

    public Car (String nm){
        name = nm;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "가 동작중");
            try {
                Thread.sleep(10); // 약간의 지연
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Sample1 {
    public static void main(String[] args) {
        Car car = new Car("1");
        car.start ();

        for (int i = 0; i < 5; i++) {
            System.out.println("main()");

        }
    }
}
