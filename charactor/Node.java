/**
 * FileName: Node
 * Author:   蔡志勇
 * Date:     2020/7/19 0:56
 * Description:
 * History:
 */

package charactor;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/19
 */
public class Node {
    public Node leftNode;
    public Node rightNode;
    public Object value;

    public void add(Object v) {
        if (null == value) {
            value = v;
        } else {
            if ((Integer) v - (Integer) value <= 0) {
                // if ((Integer) v <= (Integer) value) {
                if (null == leftNode) {
                    leftNode = new Node();
                }
                leftNode.add(v);
            } else {
                if (null == rightNode) {
                    rightNode = new Node();
                }
                rightNode.add(v);
            }
        }
    }

    public List<Object> values() {
        List<Object> values = new ArrayList<>();
        if (null != leftNode) {
            values.addAll(leftNode.values());
        }
        values.add(value);
        if (null != rightNode) {
            values.addAll(rightNode.values());
        }
        return values;
    }

    public static void main(String[] args) {
        int[] random = new int[40000];
        for (int i = 0; i < 40000; i++)
            random[i] = (int) (Math.random() * 40000);

        // long time1 = System.currentTimeMillis();
        // Node roots = new Node();
        // for (int num : random) {
        //     roots.add(num);
        // }
        // long time2 = System.currentTimeMillis();
        // long useTime1 = time2 - time1;
        // System.out.println(useTime1);
        // System.out.println(roots.values());


        // long time3 = System.currentTimeMillis();
        //
        // for (int j = 0; j < random.length; j++) {
        //     for (int i = 0; i < random.length - j - 1; i++) {
        //         if (random[i] > random[i + 1]) {
        //             int temp = random[i];
        //             random[i] = random[i + 1];
        //             random[i + 1] = temp;
        //         }
        //     }
        // }
        // long time4 = System.currentTimeMillis();
        //
        // long usetime2 = time4 - time3;
        // System.out.println(usetime2);

        long time5 = System.currentTimeMillis();

        for (int j = 0; j < random.length - 1; j++) {
            for (int i = j + 1; i < random.length; i++) {
                if (random[j] > random[i]) {
                    int temp = random[j];
                    random[j] = random[i];
                    random[i] = temp;
                }
            }
        }
        long time6 = System.currentTimeMillis();
        long useTime3 = time6 - time5;
        System.out.println(useTime3);
    }
}

