/**
 * FileName: Actual
 * Author:   蔡志勇
 * Date:     2020/5/25 14:00
 * Description: 指针
 * History:
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈指针〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/5/25
 */

public class Actual {
    private void actual(int arr[]){
        arr[0]=arr[0]*5;
        System.out.println(arr[0]);
    }


    public static void main(String[]args){
        int a[]=new int[]{5};
        Actual actual=new Actual();
        actual.actual(a);
        System.out.println(a[0]);
    }
}