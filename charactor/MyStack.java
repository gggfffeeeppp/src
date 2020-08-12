/**
 * FileName: MyStack
 * Author:   蔡志勇
 * Date:     2020/7/18 20:21
 * Description:
 * History:
 */

package charactor;

import java.util.LinkedList;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 * @author 蔡志勇
 * @date 2020/7/18
 * @version 1.0.0
 */
public class MyStack implements Stack{
    LinkedList<Hero2> heros = new LinkedList<>();

    @Override
    public void push(Hero2 h) {
        heros.addLast(h);
    }

    @Override
    public Hero2 pull() {

        return heros.removeLast();
    }

    @Override
    public Hero2 peek() {
        return heros.getLast();
    }

    public static void main(String[] args) {
        // MyStack hero =new MyStack();
        // for (int i=0;i < 5;i++)
        //     hero.push(new Hero2("hero " + i));
        // for (int i=0;i < 5;i++)
        //     System.out.println(hero.pull());
        // System.out.println(hero.peek());
        // System.out.println(hero);
    }
}