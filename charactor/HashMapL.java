/**
 * 准备一个ArrayList其中存放3000000(三百万个)Hero对象，其名称是随机的,格式是hero-[4位随机数]
 * hero-3229
 * hero-6232
 * hero-9365
 * ...
 *
 * 因为总数很大，所以几乎每种都有重复，把名字叫做 hero-5555的所有对象找出来
 * 要求使用两种办法来寻找
 * 1. 不使用HashMap，直接使用for循环找出来，并统计花费的时间
 * 2. 借助HashMap，找出结果，并统计花费的时间
 */


package charactor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapL {


    public static void main(String[] args) {
        List<Hero2> hs = new ArrayList<>();
        System.out.println("初始化开始");
        for (int i = 0; i < 3000000; i++) {
            Hero2 h = new Hero2("hero-" + ((int) (Math.random() * 9000) + 1000));
            hs.add(h);
        }
        HashMap<String, List<Hero2>> heroMap = new HashMap<>();
        for (Hero2 h : hs) {
            List<Hero2> list = heroMap.get(h.name);
            if (list == null) {
                list = new ArrayList<>();
                heroMap.put(h.name, list);
            }
            list.add(h);
        }
        System.out.println("初始化结束");
        System.out.println("开始查找");
        findByMap(heroMap);
        findByIteration(hs);

    }

    private static List<Hero2> findByMap(HashMap<String, List<Hero2>> m) {
        long start = System.currentTimeMillis();
        List<Hero2> result = m.get("hero-6666");
        long end = System.currentTimeMillis();
        System.out.printf("通过map查找，一共找到%d个英雄，耗时%d毫秒%n", result.size(), end - start);
        return result;
    }

    private static List<Hero2> findByIteration(List<Hero2> hs) {
        long start = System.currentTimeMillis();
        List<Hero2> result = new ArrayList<>();
        for (Hero2 h : hs) {
            if (h.name.equals("hero-6666")) {
                result.add(h);
            }
        }
        long end = System.currentTimeMillis();
        System.out.printf("通过for查找，一共找到%d个英雄，耗时%d毫秒%n", result.size(), end - start);


        long start1 = System.currentTimeMillis();
        int n = 0;
        for (Hero2 h : hs) {
            if (h.name.equals("hero-6666")) {
                n++;
            }
        }
        long end1 = System.currentTimeMillis();
        System.out.printf("通过for查找，一共找到%d个英雄，耗时%d毫秒%n", n, end1 - start1);
        return result;
    }


}