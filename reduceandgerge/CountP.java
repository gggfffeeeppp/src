/**
 * FileName: CountP
 * Author:   蔡志勇
 * Date:     2020/6/30 18:30
 * Description: 计算以p开头单词个数
 * History:
 */

package reduceandgerge;

/**
 * 〈一句话功能简述〉<br>
 * 〈计算以p开头单词个数〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/30
 */
public class CountP {
    public static void main(String[] args) {
        String string = "peter piper picked a peck of pickled peppers";
        String[] strings = string.split(" ");
        int count = 0;
        for (String str : strings) {
            if (String.valueOf(str.charAt(0)).equalsIgnoreCase("p")) {
            // if ((str.charAt(0) == 'p') || ((str.charAt(0) == 'P'))){
                count++;
            }
        }
        System.out.println(count);
    }
}
