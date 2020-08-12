/**
 * FileName: Hero
 * Author:   蔡志勇
 * Date:     2020/7/23 1:20
 * Description:
 * History:
 */

package topic;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 * @author 蔡志勇
 * @date 2020/7/23
 * @version 1.0.0
 */

public class Hero implements Comparable<Hero>{
    public String name;
    public float hp;

    public int damage;

    public Hero(){

    }

    public Hero(String name) {
        this.name =name;

    }

    //初始化name,hp,damage的构造方法
    public Hero(String name,float hp, int damage) {
        this.name =name;
        this.hp = hp;
        this.damage = damage;
    }

    @Override
    public int compareTo(Hero anotherHero) {
        if(damage<anotherHero.damage)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
    }

}