/**
 * FileName: LastTwoFirstUpper
 * Author:   蔡志勇
 * Date:     2020/6/30 19:40
 * Description: 最后一个two首字母大写
 * History:
 */

package reduceandgerge;

/**
 * 〈一句话功能简述〉<br>
 * 〈最后一个two首字母大写〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/30
 */
public class LastTwoFirstUpper {
    public static void main(String[] args) {
        String string= "Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";
        char[] ch = string.toCharArray();
        int index = string.lastIndexOf("two");
        ch[index] = Character.toUpperCase(ch[index]);
        System.out.println(String.valueOf(ch));
    }
}