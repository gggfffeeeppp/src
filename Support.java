/**
 * FileName: Support
 * Author:   蔡志勇
 * Date:     2020/6/7 16:07
 * Description: 辅助英雄
 * History:
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈辅助英雄〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/7
 */
public class Support extends Hero {
    public static void main(String[] args) {
        Support huatuo = new Support();
        huatuo.heroName = "华佗";
        // huatuo.armor = 27f;

        Hero gailun = new Hero();
        gailun.heroName = "盖伦";
        Hero timo = new Hero();
        timo.heroName = "提莫";

        huatuo.heal(gailun);
        huatuo.heal(gailun, timo);

    }
    public void heal(Hero... heros) {
        for (int i = 0; i<heros.length;i++){
            System.out.println(heroName +"治疗了" + heros[i].heroName);
        }



    }


}