/**
 * FileName: CreateDir
 * Author:   蔡志勇
 * Date:     2020/6/22 15:54
 * Description: 创建上层目录
 * History:
 */

import java.io.File;
import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br>
 * 〈创建上层目录〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/22
 */
public class CreateDir {
    public static void main(String[] args) {
        // File f= new File("d:/jjjj/jjj/jj/java");
        // File dir = f.getParentFile();
        // if (!dir.exists()){
        //     dir.mkdirs();
        // }
        int[] a = new int[]{1,23,4,5};
        int[] b = Arrays.copyOf(a,10);
        System.out.println(Arrays.toString(b));
    }


}