/**
 * FileName: Factorial
 * Author:   蔡志勇
 * Date:     2020/5/30 16:21
 * Description: 阶乘
 * History:
 */

import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br>
 * 〈阶乘〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/5/30
 */

public class Factorial {
    public static void main(String[] args) {
        System.out.print("请输入一个正整数");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 1;
        int i = 0;
        while (i < N) {
            result *= (N - i);
            i++;
        }
        System.out.println(result);
    }
}