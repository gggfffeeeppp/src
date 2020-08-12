/**
 * FileName: Cat
 * Author:   蔡志勇
 * Date:     2020/7/6 16:31
 * Description: 猫
 * History:
 */

package animal;

/**
 * 〈一句话功能简述〉<br>
 * 〈猫〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/6
 */
public class Cat extends Animal implements Pet{
    String name;

    Cat(String name) {
        super(4);
        this.name = name;
    }
    Cat(){
        this("");
    }

    @Override
    void eat() {
        System.out.println(this.name + "在吃鱼");
    }

    @Override
    public String getname() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("猫滚着球玩");
    }

    public static void main(String[] args) {
        new Cat("猫");
    }
}