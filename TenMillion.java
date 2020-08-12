/**
 * FileName: TenMillion
 * Author:   蔡志勇
 * Date:     2020/6/1 23:10
 * Description: 一千万里有多少个质数
 * History:
 */

import javax.swing.text.html.FormSubmitEvent;

/**
 * 〈一句话功能简述〉<br>
 * 〈一千万里有多少个质数〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/1
 */
public class TenMillion {
    public static void main(String[] args) {
        // 非素数个数 默认有个数字1为非素数
        int notPrime = 1;
        int num = 10000000;
        // 素素个数
        int prime = 0;
        // 程序起始时间
        long startTime = System.currentTimeMillis();
        for (int i = 3; i <= num; i++) {
            for (int j = 2; j <= Math.sqrt(i) + 1; j++) {
                if (0 == i % j) {
                    notPrime++;
                    break;
                }
            }
        }
        // 素数个数 = 总数 - 非素数个数
        prime = num - notPrime;
        System.out.println(notPrime + "," + prime);
        // 程序结束时间
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + "ms");

        long startTime1 = System.currentTimeMillis();
        int count = 1;
        for (int i = 3; i <= num; i++) {
            boolean prime1 = isPrime(i);
            if (prime1) {
                count++;
            }
        }
        System.out.println(count);
        long endTime1 = System.currentTimeMillis();
        System.out.println(endTime1 - startTime1 + "ms");
    }

    public static boolean isPrime(int n) {
        for (int j = 2; j <= Math.sqrt(n) + 1; j++) {
            if (0 == n % j) {
                return false;
            }
        }
        return true;
    }
}

//     public static void main(String[] args) {
//         int max = (int) 1e7;
//
//         //我的方法
//         long startTime =  System.currentTimeMillis();   //计时
//         boolean[] notprimes = new boolean[max];         //标志器
//         notprimes[0] = true;                            //默认0和1不是质数
//         notprimes[1] = true;
//         for (int i = 2 ; i<=Math.sqrt(notprimes.length); i++){
//             // 判断notprimes下标是否为false, 该位置如果为素数则进行修改
//             if(!notprimes[i] && isPrime(i)){
//                 for (int j = i*2; j < max; j+=i) {
//                     notprimes[j] = true;
//                 }
//             }
//         }
//         int count = 0;
//         for (int i = 0; i < max ; i++){
//             if(!notprimes[i])   count++;            //计数
//         }
//         long endTime =  System.currentTimeMillis(); //结束计时
//         long usedTime = endTime-startTime;
//         System.out.println("改良方法：有"+count+"个质数，用了"+usedTime+"毫秒");
//
//         //原方法
//         startTime =  System.currentTimeMillis();
//         count = 0 ;
//         for (int i = 1; i <=max; i++) {
//             if(isPrime(i)){
//                 count++;
//             }
//         }
//
//         endTime =  System.currentTimeMillis();
//         usedTime = endTime-startTime;
//         System.out.println("原方法：有"+count+"个质数，用了"+usedTime+"毫秒");
//     }
//
//     private static boolean isPrime(int i) {
//         for (int j = 2; j <= Math.sqrt(i); j++) {
//             if(0==i%j)
//                 return false;
//         }
//         return true;
//     }
// }
