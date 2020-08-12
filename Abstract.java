/**
 * FileName: Abstract
 * Author:   蔡志勇
 * Date:     2020/6/16 15:52
 * Description: 抽象继承
 * History:
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈抽象继承〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/16
 */
abstract class Abstract {
    private int age = 10;

    public Abstract(int age) {
        System.out.println("初始化Abstract");
    }

    public void move() {
        System.out.println("跑步数：" + this.age);
    }
}

abstract class Dog extends Abstract {
    public Dog(int age) {
        super(age);//去掉会报异常
        System.out.println("初始化Dog");
    }
}

class BigDogs extends Dog {
    public BigDogs() {
        super(20);
        System.out.println("初始化BigDog");
    }

    public static void main(String[] args) {
        BigDogs a = new BigDogs();
        a.move();
    }
}
