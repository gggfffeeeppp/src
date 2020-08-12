/**
 * FileName: APHero
 * Author:   蔡志勇
 * Date:     2020/7/3 20:47
 * Description:
 * History:
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 * @author 蔡志勇
 * @date 2020/7/3
 * @version 1.0.0
 */
public class APHero extends Hero2 implements AP, Mortal{
    @Override
    public void magicAttack(){
        System.out.println("正在进行魔法攻击");
    }

    @Override
    public void die() {
        System.out.println("AP已经死亡");
    }
}