/**
 * FileName: Item
 * Author:   蔡志勇
 * Date:     2020/7/16 0:44
 * Description:
 * History:
 */

package charactor;

import org.jetbrains.annotations.NotNull;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 * @author 蔡志勇
 * @date 2020/7/16
 * @version 1.0.0
 */
public class Item implements Comparable<Item>{
    private String name;
    private int price;
    int hp;
    int armor;
    int moveSpeed;

    @Override
    public String toString() {
        return name + price;
    }

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(@NotNull Item anotherItem) {
        if (anotherItem.price > price)
            return 1;
        else
            return -1;
    }
}