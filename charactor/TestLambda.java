package charactor;
/**
 * FileName: charactor.TestLambda
 * Author:   蔡志勇
 * Date:     2020/7/25 7:30
 * Description:
 * History:
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 * @author 蔡志勇
 * @date 2020/7/25
 * @version 1.0.0
 */
public class TestLambda {
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero2> heros = new ArrayList<Hero2>();
        for (int i = 0; i < 5; i++) {
            // heros.add(new Hero2("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);

        HeroChecker c = new HeroChecker() {


            public boolean test(Hero2 h) {
                return h.hp>100 && h.damage<50;
            }
        };
        Comparator<Hero2> cc = new Comparator<Hero2>() {
            @Override
            public int compare(Hero2 h1, Hero2 h2) {
                if (h1.damage < h2.damage)
                    return 1;
                else
                    return -1;
            }
        };

        System.out.println("使用匿名类过滤");
        filter(heros, c);
        System.out.println("使用Lambda表达式");
        filter(heros, h->h.hp>100 && h.damage<50);
        System.out.println("在Lambda表达式中使用静态方法");
        filter(heros, h -> TestLambda.testHero(h) );
        System.out.println("直接引用静态方法");
        filter(heros, TestLambda::testHero);
    }

    public static int testHero2(Hero2 h1, Hero2 h2){
        if (h1.damage < h2.damage)
            return 1;
        else
            return -1;
    }

    public static boolean testHero(Hero2 h) {
        return h.hp>100 && h.damage<50;
    }

    private static void filter(List<Hero2> heros, HeroChecker checker) {
        for (Hero2 hero : heros) {
            if (checker.test(hero))
                System.out.println(hero);
        }
    }

}