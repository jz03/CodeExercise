package concurrency;

/**
 * 02 main方法驱动任务
 *
 * @author: 冀州
 * @create: 2018-06-03 16:07
 **/
public class MainThread {
    public static void main(String[] args){
        LiftOff launch = new LiftOff();
        launch.run();
    }
}
