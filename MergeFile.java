/**
 * FileName: MergeFile
 * Author:   蔡志勇
 * Date:     2020/6/21 17:18
 * Description: 合并文件
 * History:
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br>
 * 〈合并文件〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/21
 */
public class MergeFile {

    private static void writeFile(byte[] data, String fileName) throws Exception {
        File createFile = new File("d:\\Java\\eclipse\\ja\\" + fileName + ".exe");
        if (createFile.exists()) {
            createFile.mkdir();
        }
        FileOutputStream fos = new FileOutputStream(createFile);
        fos.write(new String(data, "utf-8").getBytes());
        fos.flush();
        fos.close();
    }

    public static void main(String[] args) throws Exception {
        splitFile();
        addAll();
    }

    private static void splitFile() {
    }

    public static void addAll() throws Exception {
        File file = new File("d:/Java/eclipse/ja");
        File[] files = file.listFiles();
        int length = 0;
        for (int i = 0; i < files.length; i++) {
            long length1 = files[i].length();
            length = (int) (length + length1);
        }
        byte[] res = new byte[0];
        byte[] targer;
        for (int i = 0; i < files.length; i++) {
            FileInputStream fis = new FileInputStream(files[i]);
            targer = new byte[(int) files[i].length()];
            fis.read(targer);
            res = concat(res, targer);
        }
        writeFile(res, "eclipse00");
    }

    public static byte[] concat(byte[] first, byte[] second) {
        byte[] result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }

}