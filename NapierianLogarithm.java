/**
 * FileName: NapierianLogarithm
 * Author:   蔡志勇
 * Date:     2020/6/1 18:25
 * Description: 自然对数
 * History:
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈自然对数〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/1
 */
public class NapierianLogarithm {
    public static void main(String[] args) {
        double e = 0;
        for (double n = 55555; n < 100000; n++) {
            e = Math.pow((1+1/n),n);
            System.out.println(e);
        }
        double x=1/(Math.sqrt(Math.E) - 1);
        System.out.println(Math.E);
        System.out.println(x);
    }
}