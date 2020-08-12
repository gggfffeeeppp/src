/**
 * FileName: FileSize
 * Author:   蔡志勇
 * Date:     2020/6/15 15:10
 * Description: 文件大小
 * History:
 */

import java.io.File;
import java.io.IOException;

/**
 * 〈一句话功能简述〉<br>
 * 〈文件大小〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/15
 */
public class FileSize {
    public static void main(String[] args) throws IOException {
        File file = new File("d:/Java");
        maxAndMin(file);

    }

    public static void maxAndMin(File f) {
        File maxFile = null;
        File minFile = null;
        long max = 0;
        long min = Integer.MAX_VALUE;

        if (f.isDirectory()) {
            File[] files = f.listFiles();
            if (files != null) {
                for (File fs : files) {
                    if (fileSize(fs) > max) {
                        maxFile = fs;
                        max = fileSize(fs);
                    }
                    if (fileSize(fs) < min && fileSize(fs) != 0) {
                        minFile = fs;
                        min = fileSize(fs);
                    }
                }
            }
        }
        System.out.printf("%s是最大的文件,文件大小为%,d字节.%s是最小的文件,文件大小为%,d字节.", maxFile.getAbsolutePath(), max, minFile.getAbsolutePath(), min);
    }

    public static long fileSize(File f) {
        long total = 0;
        if (f.isDirectory()) {
            File[] files = f.listFiles();
            for (File fs : files) {
                total += fileSize(fs);
            }
            return total;
        } else {
            return f.length();
        }
    }
}