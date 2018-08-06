package concurrency.daemon;

import java.util.concurrent.TimeUnit;

/**
 * 后台线程
 * 结果和书上的不一致
 *
 * @author: 冀陆涛
 * @create: 2018-06-18 15:50
 **/
public class Daemons {
    public static void main(String[] args) throws Exception{
        Thread d = new Thread(new Daemon());
        d.setDaemon(true);
        d.start();
        System.out.println("d.isDaemon() = " + d.isDaemon() + ". ");
        TimeUnit.SECONDS.sleep(1);
    }
}

class DaemonSpawn implements Runnable{
    @Override
    public void run() {
        while(true){
            Thread.yield();
        }
    }
}

class Daemon implements Runnable{
    private Thread[] t = new Thread[10];
    @Override
    public void run() {
        for(int i = 0;i<t.length;i++){
            t[i] = new Thread(new DaemonSpawn());
            t[i].start();
            System.out.println("DaemonSpawn "+i+" Start. ");
        }
        for(int i = 0;i<t.length;i++){
            System.out.println("t[" + i + "].isDaemon() = " + t[i].isDaemon() + ". ");
            while(true){
                Thread.yield();
            }
        }
    }
}

/*
*
* d.isDaemon() = true.
DaemonSpawn 0 Start.
DaemonSpawn 1 Start.
DaemonSpawn 2 Start.
DaemonSpawn 3 Start.
DaemonSpawn 4 Start.
DaemonSpawn 5 Start.
DaemonSpawn 6 Start.
DaemonSpawn 7 Start.
DaemonSpawn 8 Start.
DaemonSpawn 9 Start.
t[0].isDaemon() = true.
* */