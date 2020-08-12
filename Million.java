/**
 * FileName: Million
 * Author:   蔡志勇
 * Date:     2020/5/31 22:39
 * Description: 百万富翁
 * History:
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈百万富翁〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/5/31
 */
public class Million {
    public static void main(String[] args) {
        double F = 0;
        int p = 12000;
        double r = 0.2;
        double a = 1;
        // outloop:
        boolean flag = false;
        for (int n = 1; n <= 10000; n++) {
            a *= 1 + r;
            F += p * a;
            if (flag) break;
            if (F >= 1000000) {
                System.out.println(n);
                flag = true;
            }

            // for (int i = 1; i < 100; i++) {
            //     if (0 == (i % 3)) {
            //         System.out.println(n +","+i);
            //         break; // outloop;
            //     }
            // }
        }
    }
}