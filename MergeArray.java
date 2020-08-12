/**
 * FileName: Gergeint
 * Author:   蔡志勇
 * Date:     2020/6/22 11:17
 * Description: 合并数组
 * History:
 */

import java.util.Random;

/**
 * 〈一句话功能简述〉<br>
 * 〈合并数组〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/22
 */
public class MergeArray {
    public static void main(String[] args) {
        int[] a = new int[(int) (Math.random() * 5 + 5)];
        int[] b = new int[(int) (Math.random() * 5 + 5)];
        int[] c = new int[a.length + b.length];
        System.out.println("数组a的内容为:");
        for (int i = 0; i < a.length; i++){
            a[i] = (int) (Math.random() * 100);
            System.out.print(a[i]+" ");
        }
        System.out.println("\n数组b的内容为:");
        for (int i = 0; i<b.length; i++){
            b[i] = (int) (Math.random() *100);
            System.out.print(b[i]+" ");
        }
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        System.out.println("\n数组c的内容为:");
        for (int i = 0; i< a.length+b.length;i++){
            System.out.print(c[i]+" ");
        }
    }
}