/**
 * FileName: Char
 * Author:   蔡志勇
 * Date:     2020/6/2 17:29
 * Description: 字符
 * History:
 */

import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br>
 * 〈字符〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/2
 */
public class Char {
    public static void main(String[] args) {
        char[] cc = new char[4];
        String str1 = "sd3aj";
        String str2 = "SDgAf";
        String str3 = "s3daj";
        String str4 = "as3fg";
        StringBuffer stb = new StringBuffer();
        stb.append(str1);
        System.out.println(stb.reverse());
        // stb.insert(3, "a");
        System.out.println(stb.insert(4, "abc"));


        // StringBuffer stb2 = new StringBuffer();
        //
        // char[] str11 = str1.toCharArray();
        // char[] str22 = str2.toCharArray();
        // char[] str33 = str3.toCharArray();
        // char[] str44 = str4.toCharArray();
        //
        // str1.insert()

        // Scanner str = new Scanner(System.in);
        // for (int i = 0; i < 8; i++) {
        //
        //     for (int j=0; j< cc.length; j++){
        //         cc[i] = cs[j];
        //     }
        // System.out.println(cc);
        // }
        // for (char a : cs) {
        //     System.out.println((short) a);
            // for (char c : cs) {
            //     if (Character.isUpperCase(c) || Character.isDigit(c)) {
            //         System.out.print(c);
            //     }
        // }
    }
}