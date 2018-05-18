package classeight;

public class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunnable1:1" + Thread.currentThread().getName());
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                if (i == 5) {
                    Thread.yield();
                    System.out.println("暂停");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("线程停止" + Thread.currentThread().getName());
    }
}
