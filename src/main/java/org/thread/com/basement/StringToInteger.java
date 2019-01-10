package src.main.java.org.thread.com.basement;

/**
 * 描述:
 *
 * @author wangyifan
 * @create 2019-01-10 10:57
 */
public class StringToInteger<str> {
    String str = "yellow";
    int count = 10;
    int num = 11;
    if(str == null){
        return 0;
    }
    try{
        int count = Integer.parseInt(str);
        Integer num = Integer.valueOf(str);
    }catch(NumberFormatException e){

    }

}
