package src.main.java.org.thread.com;

/**
 * 描述:
 * Volatile
 *
 * @author wangyifan
 * @create 2019-01-10 10:14
 */
public class VolatileBarrierExample {
    int a ;
    volatile int value1 = 1;
    volatile int value2 = 2;
    void ReadAndWriter(){
        int i = value1;
        int j = value2;
        value1 = i + 1;
        value2 = j * 2;

    }

}
