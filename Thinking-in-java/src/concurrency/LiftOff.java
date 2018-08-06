package concurrency;

/**
 * 01 任务
 * @author: 冀州
 * @create: 2018-06-03 15:55
 **/
public class LiftOff implements Runnable{
    /* 倒计时数 */
    protected int counDown = 10;
    private static int taskCount = 0;
    /* 任务id */
    private final int id = taskCount++;
    public LiftOff(){}
    public LiftOff(int counDown){
        this.counDown = counDown;
    }

    public String status(){
        return "#" + id + "(" +(counDown > 0 ? counDown : "Liftoff!") + "). ";
    }

    public void run(){
        while(counDown-- > 0){
            System.out.print(status());
            Thread.yield();
        }
    }

}
