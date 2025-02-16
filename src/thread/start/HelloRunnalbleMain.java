package thread.start;

public class HelloRunnalbleMain {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName()+" : main() start");

        HelloRunnable runnable = new HelloRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println(Thread.currentThread().getName()+" : main() end");
    }

    //Thread 상속 vs Runnable 구현
    // 스레드를 사용할 때는 Thread상속보다 Runnable 인터페이스를 구현하는 방식을 사용해야함.

    // Thread 상속 장점 - 간단한 구현. run() 메서드만 재정의하면 됨
    // 단점 - 상속의 제한

    // Runnable 인터페이스 구현 장점 - 상속의 자유로움, 코드의 분리
    // 단점 - 코드가 약간 복잡해질 수 있다.runnable객체를 생성하고 thread에 전달하는 과정이 추가됨
}
