/**
 * FileName: ADAPHero
 * Author:   蔡志勇
 * Date:     2020/7/3 22:49
 * Description:
 * History:
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/3
 */
public class ADAPHero extends Hero2 implements AD, AP,Mortal {
    @Override
    public void physicAttack() {
        System.out.println("正在进行物理攻击");
    }


    @Override
    public void attack() {
        System.out.println("普通攻击3"); // 同时继承AD,AP 的默认方法时,必须重写自己的attack方法
    }


    @Override
    public void magicAttack() {
        System.out.println("正在进行魔法攻击");
    }

    public static void main(String[] args) {
        ADAPHero adap = new ADAPHero();
        adap.attack();
    }

    @Override
    public void die() {
        System.out.println("ADAP已经死亡");
    }
}