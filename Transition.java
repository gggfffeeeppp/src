/**
 * FileName: Transition
 * Author:   蔡志勇
 * Date:     2020/5/21 20:11
 * Description: 转换
 * History:
 */


/**
 * 〈一句话功能简述〉<br>
 * 〈转换〉
 *
 * @author 蔡志勇
 * @date 2020/5/21
 * @version 1.0.0
 */
// public class Transition {
//     public static void main(String[] args) {
//         char c = '4';
//         short s = 16;
//         short ss = 17;
//         Integer a = 2;
//         int i = 8;
//
//         System.out.println(getType(s + c));
//     }
//
//     public static String getType(Object o) {
           //  Class cla = p.getClass(); // 通过对象p调用getClass()方法返回Class
//         // return o.getClass().toString();
//         // getClass() 返回此Object运行时类(获得当前对象的运行时类)
//         return o.getClass().getTypeName();
//         // String perName = cla.getName(); // 返回Class 对象所表示的实体（类、接口、数组类、基本类型或 void）名称
//     }
// }

public class Transition {
    public static String get(Object object) {

        return object.getClass().toString();

    }

    public static void main(String[] args) {
        short a = 1;
        short b = 2;
        System.out.println(get(a + b));
    }
}