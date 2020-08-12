/**
 * FileName: ADHero
 * Author:   蔡志勇
 * Date:     2020/5/31 18:10
 * Description: 物理英雄
 * History:
 */

import java.security.PublicKey;
import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br>
 * 〈物理英雄〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/5/31
 */
public class ADHero extends Hero2 implements AD,Mortal {
    int moveSpeed=400; //移动速度
    @Override
    public void physicAttack() {
        System.out.println("正在进行物理攻击");
    }

    @Override
    public void die() {
        System.out.println("AD已经死亡");
    }

    public int getMoveSpeed(){
        return this.moveSpeed;
    }

    public int getMoveSpeed2(){
        return super.moveSpeed;
    }
    public void useItem(Item i) {
        System.out.println("adhero use item");
        super.useItem(i);
    }

    public static void battleWin(){
        System.out.println("ad hero battle win");
    }
    public ADHero(){
        super();
        System.out.println("AD Hero的无参构造方法");
    }
    public ADHero(String name){
        super(name);
        System.out.println("AD Hero的一个参数构造方法");
    }

    public static void main(String[] args) {
        ADHero h = new ADHero("星星火");
        System.out.println(h.getMoveSpeed());
        System.out.println(h.getMoveSpeed2());
        // h.useItem();

        Hero2 h2 = new Hero2();
        ADHero ad = new ADHero();
        //子类转父类
        h2 = ad;
        ArrayList<Hero> hs =new ArrayList<>();
        ArrayList<ADHero> adhs =new ArrayList<>();

        // 子类泛型转父类泛型
        // hs = adhs; // 失败
        // 父类泛型转子类泛型
        // adhs = hs; // 失败
    }

}