/**
 * FileName: MathPI
 * Author:   蔡志勇
 * Date:     2020/7/28 9:25
 * Description:
 * History:
 */

package Math99;

import java.util.LinkedHashSet;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/28
 */
public class MathPI {
    public static void main(String[] args) {
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        double d = Math.PI;
        String str = String.valueOf(d);
        for (char c : str.toCharArray())
            lhs.add(c);
        lhs.remove('.');
        for (Character c : lhs) {
            System.out.println(c);
        }
    }
}
