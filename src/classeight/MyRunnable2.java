package classeight;

public class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunnable2:" + Thread.currentThread().getName());
        Thread.currentThread().setName("Thread2");
        System.out.println("线程2修改后名字为：" + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("线程停止" + Thread.currentThread().getName());
    }
}
