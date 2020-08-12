/**
 * FileName: SerializableArray
 * Author:   蔡志勇
 * Date:     2020/7/11 21:07
 * Description: 序列化数组
 * History:
 */

package reduceandgerge;

import java.io.*;
import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br>
 * 〈序列化数组〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/11
 */
public class SerializableArray {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\admin\\Pictures\\Saved Pictures\\file.txt");
        Hero[] h = new Hero[10];
        try (FileOutputStream fos = new FileOutputStream(f); ObjectOutputStream oos = new ObjectOutputStream(fos);
             FileInputStream fis = new FileInputStream(f); ObjectInputStream obs = new ObjectInputStream(fis)
        ) {
            for (int i = 0; i < h.length; i++) {
                h[i] = new Hero();
                // System.out.println(h[i]);
            }
            oos.writeObject(h);
            Hero[] h2 = (Hero[]) obs.readObject();
            for (int i= 0;i<h2.length ;i++)
                System.out.println(h2.getClass().getName() + i);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        // 控制台输入
        // try (InputStream is = System.in;) {
            // while (true) {
            //     // 敲入a,然后敲回车可以看到
            //     // 97 13 10
            //     // 97是a的ASCII码
            //     // 13 10分别对应回车换行
            //     int i = is.read();
            //     System.out.println(i);
            // }

            // Scanner s = new Scanner(System.in);
            //
            // while(true){
            //     String line = s.nextLine();
            //     System.out.println(line);

            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            System.out.println("第一个整数："+a);
            int b = s.nextInt();
            System.out.println("第二个整数："+b);


        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // Hero2 h = new Hero2();
        // h.name = "garen";
        // h.hp = 616;
        //
        // //准备一个文件用于保存该对象
        // File f =new File("d:/garen.lol");
        //
        // try(
        //         //创建对象输出流
        //         FileOutputStream fos = new FileOutputStream(f);
        //         ObjectOutputStream oos =new ObjectOutputStream(fos);
        //         //创建对象输入流
        //         FileInputStream fis = new FileInputStream(f);
        //         ObjectInputStream ois =new ObjectInputStream(fis);
        // ) {
        //     oos.writeObject(h);
        //     Hero2 h2 = (Hero2) ois.readObject();
        //     System.out.println(h2.name);
        //     System.out.println(h2.hp);
        //
        // } catch (IOException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // } catch (ClassNotFoundException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
    }
}
