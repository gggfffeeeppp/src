/**
 * FileName: RandomTwoCharSet
 * Author:   蔡志勇
 * Date:     2020/7/24 21:01
 * Description:
 * History:
 */

package topic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/24
 */
public class RandomTwoCharSet {
    public static void main(String[] args) {
        String[] str = new String[10000];
        char[] ch = new char[2];
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < 2; j++) {
                char a = (char) (Math.random() * (123 - 48) + 48);
                if (Character.isLetter(a) || Character.isDigit(a))
                    ch[j] = a;
            }
            str[i] = String.valueOf(ch);
        }
        System.out.println(Arrays.toString(str));

        HashSet<String> repetition = new HashSet<>();
        HashSet<String> noRepetition = new HashSet<>();
        for (String s : str){
            if (noRepetition.contains(s))
                repetition.add(s);
            else
                noRepetition.add(s);
        }
        repetition.remove(null);
        noRepetition.remove(null);
        System.out.println(repetition.size());
        System.out.println(repetition);
        System.out.println(noRepetition);
        System.out.println(noRepetition.size());
    }
    Comparator<Hero> c = new Comparator<Hero>() {
        @Override
        public int compare(Hero h1, Hero h2) {
            //按照hp进行排序
            if(h1.hp>=h2.hp)
                return 1;  //正数表示h1比h2要大
            else
                return -1;
        }
    };
    Comparator<Hero> c1 = (Hero h1, Hero h2) ->{
            //按照hp进行排序
            if(h1.hp>=h2.hp)
                return 1;  //正数表示h1比h2要大
            else
                return -1;

    };






}