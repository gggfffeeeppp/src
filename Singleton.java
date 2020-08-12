/**
 * FileName: Singleton
 * Author:   蔡志勇
 * Date:     2020/6/11 13:36
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
public class Singleton {
    Singleton(){

    }
    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }

}