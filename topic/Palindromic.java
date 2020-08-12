/**
 * FileName: Palindromic
 * Author:   蔡志勇
 * Date:     2020/7/28 2:35
 * Description:
 * History:
 */

package topic;

import javax.sound.midi.Soundbank;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈回文数〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/28
 */
public class Palindromic {
    public static void main(String[] args) {

        // for (int i = 100; i < 10000000; i++) {
        //     char[] ch = String.valueOf(i).toCharArray();
        //     if (ch[0] == ch[ch.length - 1] && ch[1] == ch[ch.length - 2] && ch[2] == ch[ch.length - 3]) {
        //         System.out.println((String.valueOf(ch)));
        //     }
        // }

        // for (int i = 100; i < 1e7; i++) {
        //     String str = String.valueOf(i);
        //     int n =0;
        //     for (int j = 0; j<str.length()/2;j++){
        //         if (str.charAt(j) == str.charAt(str.length()-1));
        //         n++;
        //     }
        //     if (n==str.length())
        //         System.out.println(i);
        //     n = 0;

        for (int i = 10; i<1e7;i++){
            if (isHuiWen(i)){
                System.out.println(i);
            }
        }


    }
    public static <T extends Integer>boolean isHuiWen(T n){

        return new StringBuilder(String.valueOf(n)).reverse().toString().equals(String.valueOf(n));

    }
}

