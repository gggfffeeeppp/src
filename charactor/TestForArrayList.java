package charactor; /**
 * FileName: charactor.TestForArrayList
 * Author:   蔡志勇
 * Date:     2020/7/17 22:51
 * Description:
 * History:
 */

import java.util.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 * @author 蔡志勇
 * @date 2020/7/17
 * @version 1.0.0
 */
public class TestForArrayList {
    public static void main(String[] args) {
        List<Hero2> heros = new ArrayList<Hero2>();

        //放5个Hero进入容器
        for (int i = 0; i < 100; i++) {
            // if (0 == i % 8) {
            //     continue;
            // }
            // heros.add(new Hero2("hero name " +i));
        }
        for (int i =1; i <100; i++){
            if (0 == i % 8)
                heros.set(i,null);
        }
        System.out.println(heros);

        //第二种遍历，使用迭代器
        System.out.println("--------使用while的iterator-------");
        Iterator<Hero2> it= heros.iterator();
        //从最开始的位置判断"下一个"位置是否有数据
        //如果有就通过next取出来，并且把指针向下移动
        //直到"下一个"位置没有数据
        while(it.hasNext()){
            Hero2 h = it.next();
            System.out.println(h);
        }
        //迭代器的for写法
        System.out.println("--------使用for的iterator-------");
        for (Iterator<Hero2> iterator = heros.iterator(); iterator.hasNext();) {
            Hero2 hero = iterator.next();
            System.out.println(hero);
        }

        //LinkedList是一个双向链表结构的list
        LinkedList<Hero2> ll =new LinkedList<Hero2>();

        //所以可以很方便的在头部和尾部插入数据
        //在最后插入新的英雄
        // ll.addLast(new Hero2("hero1"));
        // ll.addLast(new Hero2("hero2"));
        // ll.addLast(new Hero2("hero3"));
        // System.out.println(ll);
        //
        // //在最前面插入新的英雄
        // ll.addFirst(new Hero2("heroX"));
        System.out.println(ll);

        //查看最前面的英雄
        System.out.println(ll.getFirst());
        //查看最后面的英雄
        System.out.println(ll.getLast());

        //查看不会导致英雄被删除
        System.out.println(ll);
        //取出最前面的英雄
        System.out.println(ll.removeFirst());

        //取出最后面的英雄
        System.out.println(ll.removeLast());

        //取出会导致英雄被删除
        System.out.println(ll);

        List list = new LinkedList();
        Queue<Hero2> q = new LinkedList();

        q.offer(new Hero2("一拳超人",666,66));
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
    }
}