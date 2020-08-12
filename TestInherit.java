/**
 * FileName: TestInherit
 * Author:   蔡志勇
 * Date:     2020/5/27 13:21
 * Description: 测试继承
 * History:
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈测试继承〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/5/27
 */

class FatherClass{
    public int value;
    public void info(){
        value=100;
        System.out.println("FatherClass="+value);
    }
}
class ChildClass extends FatherClass{
    // public int value;
    public void info(){
        super.info();
        value=200;
        // System.out.println(this.value);
        System.out.println(super.value);
    }
}

class TestInherit {
    public static void main(String[] args) {
        ChildClass c = new ChildClass();
        c.info();
    }
}