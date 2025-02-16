package thread.start;
// 스레드는 사용자 스레드, 데몬 스레드 두가지 종류로 구분할 수 있다.
// 사용자 스레드 - 프로그램의 주요 작업을 수행, 작업 완료될 때까지 실행, 모든 사용자스레드가 종료되면 JVM도 종료된다.
// 데몬 스레드 - 백그라운드에서 보조적인 작업을 수행, 모든 사용자스레드가 종료되면 데몬 스레드는 자동으로 종료된다.
public class DaemonThreadMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" : main() start");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true); // 데몬 스레드 여부
        daemonThread.start();
        System.out.println(Thread.currentThread().getName()+" : main() end");
    }



    static class DaemonThread extends Thread{
        @Override
        public void run (){
            System.out.println(Thread.currentThread().getName()+" : run() start");

            try{
                Thread.sleep(10000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+" : run() end");
        }
    }
}
