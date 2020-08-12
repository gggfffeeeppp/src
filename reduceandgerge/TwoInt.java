/**
 * FileName: TwoInt
 * Author:   蔡志勇
 * Date:     2020/7/11 20:16
 * Description: 写入和读取两个数字
 * History:
 */

package reduceandgerge;

import java.io.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈写入和读取两个数字〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/11
 */
public class TwoInt {
    public static void main(String[] args) {
        File f  = new File("C:\\Users\\admin\\Pictures\\Saved Pictures\\file.txt");
        try (FileOutputStream fos = new FileOutputStream(f); DataOutputStream dos = new DataOutputStream(fos);
             FileInputStream fis = new FileInputStream(f); DataInputStream dis= new DataInputStream(fis)){
            dos.writeInt(13);
            dos.writeInt(18);
            int i = dis.readInt();
            int j = dis.readInt();
            System.out.println(i + " " + j);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}