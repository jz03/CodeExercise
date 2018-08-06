package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 05 用Executors来驱动任务
 * 程序根据任务数来创建相应的线程数
 *
 * @author: 冀州
 * @create: 2018-06-03 17:07
 **/
public class CachedThreadPool {
    public static void main(String[] args){
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0; i < 5; i++)
            exec.execute(new LiftOff());
        exec.shutdown();
    }
}
