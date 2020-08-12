/**
 * FileName: GlodenSectionRatio
 * Author:   蔡志勇
 * Date:     2020/6/1 8:04
 * Description: 黄金分割比
 * History:
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈黄金分割比〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/1
 */
public class GlodenSectionRatio {
    public static void main(String[] args) {
        double sectionRatio = 0;
        double glodenSectionRatio = 0.618;
        double nearSectionRatio = 0;
        double mixDifferenceValue = 10;
        int mixDifferenceValueNumerator = 0;
        int mixDifferenceValueDenominator = 0;
        int i; // 分子
        int j; // 分母
        for (i = 1; i <= 20; i++) {
            for (j = 1; j <= 20; j++) {
                sectionRatio = (double) i / j;
                double differenceValue = Math.abs(glodenSectionRatio - sectionRatio);
                if (differenceValue < mixDifferenceValue) {
                    mixDifferenceValue = differenceValue;
                    mixDifferenceValueNumerator = i;
                    mixDifferenceValueDenominator = j;
                    nearSectionRatio = sectionRatio;
                    System.out.println("离黄金分割点0.618最近的分割点为:" + mixDifferenceValueNumerator + "/" + mixDifferenceValueDenominator +"="+nearSectionRatio);
                }
            }
        }
        System.out.printf("离黄金分割点0.618最近的分割点为:%d/%d = %f"+"%n", mixDifferenceValueNumerator, mixDifferenceValueDenominator,nearSectionRatio);
        // System.out.println(mixDifferenceValue);
    }
}