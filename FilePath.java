/**
 * FileName: FilePath
 * Author:   蔡志勇
 * Date:     2020/6/14 13:56
 * Description: 文件路径
 * History:
 */

import java.io.File;

/**
 * 〈一句话功能简述〉<br>
 * 〈文件路径〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/14
 */
public class FilePath {
    public static void main(String[] args) {
        File f1 = new File("d:/Java/LOL");
        System.out.println(f1.getAbsolutePath());
        File f2 = new File(f1, "LOL.exe");
        System.out.println(f2.getAbsolutePath());
    }

}