package concurrency.daemon;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 后台线程池
 * @author: 冀陆涛
 * @create: 2018-06-18 15:00
 **/
public class DaemonThreadPoolExecutor extends ThreadPoolExecutor{

    public DaemonThreadPoolExecutor() {
        super(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(),new DaemonThreadFactory());
    }
}
