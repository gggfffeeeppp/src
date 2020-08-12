/**
 * FileName: TestCollection1
 * Author:   蔡志勇
 * Date:     2020/7/28 8:48
 * Description:
 * History:
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 * @author 蔡志勇
 * @date 2020/7/28
 * @version 1.0.0
 */
public class TestCollection1 {
    public static void main(String[] args) {
        List<Integer> l;
        l = new ArrayList<>();
        insertFirst(l, "ArrayList");
        modify(l, "ArrayList");

        l = new LinkedList<>();
        insertFirst(l, "LinkedList");
        modify(l, "LinkedList");

    }

    private static void insertFirst(List<Integer> l, String type) {
        int total = 1000 * 100;
        final int number = 5;
        long start = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            l.add(l.size()/2,number);
        }
        long end = System.currentTimeMillis();
        System.out.printf("在%s 最前面插入%d条数据，总共耗时 %d 毫秒 %n", type, total, end - start);
    }

    private static void modify(List<Integer> l, String type) {
        int total = 100 * 1000;
        int index = total;
        final int number = 5;
        //初始化
        for (int i = 0; i < total; i++) {
            l.add(l.size()/2,number);
        }

        long start = System.currentTimeMillis();

        for (int i = 0; i < total; i++) {
            int n = l.get(index);
            n++;
            l.set(l.size()/2, n);
        }
        long end = System.currentTimeMillis();
        System.out.printf("%s总长度是%d，定位到第%d个数据，取出来，加1，再放回去%n 重复%d遍，总共耗时 %d 毫秒 %n", type, total, index, total, end - start);
        System.out.println();
    }
}