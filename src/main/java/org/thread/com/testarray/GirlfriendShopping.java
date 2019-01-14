package src.main.java.org.thread.com.testarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 描述:
 *
 * @author wangyifan
 * @create 2019-01-14 18:13
 */
public class GirlfriendShopping {


        public static void main(String[] arges) {
            /**
             * 输入月份
             */
            Scanner sc1 = new Scanner(System.in);
            /**
             * 输入字符串
             */
            Scanner sc2 = new Scanner(System.in);
            /**
             * 参数
             */
            String m = sc1.nextLine();
            String n = sc2.nextLine();

            List<Integer> prices = new ArrayList<>();

            String temp[] = n.split("\\s+");
            for (String s : temp) {
                Integer price = Integer.parseInt(s);
                /**
                 * 输入数字判断
                 */
                if (price != null && price <= 10000 && price > -1) {
                    prices.add(price);
                }
            }
            /**
             * 按照价格排序
             */
            Collections.sort(prices);
            /**
             * 价格的上限是10000
             */
            Integer total = Integer.parseInt(m);
            Integer sum = 0;
            /**
             * 遍历价格集合，prices是有序的集合，从小到大排列
             *      total 为当前拥有的钱，如果total >= price ，说明可以买此商品，
             *      则total = total - price;
             *      此时，计算总价 sum += price
             *      直到total < price 说明当前拥有的钱不够支付下一个商品，则跳出循环 打印sum总价;
             */
            for (Integer price : prices) {
                if (total >= price) {
                    total = total - price;
                    sum += price;
                }else{
                    break;
                }
            }
            /**
             * 输出总价
             */
            System.out.println(sum);
        }
    }

