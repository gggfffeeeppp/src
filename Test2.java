/**
 * FileName: Test2
 * Author:   蔡志勇
 * Date:     2020/5/25 14:14
 * Description: 数组
 * History:
 * <p>
 * 〈一句话功能简述〉<br>
 * 〈数学题〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/5/25
 */

import com.sun.jdi.Method;
import com.sun.jdi.Value;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.w3c.dom.Text;

import java.util.Arrays;


/**
 * 〈一句话功能简述〉<br>
 * 〈数组〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/5/25
 */
// public class Test2 {
//     public static void main(String[] args) {
//     int x= -64;
//     int y= -6;
//     System.out.println(x/y+" "+ Math.abs(x%y));
//         int[] arr = new int[5];
//         // int arr1 = arr[4];
//         // System.out.println(arr1);
//
//         for (int i = 0; i < 5; ++i)
//             arr[i] = i + 1;
//
//
//             // Arrays.toString(arr1);
// 新循环遍历
//         // for (int n : arr)
//             System.out.println(arr[1]);
//     }
// }

// public class Test2 {
//
//     public static void main(String[] args) {
//     int[] arr = {1, 2, 3, 4, 5};
//     // 设置下标
//     int index = 0;
//     boolean length = isLength(index, arr);
//     if (length) {
//         System.out.println(arr[3]);
//     }
// }
//
// // 判断下标是否越界
// @Contract(pure = true)
// static boolean isLength(int index, int[] arr) {
//     boolean flag = false;
//     int length = arr.length;
//     if (index < length) {
//         flag = true;
//     }
//     return flag;
// 创建数组
// int[] arr = {1, 2, 3, 4, 5};
// // for (int n : arr){
// //     System.out.println(n);
// System.out.println(Arrays.toString(arr)); // 返回数组
// int[] arr1 = new int[]{1,2,3,4,5,6};
//     }
// }

// 构造函数可以省略不写，构造函数方法名必须与类同名且不能有返回值 （void也不行）
//     默认为
//     Text2(无参数){
//      // 方法体为空
// }
class Text2 {
    String name;
    int age;

    public Text2(String b, int a) {
        name = b;
        age = a;
    }
    public Text2(int d) {
        int j = 9;
        j = d;
        System.out.println("GG:" + d);
    }

    public static void main(String[] args) {
        Text2 scc = new Text2(7);
        Text2 sc = new Text2("李四", 2);
        System.out.println("姓名:" + sc.name + ",年龄:" + sc.age);
        sc.Text2(3);
    }

    public void Text2(int c) {
        int m = 0;
        m = c;
        System.out.println("凉凉:" + m);
    }
}
