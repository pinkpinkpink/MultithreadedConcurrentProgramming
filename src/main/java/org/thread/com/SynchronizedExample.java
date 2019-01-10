package src.main.java.org.thread.com;

/**
 * 描述:
 * synchronized
 *
 * @author wangyifan
 * @create 2019-01-10 10:00
 */
public class SynchronizedExample {
    int a = 0;
    boolean flag = false;
    public synchronized void writer(){
        a = 1;
        flag = true;

    }
    public synchronized void reader(){
        if(flag){

        }

    }
}
