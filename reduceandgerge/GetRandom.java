/**
 * FileName: GetRandom
 * Author:   蔡志勇
 * Date:     2020/6/29 21:37
 * Description:
 * History:
 */

package reduceandgerge;

import java.util.Random;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 * @author 蔡志勇
 * @date 2020/6/29
 * @version 1.0.0
 */
public class GetRandom {
    public static String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static String getRandomString(int length) {

        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
}