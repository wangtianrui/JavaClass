package classeight;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        test1();
//        test2();
    }

    private static void test1(){
        Thread t1 = new Thread(new MyRunnable1());
        Thread t2 = new Thread(new MyRunnable2());

        t1.start();
        t2.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程" + Thread.currentThread().getName());
        }
        System.out.println("线程一状态：" + t1.isAlive());
    }

    /**
     * 调用了join方法的线程会让主线程等待该线程执行完后再执行
     * @throws InterruptedException
     */
    private static void test2() throws InterruptedException {
        Thread t1 = new Thread(new MyRunnable1());
        Thread t2 = new Thread(new MyRunnable2());

        t1.start();
        t2.start();
        t1.join();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程" + Thread.currentThread().getName());
        }
        System.out.println("线程一状态：" + t1.isAlive());
    }
}
