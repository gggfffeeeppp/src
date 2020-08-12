/**
 * FileName: Array100
 * Author:   蔡志勇
 * Date:     2020/6/29 21:35
 * Description: 数组测试
 * History:
 */

package reduceandgerge;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br>
 * 〈数组测试〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/29
 */
public class Array100 {

    public static void main(String[] args) {
        GetRandom gr = new GetRandom();
        String[] ss2 = new String[100];
        for (int i = 0; i < ss2.length; i++) {
            ss2[i] = gr.getRandomString(2);
        }
        //String[] ss2=new String[] {"fs","ad","ewf","fs","ew","fd","fs","ad","fds","ew"};
        //
        String s6 = "";
        int count = 0;
        for (int i = 0; i < ss2.length; i++) {
            for (int j = i + 1; j < ss2.length; j++) {
                if (ss2[i].equals(ss2[j])) {
                    if (!s6.contains(ss2[i])) {
                        s6 = s6 + " " + ss2[i];
                        count++;
                    }
                }

            }
        }
        System.out.println(Arrays.deepToString(ss2));
        System.out.println(s6);
        System.out.println(count);

    }
}
