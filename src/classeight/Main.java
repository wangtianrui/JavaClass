package classeight;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable1());
        Thread t2 = new Thread(new MyRunnable2());

        t1.start();
        t2.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程" + Thread.currentThread().getName());
        }
        System.out.println("线程一状态：" + t1.isAlive());
    }
}
