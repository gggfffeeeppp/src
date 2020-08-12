/**
 * FileName: Search5555
 * Author:   蔡志勇
 * Date:     2020/7/21 18:04
 * Description:
 * History:
 */

package charactor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/21
 */
public class Search5555 {
    public static void main(String[] args) {
        ArrayList<Hero2> heros = new ArrayList();
        for (int i = 0; i < 3000000; i++) {
            heros.add(new Hero2("hero-" + (int) (Math.random() * 9000 + 1000)));
        }
        int count =0;

        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 3000000; i++) {
            Hero2 hero = (Hero2) heros.get(i);
            if (hero.name.equals("hero-5555")) {
                // System.out.println(hero);
                count++;
            }
        }
        System.out.println(count);
        long time2 = System.currentTimeMillis();
        long useTime1 = time2 - time1;
        System.out.println(useTime1);

        HashMap<String, ArrayList<Hero2>> heroMap = new HashMap<>();
        for (Hero2 h:heros){
            ArrayList<Hero2> list = heroMap.get(h.name);
            if (null == list){
                list = new ArrayList<>();
                heroMap.put(h.name, list);
            }
            list.add(h);
        }

        long time3 = System.currentTimeMillis();
        int result = heroMap.get("hero-5555").size();
        System.out.println(result);
        long time4 =System.currentTimeMillis();
        long useTime2 = time4 - time3;
        System.out.println(useTime2);
    }
}