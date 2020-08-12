/**
 * FileName: TestAggregate
 * Author:   蔡志勇
 * Date:     2020/7/26 15:19
 * Description:
 * History:
 */

package charactor;

import java.util.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/26
 */
public class TestAggregate {
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero2> heros = new ArrayList<Hero2>();
        for (int i = 0; i < 10; i++) {
            heros.add(new Hero2("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        //制造一个重复数据
        heros.add(heros.get(0));

        Comparator<Hero2> c = new Comparator<>() {
            @Override
            public int compare(Hero2 o1, Hero2 o2) {
                return o2.damage - o1.damage;
            }

        };
        Collections.sort(heros,c);
        System.out.println(heros);


        heros
                .stream()
                .sorted((h1, h2) -> h1.hp <= h2.hp ? 1 : -1)
                .limit(3)
                .skip(2)
                .forEach(h -> System.out.println(h));
    }
}