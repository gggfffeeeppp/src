/**
 * FileName: Final
 * Author:   Cai Zhiyong
 * Date:     2020/5/22 12:38
 * Description: 准确来说使用final修饰只允许赋值一次
 * History:
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈准确来说使用final修饰只允许赋值一次〉
 *
 * @author: Cai Zhiyong
 * @date: 2020/5/22
 * @version: 1.0.0
 */
// public class Final {
//     public void method(final int f) {
//         f = 5;
//     }
// }

// public class Final {
//     public void method(final int j) {
//         // j = j + 1;
//         System.out.println(j); // 不能输出j的值
//         //说明final修饰的为参数时在已经赋值的情况下
//         //不能再次赋值
//     }
//
//     public static void main(String[] args) {
//         new Final().method(1);
//     }
// }

// class Final {
//     public static void main(String[] args) {
//         Integer a = Integer.valueOf("44",16);
//         System.out.println(a);
//     }
// }


//
import java.text.SimpleDateFormat;
import java.util.Date;

public class Final {

    public static void main(String[] args) {

        //y 代表年
        //M 代表月
        //d 代表日
        //H 代表24进制的小时
        //h 代表12进制的小时
        //m 代表分钟
        //s 代表秒
        //S 代表毫秒
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS" );
        Date d= new Date();
        String str = sdf.format(d);
        System.out.println("当前时间通过 yyyy-MM-dd HH:mm:ss SSS 格式化后的输出: "+str);

        SimpleDateFormat sdf1 =new SimpleDateFormat("yyyy-MM-dd" );
        Date d1= new Date();
        String str1 = sdf1.format(d1);
        System.out.println("当前时间通过 yyyy-MM-dd 格式化后的输出: "+str1);

    }
}