package concurrency.daemon;

import java.util.concurrent.ThreadFactory;

/**
 * 后台线程工厂
 * @author: 冀州
 * @create: 2018-06-03 22:20
 **/
public class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }

}
