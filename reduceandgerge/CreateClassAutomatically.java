/**
 * FileName: CreateClassAutomatically
 * Author:   蔡志勇
 * Date:     2020/7/12 12:43
 * Description: 自动填充
 * History:
 */

package reduceandgerge;

import javax.naming.Name;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br>
 * 〈自动填充〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/12
 */
public class CreateClassAutomatically {
    public static void main(String[] args) {
        String className;
        String property = null;
        String type = null;
        String Uprperty;
        Scanner s = new Scanner(System.in);
        System.out.println("请输入类的名称：");
        className = s.nextLine();
        System.out.println("请输入属性名称：");
        property = s.nextLine();
        char[] c = property.toCharArray();
        c[0] = Character.toUpperCase(c[0]);
        Uprperty = String.valueOf(c);
        System.out.println("请输入属性类型：");
        type = s.nextLine();

        s.close();
        // 准备写入内容到字符串数组中
        String[] code = new String[9];
        code[0] = "public class " + className + " {";
        code[1] = "    public " + type + " " + property + ";";
        code[2] = "    public String get" + Uprperty + "() {";
        code[3] = "        return this." + property + ";";
        code[4] = "    }";
        code[5] = "    public void set" + Uprperty + "(String " + property + ") {";
        code[6] = "        this." + property + " = " + property + ";";
        code[7] = "    }";
        code[8] = "}";
        System.out.println("替换后的内容：");
        for (String str : code) {
            System.out.println(str);
        }
        // 将字符串数组写入文件中
        File file = new File("C:\\Users\\admin\\Pictures\\Saved Pictures\\file.txt");
        try (FileWriter fw = new FileWriter(file); PrintWriter pw = new PrintWriter(fw);) {
            for (String each : code) {
                pw.println(each);// 将每行写入java文件中
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}