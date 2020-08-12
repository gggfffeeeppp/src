/**
 * FileName: Shuffle10000
 * Author:   蔡志勇
 * Date:     2020/7/28 0:35
 * Description:
 * History:
 */

package topic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/28
 */
public class Shuffle10000 {
    private static String name;

    public static String getName() {
        return name;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        int i = 0;
        int count = 0;
        while (i < 10000) {
            Collections.shuffle(list);
            if (list.get(0) == 3 && list.get(1) == 0 && list.get(2) == 4) {
                count++;
            }
            i++;
        }
        System.out.println(count);
        double gailv = (double) count / 10000;
        System.out.printf("出现的概率为%.4f%%" ,gailv);

    }
}