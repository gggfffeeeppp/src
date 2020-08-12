/**
 * FileName: Fish
 * Author:   蔡志勇
 * Date:     2020/7/6 18:33
 * Description: 鱼
 * History:
 */

package animal;

/**
 * 〈一句话功能简述〉<br>
 * 〈鱼〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/6
 */
public class Fish extends Animal implements Pet{
    private String name;
    Fish(){
        super(0);

    }
    // protected Fish(int legs) {
    //     super(0);
    // }

    @Override
    void eat() {

    }

    @Override
    public String getname() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void play() {

    }

    @Override
    void walk() {
        System.out.println("鱼不能走,且没有脚");
    }
}