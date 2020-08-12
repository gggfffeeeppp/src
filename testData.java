/**
 * FileName: testData
 * Author:   蔡志勇
 * Date:     2020/6/26 20:19
 * Description: 日历
 * History:
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈日历〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/26
 */
public class testData {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date d1 = c.getTime();
        System.out.println(d1);
        System.out.println("当前日期：\t" + format(c.getTime()));
        // 下个月的今天
        c.setTime(d1);
        c.add(Calendar.MONTH,2);
        c.set(Calendar.DATE, 1);
        c.add(Calendar.DATE,-3);
        System.out.println("下个月的倒数第三天:" +format((c.getTime())));

        Date d2 = new Date(0);
        c.setTime(d2);
        // Date d3 = c.getTime();
        System.out.println(d2);
        // System.out.println(d3);

        String str1 = "the light";

        String str2 = new String(str1);

        //==用于判断是否是同一个字符串对象
        System.out.println( str1.equals(str2)); // 内容相等 为true
        System.out.println( str1 == str2); // 不是同一个对象 false

        String str5 = "the light";

        String start = "the";
        String end = "Ight";

        System.out.println(str5.startsWith(start));//以...开始
        System.out.println(str5.endsWith(end));//以...结束
    }

    private static String format(Date time) {
        return sdf.format(time);
    }
}