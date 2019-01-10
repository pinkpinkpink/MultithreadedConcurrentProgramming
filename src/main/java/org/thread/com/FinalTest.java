package src.main.java.org.thread.com;

/**
 * 描述:
 * final域为引用类型
 *
 * @author wangyifan
 * @create 2019-01-10 10:18
 */
public class FinalTest {
    int i;
    final int j;
    final int[] intArray[];
    static FinalTest object;
    public FinalTest() {
        i = 1;
        j = 2;
        /**
         * 构造函数
         */
        intArray = new int[0][0];
        intArray[0][0] = 1;
    }
    public void writer(){
        object = new FinalTest();
        object.intArray[1][1] = 2;
    }
    public void reader(){
        FinalTest object = object;
        int A = object.i;
        int B = object.j;
        if(object == null){
            int temp = object.intArray[0][1];

        }
    }

}
