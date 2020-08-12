/**
 * FileName: HashSet50
 * Author:   蔡志勇
 * Date:     2020/7/28 1:56
 * Description:
 * History:
 */

package topic;

import com.sun.tools.javac.Main;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 * @author 蔡志勇
 * @date 2020/7/28
 * @version 1.0.0
 */
public class HashSet50 {
    public static void main(String[] args) {
        HashSet<Integer> set1= new HashSet<>();
        HashSet<Integer> set2= new HashSet<>();
        Random r = new Random();
        for (int i=0;i<100;i++){
            set1.add(r.nextInt(10000));
        }
        Integer[] integer = new Integer[50];

        Integer[] integers = set1.toArray(integer);
        System.out.println(Arrays.toString(integers) + "\n" + integers.length);
        integer = Arrays.copyOf(integers,50);
        System.out.println(Arrays.toString(integer));



    }
}