/**
 * FileName: YellowCrane
 * Author:   蔡志勇
 * Date:     2020/6/2 15:55
 * Description: 黄鹤
 * History:
 */

import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br>
 * 〈黄鹤〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/2
 */
public class YellowCrane {
    public static void main(String[] args) {
        System.out.println("请输入地址:");
        Scanner address = new Scanner(System.in);
        String address1 = address.nextLine();

        System.out.println("请输入老板名字:");
        Scanner name = new Scanner(System.in);
        String name1 = name.nextLine();

        System.out.println("请输入公司名字:");
        Scanner companyName = new Scanner(System.in);
        String companyName1 = companyName.nextLine();

        System.out.println("请输入公司类型:");
        Scanner companyType = new Scanner(System.in);
        String companyType1 = companyType.nextLine();

        System.out.println("请输入金额:");
        Scanner money = new Scanner(System.in);
        int money1 = money.nextInt();

        System.out.println("请输入产品:");
        Scanner product = new Scanner(System.in);
        String product1 = product.nextLine();

        String content = "%s最大%s%s倒闭了，王八蛋老板%s吃喝嫖赌，欠下了3.5个亿，带着他的小姨子跑了!我们没有办法，拿着%s抵工资!原价都是一万多、两万多、三万多的%s，现在全部只卖%d块，统统只要%d块!%s王八蛋，你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱!";
        System.out.printf(content,address1,companyType1,companyName1,name1,product1, product1,money1,money1,name1);
    }
}