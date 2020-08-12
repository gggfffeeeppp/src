/**
 * FileName: Item
 * Author:   Cai Zhiyong
 * Date:     2020/5/19 20:34
 * Description: 物品
 * History:
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈物品〉
 *
 * @author Cai Zhiyong
 * @date 2020/5/19
 * @version 1.0.0
 * 长剑 350 攻击 +10
 * 草鞋 300 移动 +20
 * 血瓶 50 血量 +150
 */
public class Item {
    String itemName; // 物品名
    int price; // 价格
    int attack; // 攻击力
    int movementSpeed; // 移动
    int hp; // 血量

    // public abstract boolean disposable();

    @Override
    public String toString() {
        return "Item{" +
                "name='" + itemName + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] ags) {
        // Item longSword = new Item();
        // longSword.itemName = "长剑";
        // longSword.attack = 10;
        // longSword.price = 350;
        //
        // Item strawSandals = new Item();
        // strawSandals.itemName = "草鞋";
        // strawSandals.price = 300;
        // strawSandals.movementSpeed = 20;
        //
        // Item bloodVial = new Item();
        // bloodVial.itemName = "血瓶";
        // bloodVial.price = 1;
        // bloodVial.hp = 150;
        // System.out.println(bloodVial.hp);
    }
}
// class LifePotion extends Item{
//
//     @Override
//     public boolean disposable() {
//         return true;
//     }
// }
//
// class Weapon extends Item {
//
//     @Override
//     public boolean disposable() {
//         return false;
//     }
// }
