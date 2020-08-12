
/**
 * FileName: ConstructionMethod
 * Author    蔡志勇
 * Date:     2020/5/22 23:25
 * Description: 构造方法
 * History:
 */


/**
 * 〈一句话功能简述〉<br>
 * 〈构造方法〉
 *
 * @author Cai Zhiyong
 * @version 1.0.0
 * @date 2020/5/22
 */
public class ConstructionMethod {
    public String name;    // 姓名
    private int age;    // 年龄

    // 定义带有一个参数的构造方法
    public ConstructionMethod(String name) {
        this.name = name;
    }

    // 定义带有两个参数的构造方法
    public ConstructionMethod(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "大家好！我是新来的员工，我叫" + name + "，今年" + age + "岁。";
    }

    public static void main(String[] args) {
        ConstructionMethod constructionMethod1 = new ConstructionMethod("蔡啊",25);
        ConstructionMethod constructionMethod = new ConstructionMethod("蔡");
        ConstructionMethod constructionMethod2 = new ConstructionMethod("蔡啊a",30);
        System.out.println(constructionMethod);
        System.out.println(constructionMethod1);
        System.out.println(constructionMethod2);
    }
}

