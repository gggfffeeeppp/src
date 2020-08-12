/**
 * FileName: Monkey
 * Author:   蔡志勇
 * Date:     2020/6/10 18:37
 * Description: 猴子吃桃
 * History:
 */

import com.sun.tools.javac.Main;

/**
 * 〈一句话功能简述〉<br>
 * 〈猴子吃桃〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/10
 */
// public class Monkey {
//     public static void main(String[] args) {
//         int all = 1;
//         for (int i = 1; i < 10; i++){
//             // all = ( all +1) * 2;
//             all = 2 * all + 2;
//         }
//         System.out.println(all);
//     }
// }

// package charactor;

// public class Monkey {
//     public String name;
//     protected float hp;
//     float maxHP;
//
//     //物品栏的容量
//     public static int itemCapacity=8; //声明的时候 初始化
//
//     static{
//         itemCapacity = 6;//静态初始化块 初始化
//     }
//
//     public Monkey(){
//
// //     }
//
//     public static void main(String[] args) {
//         System.out.println(Monkey.itemCapacity);
//     }
//
// }



// ackage charactor;

public class Monkey {
    public String name = "some hero";

    public Monkey(){
        // name = "one hero";
        System.out.println("3");
    }
    {
        // name = "the hero";
        System.out.println("2");
    }

    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        System.out.println(monkey.name);
    }

}