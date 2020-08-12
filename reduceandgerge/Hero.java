/**
 * FileName: Hero2
 * Author:   蔡志勇
 * Date:     2020/7/11 22:44
 * Description:
 * History:
 */

package reduceandgerge;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 * @author 蔡志勇
 * @date 2020/7/11
 * @version 1.0.0
 */
import java.io.Serializable;

public class Hero implements Serializable {
    //表示这个类当前的版本，如果有了变化，比如新设计了属性，就应该修改这个版本号
    private static final long serialVersionUID = 1L;
    public String name;
    public float hp;

}