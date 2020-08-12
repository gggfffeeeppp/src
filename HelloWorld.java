/**
 * FileName: HelloWorld
 * Author:   蔡志勇
 * Date:     2020/5/29 19:43
 * Description: scanner
 * History:
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈scanner〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/5/29
 */
// import java.util.Scanner;
// public class HelloWorld {
//     public static void main(String[] args) {
//         Scanner sca = new Scanner(System.in);
//         int a = sca.nextInt();
//         System.out.println("a:" + a);
//         String b = sca.nextLine();
//         // System.out.println("b:"+ b);
//         String c = sca.nextLine();
//         System.out.println("c:"+ c);
//         sca.close();
//     }
// }


public class HelloWorld {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        switch (season) {
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }
    }
}