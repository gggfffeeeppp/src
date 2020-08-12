package charactor; /**
 * FileName: charactor.TestCollection
 * Author:   蔡志勇
 * Date:     2020/7/16 0:40
 * Description:
 * History:
 */

import java.util.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/16
 */
public class TestCollection {

    public static void main(String[] args) {

        //对于不使用泛型的容器，可以往里面放英雄，也可以往里面放物品
        // List heros = new ArrayList();
        //
        // heros.add(new Hero2("盖伦",666));
        //
        // //本来用于存放英雄的容器，现在也可以存放物品了
        // heros.add(new Item("冰杖"));
        //
        // //对象转型会出现问题
        // Hero2 h1=  (Hero2) heros.get(0);
        // //尤其是在容器里放的对象太多的时候，就记不清楚哪个位置放的是哪种类型的对象了
        // // Hero2 h2=  (Hero2) heros.get(1);
        //
        // //引入泛型Generic
        // //声明容器的时候，就指定了这种容器，只能放Hero，放其他的就会出错
        // List<Hero2> genericheros = new ArrayList<Hero2>();
        // // genericheros.add(new Hero2("盖伦"));
        // //如果不是Hero类型，根本就放不进去
        // //genericheros.add(new Item("冰杖"));
        //
        // //除此之外，还能存放Hero的子类
        // // genericheros.add(new APHero());
        //
        // //并且在取出数据的时候，不需要再进行转型了，因为里面肯定是放的Hero或者其子类
        // Hero2 h = genericheros.get(0);


        Random random = new Random();
        List<Item> items = new ArrayList<Item>();
        for (int i = 0; i < 10; i++) {
            items.add(new Item("Item " + i + " ", random.nextInt(100)));
        }

        Collections.sort(items);
        System.out.println(items);

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 从大到小 排序
                // if (o1 <= o2)
                //     return 1;
                // else
                //     return -1;
                return o2 - o1;

                // if (o1 >= o2)
                //     return -1;
                // else
                //     return 1;


            }
        };

        TreeSet<Integer> t = new TreeSet<Integer>(c);
        for (int i=0;i<10;i++){
            t.add(i);
        }
        System.out.println(t);
    }
}