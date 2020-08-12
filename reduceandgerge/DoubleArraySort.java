/**
 * FileName: DoubleArraySort
 * Author:   蔡志勇
 * Date:     2020/7/5 13:20
 * Description:
 * History:
 */

package reduceandgerge;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/5
 */
public class DoubleArraySort {
    public static void main(String[] args) {
        int[][] ar = new int[5][8];
        for (int i = 0; i < ar.length; i++) {
            int[] b = new int[8];
            for (int j = 0; j <  ar[i].length; j++) {
                ar[i][j] = (int) (Math.random() * 100);
            }
            System.arraycopy(ar[i],0,b,0,ar[i].length);
            Arrays.sort(b);
            ar[i] = b;
        }
        // System.out.println(Arrays.toString(b));
        System.out.println(Arrays.deepToString(ar));
    }
}