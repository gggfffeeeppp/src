
/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 蔡志勇
 * @date 2020/7/4
 * @version 1.0.0
 */

import java.util.ArrayList;
import java.util.List;

/**
 * FileName: Call
 * Author:   蔡志勇
 * Date:     2020/7/4 19:10
 * Description:
 * History:
 */

public class Call {
    String name;

    public void finalize() {
        System.out.println("这个英雄正在被回收");
    }

    // public String toString() {
    // return name;
    // }

    public static void main(String[] args) {
        CC c = new CC();
        c.call();
        Call h = new Call();
        h.name = "盖伦";
        System.out.println(h.toString());
        //直接打印对象就是打印该对象的toString()返回值
        System.out.println(h);

        // List<Hero2> heros = new ArrayLists<>();
        // //放进容器内
        // for (int i = 0; i < 5; i++) {
        //
        //     heros.add(new Hero2("hero" + i));
        //     System.out.println(heros);
        // }
        // for (int i = 0; i < 1000000; i++) {
        //     //不断生成新的对象

        //     //每创建一个对象，前一个对象，就没有引用指向了
        //     //那些对象，就满足垃圾回收的条件
        //     //当，垃圾堆积的比较多的时候，就会触发垃圾回收
        //     //一旦这个对象被回收，它的finalize()方法就会被调用
        //     cc = new Call();
    }
}


//父类
class AA {
    public void call() {
        System.out.println("汪汪汪");
    }
}

//继承A
class B extends AA {

    @Override
    public void call() {
        System.out.println("喵喵喵");
        //调用父类的方法
        //就等于调用了A类中的call();
        super.call();
    }

}

//继承B
class CC extends B {
    @Override
    public void call() {
        System.out.println("叽叽喳喳");
        //调用父类中的方法
        //就等于调用了B类中的call();
        super.call();
    }

}