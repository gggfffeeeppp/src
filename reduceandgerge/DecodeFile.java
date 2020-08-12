/**
 * FileName: DecodeFile
 * Author:   蔡志勇
 * Date:     2020/7/10 22:18
 * Description: 解密
 * History:
 */

package reduceandgerge;

import java.io.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈解密〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/10
 */
public class DecodeFile {
    public static void decodeFile(File decodingFile, File decodedFile) {
        try (FileInputStream fis = new FileInputStream(decodingFile);
             FileOutputStream fos = new FileOutputStream(decodedFile)) {
            byte[] all = new byte[(int) decodingFile.length()];
        //     try (FileReader fr = new FileReader(decodingFile);
        //          FileWriter fw = new FileWriter(decodedFile)) {
        //     char[] all = new char[(int) decodingFile.length()];
            fis.read(all);
            for (int i = 0; i < all.length; i++) {
                if (Character.isDigit(all[i])) {
                    if (all[i] == '0') {
                        all[i] = '9';
                    } else {
                        all[i] = (byte)(all[i] - 1);
                    }
                }
                if (Character.isLetter(all[i])) {
                    if (Character.isUpperCase(all[i])) {
                        if (all[i] == 65) {
                            all[i] = 90;
                            // if ('Z' == all[i]) {
                            //     all[i] = 'A';
                        } else {
                            all[i] = (byte) (all[i] - 1);
                        }
                    }
                    if (Character.isLowerCase(all[i])) {
                        if (all[i] == 97) {
                            all[i] = 122;
                            // if ('z' == all[i]) {
                            //     all[i] = 'a';
                        } else {
                            all[i] = (byte) (all[i] - 1);
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
        File f1 = new File("C:\\Users\\admin\\Pictures\\Saved Pictures\\file1.txt");
        File f2 = new File("C:\\Users\\admin\\Pictures\\Saved Pictures\\file2.txt");
        decodeFile(f1, f2);
    }
}