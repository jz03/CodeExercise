package concurrency;

/**
 * 04 用线程Thread驱动任务
 * 启动多个任务
 *
 * @author: 冀州
 * @create: 2018-06-03 16:31
 **/
public class MoreBasicThreads {
    public static void main(String[] args){
        for(int i = 0; i < 5; i++)
            new Thread(new LiftOff()).start();
        System.out.println("Waiting for Liftoff");

    }
}
