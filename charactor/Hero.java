/**
 * FileName: HeroNode
 * Author:   蔡志勇
 * Date:     2020/7/20 20:47
 * Description:
 * History:
 */

package charactor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/20
 */
public class Hero {
    public Hero leftHero;

    public Hero rightHero;

    public Object hp;

    public String hero;

    // public void Heros(String hero) {
    //     this.hero = hero;
    // }

    //二叉树放入
    public void add(Object hps, int i) {

        if (this.hp == null) {
            this.hp = hps;
            this.hero = "hero" + i;
        } else {
            if ((int) this.hp <= (int) hps) {
                if (leftHero == null) {
                    leftHero = new Hero();
                    // leftHero.Heros("hero" + i);
                }

                leftHero.add(hps, i);
            }

            if ((int) this.hp > (int) hps) {
                if (rightHero == null) {
                    rightHero = new Hero();
                    // rightHero.Heros("hero" + i);
                }

                rightHero.add(hps, i);
            }
        }
    }

    // 中序遍历所有的节点
    public List<Hero> values() {
        List<Hero> values = new ArrayList<>();

        // 左节点的遍历结果
        if (null != leftHero) {
            values.addAll(leftHero.values());
        }
        // 当前节点
        values.add(this);

        // 右节点的遍历结果
        if (null != rightHero) {
            values.addAll(rightHero.values());
        }

        return values;
    }

    public static void main(String[] args) {
        System.out.println("初始化多少个");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        Hero heros = new Hero();

        for (int i = 0; i < x; i++) {
            Object hp = (int) (Math.random() * 1000);

            heros.add(hp, i);
        }
        List<Hero> list = heros.values();
        System.out.println(list);
        for(Hero hero : list) {
            System.out.println("name=" + hero.hero + " hp值=" + hero.hp);
        }
    }
}
