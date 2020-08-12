/**
 * FileName: Persen
 * Author:   蔡志勇
 * Date:     2020/5/26 19:08
 * Description: Persen
 * History:
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈Persen〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/5/26
 */
class Person{
    private static int i = 0;
    private Person() {
        System.out.println("人类?" + i );
        i++;
    }
    private static Person person = new Person();
    public static Person getInstance(){
        return new Person();
        // 这里可以改为 return new Player() / Cooker()
    }
}

public class TestBean{
    public static void main(String[] args){
        int i;
        for(i = 0;i < 3;i++){
            Person.getInstance();
        }
    }
}