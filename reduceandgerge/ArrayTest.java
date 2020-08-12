package reduceandgerge; /**
 * FileName: reduceandgerge.ArrayTest
 * Author:   蔡志勇
 * Date:     2020/6/28 22:52
 * Description: 去除重复数
 * History:
 */

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br>
 * 〈取出重复数〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/28
 */
public class ArrayTest {
    public static void main(String[] args) {
        ArrayTest at = new ArrayTest();
        int[] array = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
        Integer[] arr = at.getArray(array);
        for (int i = 0; i < arr.length; i++) {
            // System.out.println(Arrays.toString(arr));
            System.out.print(arr[i] + " ");
        }
    }

    //返回重复数和0
    public Integer[] getArray(int[] array) {
//存放重复的数和0
        ArrayList<Integer> list = new ArrayList<Integer>();
//将List保存的数据存入Integer数组里
        Integer[] temp = null;
        for (int i = 0; i < array.length -1; i++) {
//第二个for循环用于检查array[i]是否与之后的数相同，如果相同就存入list
            for (int j = i + 1; j < array.length; j++) {
                temp = new Integer[list.size()];
//如果数组当前位置array[i]的数为0并且list里没有保存它时，将0存入list
                if (array[i] == 0 && !inArray(array[i], list.toArray(temp))) {
                    list.add(array[i]);
                } else {
                    if (array[i] == array[j] && !inArray(array[i], list.toArray(temp))) {
                        list.add(array[i]);
                    }
                }
            }
        }
        temp = new Integer[list.size()];
        return list.toArray(temp);
    }

    //检测指定的数是否之前已经被保存过
    private boolean inArray(int i, Integer[] array) {
        if (array.length == 0 || array == null) {
            return false;
        } else {
            for (int j = 0; j < array.length; j++) {
                if (i == array[j]) {
                    return true;
                }
            }
            return false;
        }
    }
}