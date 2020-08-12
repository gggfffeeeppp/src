/**
 * FileName: ToFirstUpper
 * Author:   蔡志勇
 * Date:     2020/6/12 16:10
 * Description: 首字母大写
 * History:
 */

import java.util.ArrayList;
import java.util.Random;

/**
 * 〈一句话功能简述〉<br>
 * 〈首字母大写〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/12
 */
public class ToFirstUpper {
    public static void main(String[] args) {
        String str = "let there be light";
        String[] str1 = str.split(" ");
        for (int i = 0; i < str1.length; i++) {
            // 取出每一个数组
            String word = str1[i];
            // 将每个数组的首字母转换成大写
            char upperCaseFirstWord = Character.toUpperCase(word.charAt(0));
            // 将转换后的大写字母 与原来的后续字母拼接
            String remain = word.substring(1);
            str1[i] = upperCaseFirstWord + remain;
            // System.out.println(str1[i]);
        }

        String result = "";
        for (String words : str1) {
            result += words + " ";
        }
        System.out.println(result);

        // 赋值给str1
        // for (String str2 : str1){
        //     str2.toCharArray();
        //     System.out.println(str2.toCharArray());
        String str11 = "the light";

        String str22 = new String(str11);
        System.out.println(str11 == str22);
        System.out.println(str11.equals(str22));

        String start = "the";
        String end = "light";

        System.out.println(str11.startsWith(start));//以...开始
        System.out.println(str11.endsWith(end));//以...结束

        Random random = new Random();
        ArrayList list = new ArrayList();
    }
}