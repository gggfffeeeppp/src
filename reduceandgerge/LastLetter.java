/**
 * FileName: LastLetter
 * Author:   蔡志勇
 * Date:     2020/6/30 19:29
 * Description: 最后一个字母转大写
 * History:
 */

package reduceandgerge;

/**
 * 〈一句话功能简述〉<br>
 * 〈最后一个字母转大写〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/30
 */
public class LastLetter {
    public static void main(String[] args) {
        String string= "lengendary";
        char[] ch = string.toCharArray();
        ch[ch.length -1] = Character.toUpperCase(ch[ch.length -1]);
        // String nowString = String.valueOf(Character.toUpperCase(string.charAt(string.length()- 1)));
        System.out.println(String.valueOf(ch));
    }
}