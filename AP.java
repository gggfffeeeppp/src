/**
 * FileName: AP
 * Author:   admin
 * Date:     2020/7/3 20:44
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
public interface AP {
    // public static final int resistPhysic = 100;

    //resistMagic即便没有显式的声明为 public static final
    //但依然默认为public static final
    int resistMagic = 0;

    // public void magicAttack();


    void magicAttack();

    default public void attack() {
        System.out.println("普通攻击2");
    }
}