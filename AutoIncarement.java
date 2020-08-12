/**
 * FileName: AutoIncarement
 * Author:   蔡志勇
 * Date:     2020/5/29 20:26
 * Description: 自增长
 * History:
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br>
 * 〈自增长〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/5/29
 */
public class AutoIncarement {
    public static void main(String[] args) {
        // int i = 1;
        // int j = ++i + i++ + ++i + ++i + i++;
        // System.out.println(j);
        //
        // int ii = 1;
        // boolean bb = !(ii++ == 3) ^ (ii++ == 2) && (ii++ == 3);
        // System.out.println(ii);

        // int a = 1;
        // int b = 2;
        // int c = a ^ b;
        // a = c ^ a;
        // b = c ^ b;
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);

        // i = 3; // 二进制是11
        // j = 2; // 二进制是10
        // int d = ((i | j) ^ (i & j)) << 2 >>> 1;
        // System.out.println("练习题答案： " + d);

        // int i = 1;
        // // i += i++;
        // i += ++i;
        // System.out.println(i);

        // System.out.print("请输入月份\n");
        // Scanner sc = new Scanner(System.in);
        // int day = sc.nextInt();
        //
        // switch (day) {
        //     case 1, 2, 3 -> System.out.println("春季");
        //     case 4, 5, 6 -> System.out.println("夏季");
        //     case 7, 8, 9 -> System.out.println("秋季");
        //     case 10, 11, 12 -> System.out.println("冬季");
        //     default -> System.out.println("这是什么鬼?");


        // int[] a = new int[5];
        // // a[0] = (int) (Math.random() * 100);
        // // a[1] = (int) (Math.random() * 100);
        // // a[2] = (int) (Math.random() * 100);
        // // a[3] = (int) (Math.random() * 100);
        // // a[4] = (int) (Math.random() * 100);
        // int min = 100;
        // for (int i = 0; i < a.length; ++i) {
        //     a[i] = (int) (Math.random() * 100);
        //     System.out.println("数组中的各个随机数是:" + a[i]);
        //     if (min > a[i]) {
        //         min = a[i];
        //     }
        // }
        // for (int value : a) System.out.println(value);
        // for (int value : a) {
        //
        //     if (min > value) {
        //         min = value;
        //     }
        // }
        // System.out.println("本练习的目的是，找出最小的一个值: " + min);

        int[] a = new int[5];
        int[] c = new int[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
            System.out.print(a[i] + " ");
        }

        int max = 0;
        // int max = a[0];
        int ii = 0;
        for (int value : a) {
            // if (0 == ii) {
            //     max = value;
            //     ii++;
            // }
            // if (max < value)
            //     max = value;
            max = Math.max(max, value);
        }
        System.out.println(max);


        // 使用for循环反转
        for (
                int j = 0;
                j < a.length; j++) {
            c[j] = a[a.length - 1 - j];
        }
        System.out.println(Arrays.toString(c));

        // int l = (Math.min(a.length, c.length));
        // System.out.println(l);
        // 使用 Array.fll() 方法
        int[] b = new int[5];
        for (
                int i = 0;
                i < a.length; i++) {
            Arrays.fill(b, i, i + 1, a[a.length - i - 1]);
        }
        System.out.println(Arrays.toString(b));

        // for (int j = a.length - 1; j >= 0; j--){
        //     b[j] = a[a.length - j -1];
        // }

        // 使用双层for循环单数组反转
        for (
                int j = a.length - 1;
                j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                int pointer = a[i];
                a[i] = a[i + 1];
                a[i + 1] = pointer;
            }
        }
        System.out.print(Arrays.toString(a));
        // 使用while循环反转
        int j = a.length - 1;
        while (j > 0) {
            int i = 0;
            while (i < j) {
                int pointer = a[i];
                a[i] = a[i + 1];
                a[i + 1] = pointer;
                i++;
            }
            j--;
        }
        System.out.println(Arrays.toString(a));
        // for (int v : b) System.out.print(v + " ");

        // for (int v : b) {
        //     cc = v;
        //     System.out.println(cc);
        // }


    }
}
