/**
 * FileName: ArrayTwoOBject
 * Author:   蔡志勇
 * Date:     2020/7/17 17:38
 * Description:
 * History:
 */

package charactor;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 * @author 蔡志勇
 * @date 2020/7/17
 * @version 1.0.0
 */
public class ArrayTwoObject {

    public static void main(String[] args) {
        Hero2 h = new Hero2("盖伦",666,66);
        Item i = new Item("无尽",666);
        ArrayList a = new ArrayList();
        a.add(h);
        a.add(i);
        System.out.println(a);
    }
}