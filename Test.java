/**
 * FileName: Test
 * Author:   蔡志勇
 * Date:     2020/5/23 18:28
 * Description: 测试
 * History:
 * <p>
 * 〈一句话功能简述〉<br>
 * 〈测试〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/5/23
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈测试〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/5/23
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(new Test().hashCode());
        Test power = new Test();
        System.out.println(power.hashCode());
        Object p = power;
        System.out.println(p.hashCode());
        power = new Test();
        System.out.println(power.hashCode());
        System.out.println(power.hashCode());
    }
}

// package date;

//

// import java.util.Date;
//
// public class Test {
//
//     public static void main(String[] args) {
//         Date now = new Date();
//
//         //当前日期的毫秒数
//         System.out.println("Date.getTime() \t\t\t\t返回值: " + now.getTime());
//         //通过System.currentTimeMillis()获取当前日期的毫秒数
//         System.out.println("System.currentTimeMillis() \t返回值: " + System.currentTimeMillis());
//
//     }
// }