package reduceandgerge;
/**
 * FileName: reduceandgerge.StringBufferPerformance
 * Author:   蔡志勇
 * Date:     2020/6/30 21:24
 * Description: 字符串相加与stringBuffer性能比较
 * History:
 */

import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈字符串相加与stringBuffer性能比较〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/30
 */
public class StringBufferPerformance {
    public static void main(String[] args) {
        String str1 = "let there ";

        StringBuffer sb = new StringBuffer(str1); //根据str1创建一个StringBuffer对象
        sb.append("be light"); //在最后追加

        System.out.println(sb);

        sb.delete(4, 10);//删除4-10之间的字符

        System.out.println(sb);

        sb.insert(4, "there ");//在4这个位置插入 there

        System.out.println(sb);

        sb.reverse(); //反转

        System.out.println(sb);

        GetRandom gr = new GetRandom();
        String result = "";
        long startTime1 = new Date().getTime();
        for (int i=0; i<100000; i++){
            String randomString = gr.getRandomString(10);
            result += randomString;
        }
        long endTime1 = new Date().getTime();
        long runTime1 = endTime1 - startTime1;
        System.out.println(runTime1 + "毫秒");

        long startTime2 = new Date().getTime();
        StringBuffer stringb = new StringBuffer();
        for (int i = 0; i< 100000; i++) {
            stringb.append(gr.getRandomString(10));
        }
        long endTime2 = new Date().getTime();
        long runTime2 = endTime2 - startTime2;
        System.out.println(runTime2 + "毫秒");
    }
}