/**
 * FileName: General
 * Author:   蔡志勇
 * Date:     2020/7/16 15:42
 * Description: 泛型
 * History:
 */

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br>
 * 〈泛型〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/16
 */
public class General {
    public static void iterate(ArrayList <? extends Hero2> list) {
        for (Hero2 hero: list) {
            System.out.println(hero.name);
        }
    }
    public static void main(String[] args) {
        ArrayList<Number> num = new ArrayList<>();
        num.add(new Integer(18));
        num.add(new Float(18.8));

        ArrayList<Hero2> hero2 = new ArrayList<>();
        General g = new General();
        hero2.add(new ADHero("菜菜的志勇"));
        iterate(hero2);
    }
}