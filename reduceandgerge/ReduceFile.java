package reduceandgerge; /**
 * FileName: reduceandgerge.ReduceFile
 * Author:   蔡志勇
 * Date:     2020/6/23 16:42
 * Description: 分解文件
 * History:
 */

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br>
 * 〈分解文件〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/23
 */
public class ReduceFile {
    public static void main(String[] args) {
        int reduceFileSize = 1024;
        File srcFile = new File("C:\\Users\\admin\\Pictures\\Saved Pictures\\image.jpg");
        spliteFile(srcFile, reduceFileSize);
    }

    private static void spliteFile(File srcFile, int reduceFileSize) {
        if (0 == srcFile.length()) {
            throw new RuntimeException("文件长度为0,无法进行分解");
        }
        byte[] fileContent = new byte[(int) srcFile.length()];
        // 先把文件读取到数组中
        try (FileInputStream fis = new FileInputStream(srcFile)){
            fis.read(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 计算需要被划分成多少份子文件
        int fileNumber;
        // 文件是否能被整除得到的子文件个数是不一样的
        // (假设文件长度是25，每份的大小是5，那么就应该是5个)
        // (假设文件长度是26，每份的大小是5，那么就应该是6个)
        if (0 == fileContent.length % reduceFileSize) {
            fileNumber = (int) (fileContent.length / reduceFileSize);
        } else {
            fileNumber = (int) (fileContent.length / reduceFileSize + 1);
        }
        for (int i = 0; i < fileNumber; i++) {
            // 根据源文件名字并生成新文件名字
            String a = "image";
            String b = ".jpg";
            String eachFileName = a + i + b;
            // 获取源文件所在目录,在该目录下生成新文件
            File eachFile = new File(srcFile.getParentFile(), eachFileName);
            byte[] eachFileContent;
            if (i != fileNumber - 1) {
                eachFileContent = Arrays.copyOfRange(fileContent, reduceFileSize * i, reduceFileSize * (i + 1));
            } else {
                eachFileContent = Arrays.copyOfRange(fileContent, reduceFileSize * i, fileContent.length);
            }

            try (FileOutputStream fos = new FileOutputStream(eachFile)){
                fos.write(eachFileContent);
                System.out.printf("输出子文件%s，其大小是 %d字节%n", eachFile.getAbsoluteFile(), eachFile.length());

            } catch (IOException e){
                e.printStackTrace();
            }
        }

        // 从源文件的内容里，复制部分数据到子文件
        // 除开最后一个文件，其他文件大小都是100k
        // 最后一个文件的大小是剩余的

        // 写出去

        // 记得关闭
    }
}