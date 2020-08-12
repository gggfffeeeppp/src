/**
 * FileName: Garlen
 * Author:   蔡志勇
 * Date:     2020/5/31 10:51
 * Description: 盖伦
 * History:
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈盖伦〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/5/31
 */
public class Garlen {

    public String name;

    protected float hp;

    public static void main(String[] args) {
        Garlen h1 = new Garlen();
        Garlen h2 = new Garlen();
        Garlen h3;
        Garlen h4;
        h3 = h1;
        h4 = h3;
        h2.name = "破山击";
        // h1.name = " ";
        System.out.println(h4.name + "," + h2.name);
    }
}
