/**
 * FileName: Chinese
 * Author:   蔡志勇
 * Date:     2020/7/13 16:28
 * Description:
 * History:
 */

package topic;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 * @author 蔡志勇
 * @date 2020/7/13
 * @version 1.0.0
 */
import java.io.*;

public class Chinese {

    public static void main(String[] args) {
        File f = new File("C:\\Users\\admin\\Pictures\\Saved Pictures\\file.txt");
        try (FileOutputStream fos = new FileOutputStream(f)

        ){
            byte[] b = {(byte) 0xE5,(byte) 0xB1,(byte) 0x8C};
            fos.write(b);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileInputStream fis = new FileInputStream(f)) {
            byte[] all = new byte[(int) f.length()];
            fis.read(all);
            System.out.println("文件中读出来的数据是：");
            for (byte b : all) {
                int i = b & 0x000000ff;  //只取16进制的后两位
                System.out.println(Integer.toHexString(i));
            }
            System.out.println("把这个数字，放在UTF-8的棋盘上去：");
            String str = new String(all,"UTF-8");
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}