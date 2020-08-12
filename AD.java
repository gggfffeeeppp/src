/**
 * FileName: ADHero
 * Author:   admin
 * Date:     2020/5/31 18:02
 * Description: 物理攻击
 * History:
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈物理攻击〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/5/31
 */
public interface AD {
    void physicAttack();
    default public void attack(){
        System.out.println("普通攻击");
    }
}

