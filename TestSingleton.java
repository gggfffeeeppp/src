/**
 * FileName: TestSingleton
 * Author:   蔡志勇
 * Date:     2020/6/11 13:41
 * Description: 单例
 * History:
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈单例〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/11
 */

public class TestSingleton {
    public static void main(String[] args) {
        Singleton ins = new Singleton();
        Singleton ins1 = Singleton.getInstance();
        Singleton ins2 = Singleton.getInstance();
        Singleton ins3 = Singleton.getInstance();

        System.out.println(ins == ins2);
        System.out.println(ins2 == ins3);
    }
}