/**
 * FileName: ExecutionSequence
 * Author:   蔡志勇
 * Date:     2020/5/22 18:01
 * Description: 执行顺序
 * History:
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈执行顺序〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/5/22
 */

// public class ExecutionSequence {
//
//
// }
//     类修饰符
// java的修饰符有：
// 访问权限修饰符：public、protected、default、private
// 修饰符：abstract、static、final
// public 使用对象：最广，类、接口、变量、方法
// protected 使用对象：变量、方法 注意：不能修饰类（外部类）;
// default 使用对象：类、接口、变量、方法。（即缺省，什么也不写）
// 声明为私有访问类型的变量只能通过类中公共的 getter 方法被外部类访问。
// private 使用对象：变量、方法 注意：不能修饰类（外部类）
// abstract 使用对象：类、接口、方法

// 静态代码块优先于普通代码块和构造器(构造方法),
// 类变量和静态代码块都是类的初始化代码。优先执行先声明的。
// 普通代码块在对象创建的时候执行，静态代码块在类加载的时候执行。
// 静态代码块>普通代码块>构造器(构造方法)>普通方法
//     Java 构造方法有以下特点： 有参数构造方法 跟 无参数构造方法
//     在一个类中定义多个具有不同参数的同名方法，这就是方法的重载
//             方法名必须与类名相同
//             可以有 0 个、1 个或多个参数
//             没有任何返回值，包括 void
//             默认返回类型就是对象类型本身
//             只能与 new 运算符结合使用
// 普通代码块每创建一次执行一次；静态代码块只执行一次

public class ExecutionSequence {
    private boolean myFlag;
    public int a;
    private int b;

    {
        System.out.println("主函数构造代码块,如果构造函数被执行,则再次生成");
    }

    static {
        System.out.println("主函数静态代码块,只加载一次");
    }

    public static void main(String[] args) {
        System.out.println("111");
        new ExecutionSequence(44, 94);
        new D();
        new A();
        new ExecutionSequence();
        new C();
        new ExecutionSequence(77);
        new D();
    }

    public ExecutionSequence(int a) {
        System.out.println(a);
    }

    public ExecutionSequence() {
        System.out.println("a0");
    }

    public ExecutionSequence(int a, int b) {
        System.out.println("a:" + a + ",b:" + b);
    }
}
// @Override
// void ExecutionSequence(){
//     int a = 15;
//     System.out.println("重载");
// }
// abstract class G{
//     {
//         System.out.println("00");
//     }
// }

class C {
    static {
        System.out.println("2");
    }

    C() {
        System.out.println("3");
    }

    {
        System.out.println("4");
    }

    // public static void main(String[] args) {
    //     System.out.println("1");
    //     new ExecutionSequence(55, 94);
        // new D();
        // new A();
        // new ExecutionSequence();
        // new C();
        // new ExecutionSequence(77);
        // new D();
    // }
}

class A {
    {
        System.out.println("10");
    }

    static {
        System.out.println("11");
    }

    A() {
        System.out.println("12");
    }

    // static{
    //     System.out.println("Hello World!!!") ;
    //     System.exit(0) ; // 程序退出
    // }
}

class D extends C {
    public String sd1 = getSd1();

    static public String getSd() {
        System.out.println("5");
        return sd;
    }

    static {
        System.out.println("6");
    }

    public static String sd = getSd();

    D() {
        System.out.println("7");
    }

    {
        System.out.println("8");
    }

    public String getSd1() {
        System.out.println("9");
        return sd1;
    }
}
// 126543987 声明的静态代码块 > 未声明静态(构造代码块) > 执行函数(方法)(父类>子类) {构造方法 > 普通方法}