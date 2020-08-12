/**
 * FileName: Armor
 * Author:   蔡志勇
 * Date:     2020/6/7 15:07
 * Description: 护甲类
 * History:
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈护甲类〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/7
 */
public class Armor extends Item {
    int ac;
    public static void main(String[] args) {
        Armor clothArmour = new Armor();
        Armor hauberk = new Armor();
        clothArmour.ac = 20;
        clothArmour.itemName = "布甲";
        clothArmour.price = 250;
        hauberk.ac = 50;
        hauberk.itemName = "锁子甲";
        hauberk.price = 500;

        System.out.println(hauberk);
    }
}