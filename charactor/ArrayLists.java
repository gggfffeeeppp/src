/**
 * FileName: ArrayLists
 * Author:   蔡志勇
 * Date:     2020/7/17 16:17
 * Description:
 * History:
 */

package charactor;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/17
 */
public class ArrayLists<Hero, Item> {
    private Hero hero;
    private Item item;

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public static void main(String[] args) {
        ArrayLists<String,String> list = new ArrayLists<String,String>();
        list.setHero("yx");
        list.setItem("wp");
        System.out.println(list.getItem() + " " + list.getHero());
        System.out.println(list);
    }
}