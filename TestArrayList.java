/**
 * FileName: TestArrayList
 * Author:   蔡志勇
 * Date:     2020/7/14 21:19
 * Description:
 * History:
 */

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 * @author 蔡志勇
 * @date 2020/7/14
 * @version 1.0.0
 */

import charactor.Hero2;

public class TestArrayList {

    public static void main(String[] args) {
        ArrayList heros = new ArrayList();

        // 初始化5个对象
        for (int i = 0; i < 5; i++) {
            // heros.add(new Hero2("hero " + i));
        }
        // Hero2 specialHero = new Hero2("special hero");
        // heros.add(specialHero);

        //获取指定位置的对象
        System.out.println(heros.get(5));
        //如果超出了范围，依然会报错
        System.out.println(heros.get(0));

        System.out.println(heros);
        // System.out.println("specialHero所处的位置:"+heros.indexOf(specialHero));
        // System.out.println("新的英雄，但是名字是\"hero 1\"所处的位置:"+heros.indexOf(new Hero2("hero 2")));
        Hero2[] hs = (Hero2[]) heros.toArray(new Hero2[]{});
        System.out.println(heros +" "+ hs);
        String s = "hero 4";
        for (int i = 0; i< heros.size();i++)
            if (heros.get(i).toString().equals(s)){
                System.out.printf("存在名字为%s的对象", s);
                break;
            }

    }
}