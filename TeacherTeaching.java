/**
 * FileName: TeacherTeaching
 * Author:   蔡志勇
 * Date:     2020/5/27 20:29
 * Description: 老师教学
 * History:
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈老师教学〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/5/27
 */
public class TeacherTeaching {
    public static void main(String[] args) {
        javaTeacher jTeacher = new javaTeacher("张三", 26);
        DBTeacher dTeacher = new DBTeacher("李四", 27);
        jTeacher.teaching();
        dTeacher.teaching();
    }
}


class teacher {
    private String name;
    private int age;

    public teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void teaching() {
        System.out.println(age + "岁的" + name + "课前准备");//未用get set时，虽然外界不能直接调用私有变量，但是可以通过方法显示
    }
}

class javaTeacher extends teacher {
    public javaTeacher(String name, int age) {
        super(name, age);
    }

    public void teaching() {
        super.teaching();//方法重写
        System.out.println("打开eclipse");
        System.out.println("编写java程序");
    }
}

class DBTeacher extends teacher {
    public DBTeacher(String name, int age) {
        super(name, age);
    }

    public void teaching() {
        super.teaching();//方法重写
        System.out.println("打开Oracle");
        System.out.println("编写pl-sql程序");
    }
}

