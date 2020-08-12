/**
 * FileName: MaxArrayValue
 * Author:   蔡志勇
 * Date:     2020/6/22 12:48
 * Description: 二维数组中的最大值
 * History:
 */

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br>
 * 〈二维数组中的最大值〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/22
 */
public class MaxArrayValue {
    public static void main(String[] args) {
        int max = 0;
        int maxi = 0;
        int maxj = 0;
        int[][] a = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = (int) (Math.random() * 100);
                // System.out.print(a[i][j] + " ");
                if (max < a[i][j]) {
                    max = a[i][j];
                    maxi = i;
                    maxj = j;
                }
            }
        }
        System.out.println("数组元素是：");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%-8d", a[i][j]);
            }

            System.out.println();
        }
        System.out.println("\n数组为"+ Arrays.deepToString(a));
        System.out.println("\n最大值为:" + max + "其坐标为[" +maxi +"]["+ maxj +"]");
    }
}