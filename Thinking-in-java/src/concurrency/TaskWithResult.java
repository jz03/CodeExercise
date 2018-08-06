package concurrency;

import java.util.concurrent.Callable;

/**
 * 11 有返回值的任务
 *
 * @author: 冀州
 * @create: 2018-06-03 16:45
 **/
public class TaskWithResult implements Callable<String>{

    private int id;
    public TaskWithResult(int id){
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        return "result of TaskWithResult " + id;
    }
}
