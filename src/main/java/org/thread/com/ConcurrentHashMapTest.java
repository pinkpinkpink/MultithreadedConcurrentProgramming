package src.main.java.org.thread.com;

import javax.swing.text.Segment;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 描述:
 * ConcurrentHashMap
 *
 * @author wangyifan
 * @create 2019-01-10 09:27
 */
public class ConcurrentHashMapTest {

    ConcurrentHashMap<String,String> concurrentHashMap = new ConcurrentHashMap<String, String>();
    Thread thread = new Thread(new Runnable() {

        @Override
        public void run() {
            for(;;){
                new Thread(new Runnable() {
                    /**
                     * When an object implementing interface <code>Runnable</code> is used
                     * to create a thread, starting the thread causes the object's
                     * <code>run</code> method to be called in that separately executing
                     * thread.
                     * <p>
                     * The general contract of the method <code>run</code> is that it may
                     * take any action whatsoever.
                     *
                     * @see Thread#run()
                     */
                    @Override
                    public void run() {
                        concurrentHashMap.put(UUID.randomUUID().toString(),"");

                    }
                }).start();
            }
        }
    });

    public ConcurrentHashMap<String, String> getConcurrentHashMap() {
        int hash = hashCode();
        /**
         * Segment
         * Put
         * Size
         */
        return Segment;
    }
}
