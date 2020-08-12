/**
 * FileName: BMI
 * Author:   蔡志勇
 * Date:     2020/5/29 20:30
 * Description: BMI
 * History:
 * <p>
 * 〈一句话功能简述〉<br>
 * 〈BMI〉
 */

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.print("你的身高为(m):");
                Scanner sc = new Scanner(System.in);
                Float height = sc.nextFloat();
                System.out.print("你的体重为(kg):");
                Float weight = sc.nextFloat();
                Float bmi = weight / (height * height);
                System.out.println("你的BMI值为:" + bmi);
                if (bmi < 60) {
                    System.out.println("健康");
                }
            } catch (Exception e){
                System.out.println("输入有误");
                e.printStackTrace();
            }
        }
    }
}

