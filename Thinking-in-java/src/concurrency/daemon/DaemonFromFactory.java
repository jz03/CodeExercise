package concurrency.daemon;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 与SimpleDaemons类基本一样，不一样的是通过线程执行器将普通的线程变为后台线程，并执行这个线程
 * @author: 冀州
 * @create: 2018-06-03 22:31
 **/
public class DaemonFromFactory  {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool(new DaemonThreadFactory());
        for(int i = 0; i < 10; i++){
            exec.execute(new SimpleDaemons());
        }
        System.out.println("All dasemons started");
        TimeUnit.MILLISECONDS.sleep(550);
    }
}
