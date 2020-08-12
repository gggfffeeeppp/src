package reduceandgerge; /**
 * FileName: reduceandgerge.FiveRandomChar
 * Author:   蔡志勇
 * Date:     2020/6/11 19:23
 * Description: 5个随机字符
 * History:
 */

import java.util.Random;

/**
 * 〈一句话功能简述〉<br>
 * 〈5个随机字符〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/11
 */
public class FiveRandomChar {
    public static void main(String[] args) {
        StringBuilder pool = new StringBuilder();
        for (short i = '0'; i <= '9'; i++) {
            pool.append((char) i);
        }
        for (short i = 'A'; i <= 'Z'; i++) {
            pool.append((char) i);
        }
        for (short i = 'a'; i <= 'z'; i++) {
            pool.append((char) i);
        }
        System.out.println(pool);
        char[] ch2 = new char[5];
        for (int i = 0; i < ch2.length; i++) {
            int index = (int) (Math.random() * pool.length());
            ch2[i] = pool.charAt(index);
        }
        String result2 = new String(ch2);
        System.out.println(result2);

        short start = '0';
        short end = 'z';
        char[] ch1 = new char[5];
        StringBuilder result1 = new StringBuilder();
        for (int i=0; i< ch1.length; i++) {
            char randomValue;
            while (true) {
                randomValue = (char) (Math.random() * (end - start) + start);
                if (Character.isDigit(randomValue) || Character.isUpperCase(randomValue)) {
                    break;
                }
            }
            // 为字符数组ch1的每个索引赋值
            ch1[i] = randomValue;
            // 通过Stringbuilder的append方法在字符串末尾添加字符串
            result1.append(randomValue);
        }
        // 生成一个字符串对象, 参数为字符数组
        String str1 = new String(ch1);
        System.out.println(str1);
        System.out.println(result1);
    }
}