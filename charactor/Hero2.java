/**
 * FileName: Hero2
 * Author:   蔡志勇
 * Date:     2020/7/14 21:20
 * Description:
 * History:
 */

package charactor;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/14
 */
public  class Hero2 {
    public String name;
    public int hp;
    public int damage;
    public Hero2() {

    }

    public Hero2(String name) {
        this.name = name;

    }

    // 增加一个初始化name的构造方法
    public Hero2(String name, int hp,int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    // 重写toString方法
    public String toString() {
        return "name=" +name + "  hp=" +hp + "  damage=" +damage;
    }


    public int compareTo(@NotNull Hero2 anotherHero) {
        if (damage < anotherHero.damage)
            return 1;
        else
            return -1;
    }
    public static int comparatorHero(Hero2 h1, Hero2 h2){
        return h1.hp - h2.hp;
    }

    public static void main(String[] args) {
        List<Hero2> heros = new ArrayList<>();
        Random r = new Random();
        for (int i = 0;i<10;i++)
            heros.add(new Hero2("hero" +i,r.nextInt(1000),r.nextInt(100)));
        heros
                .stream()
                .sorted(Hero2 ::comparatorHero)
                .forEach(h-> System.out.println(h));
    }


}