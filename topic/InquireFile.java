/**
 * FileName: InquireFile
 * Author:   蔡志勇
 * Date:     2020/7/13 19:29
 * Description: 查询文件
 * History:
 */

package topic;

import java.io.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈查询文件〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/13
 */
public class InquireFile {
    public static void main(String[] asgs) {
        inquireFile("C:\\Users\\admin\\Pictures\\Saved Pictures", "tu jdj");
    }

    public static void inquireFile(String srcFolder, String name) {
        File file = new File(srcFolder);
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                inquireFile(files[i].getAbsolutePath(), name);
            } else {
                String filename = files[i].getName();
                File f = new File(srcFolder, filename);
                try (FileReader fr = new FileReader(f);
                //      BufferedReader br = new BufferedReader(fr)
                ) {
                    char[] all = new char[(int) f.length()];
                    fr.read(all);
                    if (String.valueOf(all).contains(name)) {
                        System.out.printf("包含字符串%s的文件为" ,name);
                        System.out.println(files[i].getAbsolutePath());
                    }
                //     while (true) {
                //         String line = br.readLine();
                //         if (line.contains(name)) {
                //             System.out.println(line);
                //             System.out.println(filename);
                //             break;
                //         }
                //         if (null != line) {
                //             // System.out.println(line);
                //         }
                //         if (null == line)
                //             break;
                //     }
                // try (FileInputStream fis = new FileInputStream(f);
                //      DataInputStream dis = new DataInputStream(fis);
                //      FileOutputStream fos = new FileOutputStream(f);
                //      DataOutputStream dos = new DataOutputStream(fos)
                //     ){
                //     byte[] ch = new byte[(int) f.length()];
                //     fis.read(ch);
                //     dos.writeUTF(String.valueOf(ch));
                //
                //     String s = dis.readUTF();
                //     if (s.contains(name))
                //         System.out.println(filename);

                } catch (IOException e) {
                    e.printStackTrace();
                }
                // String[] sp = filename.split(name);
                // if (sp.length >= 2) {
                //     System.out.println(files[i].getName());
                // }
            }
        }
    }

}