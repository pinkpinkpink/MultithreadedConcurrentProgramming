package src.main.java.org.thread.com.basement;

/**
 * 描述:
 *
 * @author wangyifan
 * @create 2019-01-10 10:57
 */
public class StringToInteger {
    String str;
    int count = 10;
    if(str == null)
    {
        return 0;
    }
    else if(str != 0){
        count = count * 10 + str - '0';
        ++str;

    }
    return count;

}
