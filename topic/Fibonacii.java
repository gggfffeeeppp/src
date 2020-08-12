/**
 * FileName: Fibonacii
 * Author:   蔡志勇
 * Date:     2020/7/26 20:18
 * Description:
 * History:
 */

package topic;

import java.io.File;

/**
 * 〈一句话功能简述〉<br>
 * 〈斐波那契〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/26
 */
public class Fibonacii {
    public int func(int n) {
        if (n == 1 || n == 2)
            return 1;
        return func(n - 1) + func(n - 2);
    }

    public static void main(String[] args) {
        Fibonacii fibonacii = new Fibonacii();
        System.out.println(fibonacii.func(4));
        System.out.println(fibonacii.func(5));
        System.out.println(fibonacii.func(6));
        System.out.println(fibonacii.func(30));

    }

}