package concurrency.daemon;

import java.util.concurrent.TimeUnit;

/**
 * 后台线程
 * @author: 冀州
 * @create: 2018-06-03 22:01
 **/
public class SimpleDaemons implements Runnable {

    @Override
    public void run() {
        while(true){
            try {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i < 10; i++){
            Thread daemon = new Thread(new SimpleDaemons());
            daemon.setDaemon(true);
            daemon.start();
        }
        System.out.println("All dasemons started");
        TimeUnit.MILLISECONDS.sleep(150);
    }
}
