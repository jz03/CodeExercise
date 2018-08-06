package concurrency;

/**
 * @author: 冀陆涛
 * @create: 2018-06-18 21:07
 **/
public class InnerThread1 {
    private int countDown = 5;
    private Inner inner;
    private class Inner extends Thread{
        Inner(String name){
            super(name);
            start();
        }
        public void run(){
            while(true){
                System.out.println(this);
                if(--countDown == 0){
                    return;
                }
            }
        }
        public String toString(){
            return getName()+":"+countDown;
        }
    }
    public InnerThread1(String name){
        inner = new Inner(name);

    }

}
