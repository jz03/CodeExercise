package concurrency;

/**
 * 03 用线程Thread驱动任务
 * 启动一个任务
 * @author: 冀州
 * @create: 2018-06-03 16:13
 **/
public class BasicThreads {
    public static void main(String[] args){
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for Liftoff");
    }
}
