/**
 * FileName: TestReflection
 * Author:   蔡志勇
 * Date:     2020/5/31 15:42
 * Description: 反射
 * History:
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈反射〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/5/31
 */
// package reflection;

// import charactor.Hero2;

public class TestReflection {

    public static void main(String[] args) {
        String className = "Hero2";
        try {
            Class pClass1 = Class.forName(className);
            Class pClass2 = Hero.class;
            Class pClass3 = new Hero("Garlen3", 15, 15f, 15f, 15).getClass();
            String pName = pClass3.getName();
            System.out.println(pName);
            System.out.println(pClass1);
            System.out.println(pClass2);
            System.out.println(pClass3);
            System.out.println(pClass1 == pClass2);
            System.out.println(pClass1 == pClass3);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
    }
}

