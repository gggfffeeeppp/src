/**
 * FileName: SortArray
 * Author:   蔡志勇
 * Date:     2020/6/30 14:42
 * Description: 排序数组
 * History:
 */

package reduceandgerge;

import java.util.Arrays;
import java.util.Random;

/**
 * 〈一句话功能简述〉<br>
 * 〈排序数组〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/30
 */
public class SortArray {
    public static void main(String[] args) {
        GetRandom gr = new GetRandom();
        String[] str = new String[8];
        String temp = "";

        for (int i = 0; i < str.length;
             i++) {
            String sortString = gr.getRandomString(5);
            str[i] = sortString;
        }
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (Character.toUpperCase(str[i].charAt(0)) > Character.toUpperCase(str[j].charAt(0))) {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }

                if (Character.toUpperCase(str[i].charAt(0)) == Character.toUpperCase(str[j].charAt(0))) {
                    if (Character.toUpperCase(str[i].charAt(1)) > Character.toUpperCase(str[j].charAt(1))) {
                        temp = str[i];
                        str[i] = str[j];
                        str[j] = temp;
                    }
                }

                if (Character.toUpperCase(str[i].charAt(0)) == Character.toUpperCase(str[j].charAt(0))) {
                    if (Character.toUpperCase(str[i].charAt(1)) == Character.toUpperCase(str[j].charAt(1))) {
                        if (Character.toUpperCase(str[i].charAt(2)) > Character.toUpperCase(str[j].charAt(2))) {
                            temp = str[i];
                            str[i] = str[j];
                            str[j] = temp;
                        }
                    }
                }

                if (Character.toUpperCase(str[i].charAt(0)) == Character.toUpperCase(str[j].charAt(0))) {
                    if (Character.toUpperCase(str[i].charAt(1)) == Character.toUpperCase(str[j].charAt(1))) {
                        if (Character.toUpperCase(str[i].charAt(2)) == Character.toUpperCase(str[j].charAt(2))) {
                            if (Character.toUpperCase(str[i].charAt(3)) > Character.toUpperCase(str[j].charAt(3))) {
                                temp = str[i];
                                str[i] = str[j];
                                str[j] = temp;
                            }
                        }
                    }
                }

                if (Character.toUpperCase(str[i].charAt(0)) == Character.toUpperCase(str[j].charAt(0))) {
                    if (Character.toUpperCase(str[i].charAt(1)) == Character.toUpperCase(str[j].charAt(1))) {
                        if (Character.toUpperCase(str[i].charAt(2)) == Character.toUpperCase(str[j].charAt(2))) {
                            if (Character.toUpperCase(str[i].charAt(3)) == Character.toUpperCase(str[j].charAt(3))) {
                                if (Character.toUpperCase(str[i].charAt(4)) > Character.toUpperCase(str[j].charAt(4))) {
                                    temp = str[i];
                                    str[i] = str[j];
                                    str[j] = temp;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(str));
    }
}


