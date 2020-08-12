/**
 * FileName: TestReturn
 * Author:   蔡志勇
 * Date:     2020/7/6 22:21
 * Description: 测试返回123
 * History:
 */

package exception;

/**
 * 〈一句话功能简述〉<br>
 * 〈测试返回123〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/6
 */
public class TestReturn {
    public int method() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

    public static void main(String[] args) {
        TestReturn tr = new TestReturn();
        int i = tr.method();
        System.out.println(i);
    }
}