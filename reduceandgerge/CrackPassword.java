package reduceandgerge; /**
 * FileName: reduceandgerge.CrackPassword
 * Author:   蔡志勇
 * Date:     2020/6/30 13:25
 * Description: 破解密码
 * History:
 */

import javax.xml.transform.Result;

/**
 * 〈一句话功能简述〉<br>
 * 〈破解密码〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/30
 */
public class CrackPassword {
    // public static String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static void main(String[] args) {
        GetRandom gr = new GetRandom();
        String password = gr.getRandomString(3);
        System.out.println(password);

        String result = "";
        outloop:
        for (int i = 0; i < GetRandom.str.length(); i++) {
            for (int j = 0; j < GetRandom.str.length(); j++) {
                for (int k = 0; k < GetRandom.str.length(); k++) {
                    result = GetRandom.str.charAt(i) +String.valueOf(GetRandom.str.charAt(j)) + GetRandom.str.charAt(k);
                    if (password.equals(result)) {
                        System.out.printf("%s 破解成功" ,result);
                        break outloop;
                    }
                }
            }
        }
    }
}