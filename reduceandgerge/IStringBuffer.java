/**
 * FileName: IStringBuffer
 * Author:   admin
 * Date:     2020/7/1 15:36
 * Description: 接口
 * History:
 */

package reduceandgerge;

/**
 * 〈一句话功能简述〉<br>
 * 〈接口〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/1
 */
public interface IStringBuffer {
    public void append(String str) throws YouStringBuffer.IndexIsNegativeException, YouStringBuffer.IndexIsOutofRangeException; //追加字符串

    public void append(char c) throws YouStringBuffer.IndexIsNegativeException, YouStringBuffer.IndexIsOutofRangeException;  //追加字符

    public void insert(int pos, char b) throws YouStringBuffer.IndexIsNegativeException, YouStringBuffer.IndexIsOutofRangeException; //指定位置插入字符

    public void insert(int pos, String b) throws YouStringBuffer.IndexIsNegativeException, YouStringBuffer.IndexIsOutofRangeException; //指定位置插入字符串

    public void delete(int start) throws YouStringBuffer.IndexIsNegativeException, YouStringBuffer.IndexIsOutofRangeException; //从开始位置删除剩下的

    public void delete(int start, int end) throws YouStringBuffer.IndexIsNegativeException, YouStringBuffer.IndexIsOutofRangeException; //从开始位置删除结束位置-1

    public void reverse(); //反转

    public int length(); //返回长度
}
