/**
 * FileName: Stack
 * Author:   admin
 * Date:     2020/7/18 20:20
 * Description:
 * History:
 */

package charactor;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/18
 */
public interface Stack {
    //把英雄推入到最后位置
    public void push(Hero2 h);

    //把最后一个英雄取出来
    public Hero2 pull();

    //查看最后一个英雄
    public Hero2 peek();
}
