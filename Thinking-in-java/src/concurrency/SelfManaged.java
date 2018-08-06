package concurrency;

/**
 * 编码的变体
 *
 * @author: 冀陆涛
 * @create: 2018-06-18 20:38
 **/
public class SelfManaged implements Runnable {
    private int countDown = 5;
    private Thread t = new Thread(this);
    public SelfManaged(){
        t.start();
    }
    public String toString(){
        return Thread.currentThread().getName() + "(" + countDown +"). ";
    }
    @Override
    public void run() {
        while(true){
            System.out.println(this);
            if(--countDown == 0){
                return;
            }
        }
    }
    public static void main(String[] args){
        for(int i = 0;i < 5;i++){
            new SelfManaged();
        }
    }
}
