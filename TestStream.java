/**
 * FileName: TestStream
 * Author:   蔡志勇
 * Date:     2020/6/6 16:58
 * Description: 字节流测试
 * History:
 */

import java.io.*;
import java.sql.SQLOutput;
import java.util.Objects;

/**
 * 〈一句话功能简述〉<br>
 * 〈字节流测试〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/6
 */
public class TestStream {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\admin\\Pictures\\Saved Pictures\\file.txt");
        try (FileWriter fw = new FileWriter(f);
             PrintWriter pw = new PrintWriter(fw)) {

            pw.println("garen kill teemo");
            pw.println("teemo revive after 1 minutes");
            pw.println("teemo try to garen, but killed again");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileReader fr = new FileReader(f);
        BufferedReader bw = new BufferedReader(fr)) {
            while (true){
                String line = bw.readLine();
                if (null == line)
                    break;
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        // try {
        //     File f = new File("d:/Java/project/LOL.txt");
        //     FileInputStream fis = new FileInputStream(f);
        //     byte[] all = new byte[(int) f.length()];
        //     fis.read(all);
        //     for (byte a : all)
        //         System.out.println(a);
        //     fis.close();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
        //
        // try {
        //     File f = new File("d:/Java/project/LOL2.txt");
        //     byte[] b = {78, 79};
        //     FileOutputStream fos = new FileOutputStream(f);
        //     fos.write(b);
        //     FileInputStream fis = new FileInputStream(f);
        //     byte[] all1 = new byte[(int) f.length()];
        //     fis.read(all1);
        //     for (byte c : all1)
        //         System.out.println(c);
        //
        //     fos.close();
        //
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
        // try {
        //     String fp = "d:/jjjj/jjj/jj/java.txt";
        //     File ff = new File(fp);
        //     FileOutputStream fos = new FileOutputStream(ff);
        //     // if (!exists()) {
        //     //     ff.mkdirs();
        //     // }
        //
        //     System.out.println("正在传入文件");
        // }catch (Exception e){
        //     e.printStackTrace();
        // }
    }
}