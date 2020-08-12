/**
 * FileName: Encryption
 * Author:   蔡志勇
 * Date:     2020/7/10 16:26
 * Description: 加密
 * History:
 */

package reduceandgerge;

import java.io.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈加密〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/10
 */
public class Encryption {
    public static void encodeFile(File encodingFile, File encodedFile) {
        try (FileInputStream fis = new FileInputStream(encodingFile);
             FileOutputStream fos = new FileOutputStream(encodedFile)) {
        byte[] all = new byte[(int) encodingFile.length()];
        // try (FileReader fr = new FileReader(encodingFile);
        //      FileWriter fw = new FileWriter(encodedFile)) {
        //     char[] all = new char[(int) encodingFile.length()];
            fis.read(all);
            for (int i = 0; i < all.length; i++) {
                if (Character.isDigit(all[i])) {
                    if (all[i] == '9') {
                        all[i] = '0';
                    } else {
                        all[i] = (byte)(all[i] + 1);
                    }
                }
                if (Character.isLetter(all[i])) {
                    if (Character.isUpperCase(all[i])) {
                        if (all[i] == 90) {
                            all[i] = 65;
                        // if ('Z' == all[i]) {
                        //     all[i] = 'A';
                        } else {
                            all[i] = (byte) (all[i] + 1);
                        }
                    }
                    if (Character.isLowerCase(all[i])) {
                        if (all[i] == 122) {
                            all[i] = 97;
                        // if ('z' == all[i]) {
                        //     all[i] = 'a';
                        } else {
                            all[i] = (byte) (all[i] + 1);
                        }
                    }
                }
            }
            fos.write(all);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\admin\\Pictures\\Saved Pictures\\file.txt");
        File f2 = new File("C:\\Users\\admin\\Pictures\\Saved Pictures\\file1.txt");
        encodeFile(f1, f2);
    }
}
