/**
 * FileName: Rhombus
 * Author:   蔡志勇
 * Date:     2020/6/8 14:45
 * Description: 菱形
 * History:
 */

package Math99;

/**
 * 〈一句话功能简述〉<br>
 * 〈菱形〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/8
 */
public class Rhombus {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; i < j; j--) {
                System.out.print(" ");
            }
            for (int q = 1; q < i * 2; q++) {
                System.out.print("*");
            }
            for (int j = 5; i < j; j--) {
                System.out.print(" ");
                // if (i + 1 == j) {
                //     System.out.print("\n");
            }
            System.out.println();

        }
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++)
                System.out.print(" ");

            for (int q = i * 2; q < 9; q++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    // for (int  i = 4; i > 0; i--) {
    //     for (int j = 5; j; j++)
    //         System.out.print(" ");
    //
    //     for (int q = 7; q > i * 2; q--) {
    //         System.out.print("*");
    //
    //     }
    //     for (int j = 1; j <= i; j++)
    //         System.out.print(" ");
    //         if (i - 1 == j) {
    //             System.out.print("\n");
    //         }
    // }
    // }
}