/**
 * FileName: HelloHero
 * Author:   蔡志勇
 * Date:     2020/6/11 17:21
 * Description: 你好英雄
 * History:
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈你好英雄〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/11
 */
public class HelloHero {
    public static void main(String[] args) {
        HeroType ht = HeroType.PUSH;

        switch (ht) {
            case ASSASSIN:
                System.out.println("刺客");
                break;
            case TANK:
                System.out.println("坦克");
                break;
            case FARMING:
                System.out.println("打野");
                break;
            case WARRIOR:
                System.out.println("近战");
                break;
            case WIZARD:
                System.out.println("法师 ");
                break;
            case ASSIST:
                System.out.println("辅助");
                break;
            case RANGED:
                System.out.println("远程");
                break;
            case PUSH:
                System.out.println("推进");
                break;
        }
    }
}