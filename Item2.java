/**
 * FileName: Item2
 * Author:   Cai Zhiyong
 * Date:     2020/5/20 17:10
 * Description: 物品2
 * History:
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈物品2〉
 *
 * @author Cai Zhiyong
 * @date 2020/5/20
 * @version 1.0.0
 */
public class Item2 {
    private String name;
    private int price;
    int hp;
    int armor;
    int moveSpeed;

    @Override
    public String toString() {
        return name + price;
    }

    public Item2(String name, int price) {
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
}

