/**
 * FileName: CopyFile
 * Author:   蔡志勇
 * Date:     2020/7/13 17:32
 * Description: 复制文件
 * History:
 */

package topic;

import java.io.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈复制文件〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/13
 */
public class CopyFile {
    public static void main(String[] args) {
        copyFile("C:\\Users\\admin\\Pictures\\Saved Pictures\\file.txt","C:\\Users\\admin\\Pictures\\Saved Pictures\\file1.txt");
    }
    public static void copyFile(String srcFile, String destFile){
        try (FileInputStream fis = new FileInputStream(srcFile);
             FileOutputStream fos = new FileOutputStream(destFile)){
            byte[] all = new byte[srcFile.length()];
            fis.read(all);
            fos.write(all);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}