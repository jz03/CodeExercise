package concurrency.daemon;

import java.util.concurrent.TimeUnit;

/**
 * 后台线程是否走finally
 *
 * 当非后台线程执行的时间大于后台线程的时间时，就会执行执行finally，等于的时候执行第一句，小于的话不执行。
 * @author: 冀陆涛
 * @create: 2018-06-18 17:22
 **/
public class DaemonsDontRunFinally {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new ADaemon());
        t.setDaemon(true);
        t.start();
        //TODO:可以改变睡眠时间就能看出差异
        TimeUnit.SECONDS.sleep(3);
    }
}

class ADaemon implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Starting ADaemon");
            //TODO:可以改变睡眠时间就能看出差异
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("Exiting via InterruptedException");
            e.printStackTrace();
        } finally {
            System.out.println("This should always run?");
        }
    }
}
