/**
 * FileName: Interval
 * Author:   蔡志勇
 * Date:     2020/6/30 19:18
 * Description: 间隔大小写
 * History:
 */

package reduceandgerge;

/**
 * 〈一句话功能简述〉<br>
 * 〈间隔大小写〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/30
 */
public class Interval {
    public static void main(String[] args) {
        String string = "lengendary";
        char[] ch = string.toCharArray();
        for (int i = 0; i < ch.length; i++){
            if (0 == i % 2) {
                ch[i] = Character.toUpperCase(ch[i]);
            }
        }
        System.out.println(String.valueOf(ch));
    }
}