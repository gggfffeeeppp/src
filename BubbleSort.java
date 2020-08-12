/**
 * FileName: BubbleSort
 * Author:   蔡志勇
 * Date:     2020/5/30 17:59
 * Description: 冒泡排序
 * History:
 */

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br>
 * 〈冒泡排序〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/5/30
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 553, 2, 312, 1, 3, 21, 3};
        // int[] b = new int[a.length];
        for (int j = a.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (a[i] > a[i +1]) {
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

