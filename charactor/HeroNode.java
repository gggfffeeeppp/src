/**
 * FileName: HeroNode
 * Author:   蔡志勇
 * Date:     2020/7/21 0:20
 * Description:
 * History:
 */

package charactor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/21
 */
public class HeroNode {
    public HeroNode leftNode;
    // 右子节点
    public HeroNode rightNode;

    // 值
    public Hero2 hero;

    // 插入 数据
    public void add(Hero2 h) {
        // 如果当前节点没有值，就把数据放在当前节点上
        if (null == hero)
            hero = h;

            // 如果当前节点有值，就进行判断，新增的值与当前值的大小关系
        else {
            // 新增的值，比当前值小或者相同

            if ((Integer) hero.hp - ((Integer) h.hp) <= 0) {
                if (null == leftNode)
                    leftNode = new HeroNode();
                leftNode.add(h);
            }
            // 新增的值，比当前值大
            else {
                if (null == rightNode)
                    rightNode = new HeroNode();
                rightNode.add(h);
            }

        }

    }

    // 中序遍历所有的节点
    public List<Hero2> values() {
        List<Hero2> values = new ArrayList<>();

        // 左节点的遍历结果
        if (null != leftNode)
            values.addAll(leftNode.values());

        // 当前节点
        values.add(hero);

        // 右节点的遍历结果
        if (null != rightNode)

            values.addAll(rightNode.values());

        return values;
    }

    public static void main(String[] args) {
        List<Hero2> heros = new ArrayList<Hero2>();
        // Hero2[] heros = new Hero2[10];
        for (int i = 0; i < 10; i++) {
            //     heros[i] = new Hero2("hero " + i, (int) (Math.random() * 1000));
            heros.add(new Hero2("hero " + i, (int) (Math.random() * 1000),66));
        }
        System.out.println(heros);
        // System.out.println(Arrays.deepToString(heros));
        HeroNode HeroRoots = new HeroNode();
        for (Hero2 hero : heros) {
            HeroRoots.add(hero);
        }
        System.out.println(HeroRoots.values());
    }
}
