package reduceandgerge;

import java.io.*;

class MergeFiles {
    public static void main(String[] args)
    {
        murgeFile("C:\\Users\\admin\\Pictures\\Saved Pictures", "image");
    }

    /**
     * 合并的思路，就是从eclipse.exe-0开始，读取到一个文件，就开始写出到 eclipse.exe中，直到没有文件可以读
     *
     * @param folder   需要合并的文件所处于的目录
     * @param fileName 需要合并的文件的名称
     * @throws FileNotFoundException
     */
    private static void murgeFile(String folder, String fileName) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File destFile = new File(folder, fileName);
            // 合并的目标文件
            fos = new FileOutputStream(destFile);
            int index = 0;
            while (true) {
                //子文件
                File eachFile = new File(folder, fileName + index++ + ".jpg");
                // 如果子文件不存在了就结束
                if (!eachFile.exists())
                    break;

                //读取子文件的内容
                fis = new FileInputStream(eachFile);
                byte[] eachContent = new byte[(int) eachFile.length()];
                fis.read(eachContent);

                //把子文件的内容写出去
                fos.write(eachContent);
                fos.flush();
                System.out.printf("把子文件 %s写出到目标文件中%n", eachFile);
            }

            System.out.printf("最后目标文件的大小：%,d字节", destFile.length());

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (null != fis) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != fos) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}