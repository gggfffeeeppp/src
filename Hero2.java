/**
 * FileName: Beg
 * Author:   蔡志勇
 * Date:     2020/5/31 12:56
 * Description: 乞讨
 * History:
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈乞讨〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/5/31
 */
// public class Beg {
//     public static void main(String[] args) {
//
//         int result = 0;
//         for (int day = 1;day <= 10; day++){
//             int money = (int) Math.pow(2,day -1);
//             result += money;
//             // money = money * 2;
//         }
//         System.out.println(result);
//     }
// }

// public class Beg {
//     public String name = "some hero";
//
//     public Beg(){
//         name = "one hero";
//     }
//     {
//         name = "the hero";
//     }
//
//     public static void main(String[] args) {
//         Beg b = new Beg();
//         System.out.println(b.name);
//     }
//
// }

// public class Hero2 {
//     public String name;
//     protected float hp;
//
//     public static void main(String[] args) {
//         ADHero ad = new ADHero();
//         APHero ap = new APHero();
//
//         Hero2 h1 = ad;
//         Hero2 h2 = ap;
//
//         //判断引用h1指向的对象，是否是ADHero类型
//         System.out.println(h1 instanceof ADHero);
//
//         //判断引用h2指向的对象，是否是APHero类型
//         System.out.println(h2 instanceof APHero);
//
//         //判断引用h1指向的对象，是否是Hero的子类型
//         System.out.println(h1 instanceof Hero2);
//     }
// }


public class Hero2 {
    public String name;
    protected float hp;
    public int moveSpeed;
    public void kill(Mortal m) {
        m.die();
    }

    public void attack() {
        System.out.println("进攻手段");
    }
    public Hero2(){
        System.out.println("Hero的无参的构造方法 ");
    }

    public Hero2(String name){
        System.out.println("Hero的有一个参数的构造方法 ");
        this.name = name;
    }
    public static void battleWin(){
        System.out.println("hero battle win");
    }
    public void useItem(Item i) {
        System.out.println("父类的使用物品");
    }

    public static void main(String[] args) {
        ADHero adh=new ADHero();
        //通过打印adh，可以看到adh这个对象属于ADHero类
        adh.attack();
        System.out.println(adh);

        Hero2 h = new Hero2(){
            //当场实现attack方法
            public void attack() {
                System.out.println("新的进攻手段");
            }
        };
        h.attack();
        //通过打印h，可以看到h这个对象属于Hero$1这么一个系统自动分配的类名

        System.out.println(h);
        // Hero2 galen = new Hero2();
        // ADHero ad = new ADHero();
        // Hero2 h = ad;
        // AD adi = (AD) h;
        // APHero ap = (APHero) adi; // 报错

        APHero ap = new APHero();
        ADAPHero adap = new ADAPHero();
        // galen.kill(ap);
        // galen.kill(adap);
        // galen.kill(ad);
        // ad.battleWin();
        new ADHero("德莱文");
    }
}
