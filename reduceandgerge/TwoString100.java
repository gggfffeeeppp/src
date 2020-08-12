package reduceandgerge; /**
 * FileName: reduceandgerge.TwoString100
 * Author:   蔡志勇
 * Date:     2020/6/27 17:08
 * Description: 100个字符串
 * History:
 */

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br>
 * 〈100个字符串〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/27
 */

public class TwoString100 {
    static int count = 0;
    public static void main(String[] args) {
        String[] strArray = new String[100];
        char[] str = new char[2];
        for (int i = 0; i < strArray.length; i++) {
            while (true) {
                // for (int j = 0; j <str.length; i++) {
                char c1 = (char) (Math.random() * 74 + 48);
                char c2 = (char) (Math.random() * 74 + 48);
                if ((Character.isDigit(c1) || Character.isLetter(c1)) && (Character.isDigit(c2) || Character.isLetter(c2))) {
                    str[0] = c1;
                    str[1] = c2;
                    break;
                }
            }
            // System.out.println(str);
            strArray[i] = String.valueOf(str);
        }
        System.out.println(Arrays.toString(strArray));

        // for (int i = 0; i < strArray.length; i++) {
        // System.out.print(strArray[i] + " ");
        // if (19 == i % 20) {
        //     System.out.println();
        // }
        // }

        TwoString100 at = new TwoString100();
        // int[] array = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
        String[] arr = at.getArray(strArray);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(count);
    }

    public String[] getArray(String[] array) {
//存放重复的数和0
        ArrayList<String> list = new ArrayList<String>();
//将List保存的数据存入Integer数组里
        String[] temp = null;

        for (int i = 0; i < array.length - 1; i++) {
//第二个for循环用于检查array[i]是否与之后的数相同，如果相同就存入list
            for (int j = i + 1; j < array.length; j++) {
                temp = new String[list.size()];
//如果数组当前位置array[i]的数为0并且list里没有保存它时，将0存入list
//                 if (array[i] == 0 && !strArray(array[i], list.toArray(temp))) {
//                     list.add(array[i]);
//                 } else {
                if (array[i].equals(array[j]) && !strArray(array[i], list.toArray(temp))) {
                    list.add(array[i]);
                    count++;
                }
                // }
            }
        }
        temp = new String[list.size()];
        return list.toArray(temp);
    }

    // 检测指定的字符串是否之前已经被保存过
    private boolean strArray(String s, String[] array) {
        if (array == null || array.length == 0) {
            return false;
        } else {
            for (int j = 0; j < array.length; j++) {
                if (s.equals(array[j])) {
                    return true;
                }
            }
            return false;
        }
    }
}

// String[] coincideStr = new String[300];
// for (int i = 0; i < strArray.length - 1; i++) {
//     for (int j = i + 1; j < strArray.length; j++) {
//         if (strArray[i].equals(strArray[j])) {
//             System.out.println(strArray[i]);
//             coincideStr[i] = strArray[i];
//             coincideStr[j] = strArray[j];
//         }
//     }
// }
//
// int count = 0;
// for (int i = 0; i < coincideStr.length; i++) {
//     if (null != coincideStr[i]) {
//         count++;
//         System.out.print(coincideStr[i] + " ");
//     }
// }
// System.out.println(Arrays.toString(coincideStr));
// String[] strings = new String[count];
//
// String repetition = "";
// for (int j = 0; j < strings.length; j++) {
//     for (int i = 0; i < coincideStr.length; i++) {
//         if (null != coincideStr[i]){
//             strings[j] = coincideStr[i];
//             break;
//         }
//     }
// if (!repetition.contains(coincideStr[j])) {
// }
// }
//
// System.out.println(count);
// System.out.println(Arrays.toString(strings));
// }
// }