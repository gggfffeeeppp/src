/**
 * FileName: Animal
 * Author:   蔡志勇
 * Date:     2020/7/6 14:57
 * Description: 抽象
 * History:
 */

package animal;

/**
 * 〈一句话功能简述〉<br>
 * 〈抽象〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/6
 */
public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }
    abstract void eat();

    void walk() {
        System.out.printf("动物%d条腿行走" ,legs);
    }
}