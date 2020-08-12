/**
 * FileName: RemoveComments
 * Author:   蔡志勇
 * Date:     2020/7/11 17:11
 * Description: 删除注释
 * History:
 */

package reduceandgerge;

import java.io.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈删除注释〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/11
 */
public class RemoveComments {

    public static void main(String[] args) {
        File f = new File("C:\\Users\\admin\\Pictures\\Saved Pictures\\file.txt");
        removeComments(f);
    }
    public static void removeComments(File javaFile) {
        File f1 = new File("C:\\Users\\admin\\Pictures\\Saved Pictures\\file1.txt");
        try (FileReader fr = new FileReader(javaFile); BufferedReader br = new BufferedReader(fr);
             FileWriter fw = new FileWriter(f1); PrintWriter pw = new PrintWriter(fw)){
            while (true) {
                String line = br.readLine();
                if (null == line) {
                    break;
                }
                char[] c = line.trim().toCharArray();
                if (c[0] =='\\' && c[1]=='\\'){
                // char[] c = line.toCharArray();
                // if (line.trim().startsWith("\\\\")){
                    continue;
                }
                System.out.println(line);
                pw.println(line);
                pw.flush();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}