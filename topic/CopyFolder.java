/**
 * FileName: CopyFolder
 * Author:   蔡志勇
 * Date:     2020/7/13 17:50
 * Description: 复制文件夹
 * History:
 */

package topic;

import java.io.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈复制文件夹〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/13
 */
public class CopyFolder {
    public static void main(String[] args) {
        copyFolder("C:\\Users\\admin\\Pictures\\Saved Pictures","C:\\Users\\admin\\Pictures\\Microsoft.Windows.Photos_8wekyb3d8bbwe!App");
    }

    public static void copyFolder(String srcFolder, String destFolder) {
        File sf = new File(srcFolder);
        File df = new File(destFolder);
        if (!sf.exists()) {
            throw new RuntimeException("源文件不存在");
        }

        if (!df.exists()) {
            df.mkdirs();
        }

        if (sf.isFile()) {
            if (df.isFile()) {
                copy(sf.getAbsolutePath(),df.getAbsolutePath());
            } else if (df.isDirectory()) {
                File newfile = new File(df,df.getName());
                copy(sf.getAbsolutePath(),newfile.getAbsolutePath());
            }
        }

        if (sf.isDirectory()) {
            if (df.isDirectory()){
                File[] fs = sf.listFiles();
                for (File f : fs){
                    File newfile = new File(df,f.getName());
                    if (f.isFile()) {
                        copy(f.getAbsolutePath(),newfile.getAbsolutePath());
                    }
                    if (f.isDirectory()) {
                        copyFolder(f.getAbsolutePath(),newfile.getAbsolutePath());
                    }
                }
            }
            else if (df.isFile()){
                throw new RuntimeException("源文件是文件夹,目标为文件,无法进行复制操作");
            }
        }
    }


    public static void copy(String srcPath, String destPath) {
        byte[] bytes = new byte[1024];
        try (FileInputStream fis = new FileInputStream(srcPath);
             FileOutputStream fos = new FileOutputStream(destPath)) {
            while (true) {
                int i = fis.read(bytes);
                System.out.println(i);
                if (i == -1) {
                    break;
                }
                fos.write(bytes, 0,i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}