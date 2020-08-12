/**
 * FileName: HealerHero
 * Author:   蔡志勇
 * Date:     2020/5/31 18:35
 * Description: 辅助英雄
 * History:
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈辅助英雄〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/5/31
 */

public class HealerHero extends Hero implements Healer{
    @Override
    public void heal() {
        // 辅助治疗
        System.out.println("进行辅助治疗");
    }
}