/**
 * FileName: Spider
 * Author:   蔡志勇
 * Date:     2020/7/6 15:21
 * Description: 蜘蛛
 * History:
 */

package animal;

/**
 * 〈一句话功能简述〉<br>
 * 〈蜘蛛〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/6
 */
public class Spider extends Animal{
    Spider(){
        super(8);
    }

    @Override
    void eat() {
        System.out.println("蜘蛛吃东西");
    }
}