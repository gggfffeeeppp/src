/**
 * FileName: MyStringBuffer
 * Author:   蔡志勇
 * Date:     2020/7/1 15:37
 * Description: MyStringBuffer
 * History:
 */

package reduceandgerge;

import java.lang.reflect.Array;

/**
 * 〈一句话功能简述〉<br>
 * 〈MyStringBuffer〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/1
 */

public class MyStringBuffer implements IStringBuffer {
    String string = "abcdefgh";

    // int capacity = 16;
    // int length = 0;
    // char[] value;
    //
    // public MyStringBuffer() {
    //     value = new char[capacity];
    // }
    //
    // public MyStringBuffer(String str) {
    //     this();
    //     if (null == str) {
    //         return;
    //     }
    //     if (capacity < str.length())
    //         capacity = value.length * 2;
    //     value = new char[capacity];
    //     if (capacity >= str.length()) ;
    //     System.arraycopy(str.toCharArray(), 0, value, 0, str.length());
    //
    //     length = str.length();
    // }

    @Override
    public void append(String str) {
        string = string + str;
        // System.out.println(string);
    }

    @Override
    public void append(char c) {
        string = string + c;
        // System.out.println(string);
    }

    @Override
    public void insert(int pos, char b) {
        char[] ch = string.toCharArray();
        String str1 = String.copyValueOf(ch, 0, pos);
        String str3 = String.copyValueOf(ch, pos, ch.length - pos);
        char[] c = new char[1];
        c[0] = b;
        String str2 = String.copyValueOf(c, 0, 1);
        string = str1 + str2 + str3;
        System.out.println(string);
    }

    @Override
    public void insert(int pos, String b) {
        char[] ch = string.toCharArray();
        String str1 = String.copyValueOf(ch, 0, pos);
        String str3 = String.copyValueOf(ch, pos, ch.length - pos);
        // char[] c = new char[b.length()];
        char[] c = b.toCharArray();
        String str2 = String.copyValueOf(c, 0, c.length);
        string = str1 + str2 + str3;
        System.out.println(string);
    }

    @Override
    public void delete(int start) {
        char[] ch = string.toCharArray();
        String str1 = String.copyValueOf(ch, 0, start);
        string = str1;
        System.out.println(string);
    }

    @Override
    public void delete(int start, int end) {
        char[] ch = string.toCharArray();
        String str1 = String.copyValueOf(ch, 0, start);
        String str2 = String.copyValueOf(ch, end, ch.length - end);
        string = str1 + str2;
        System.out.println(string);
    }

    @Override
    public void reverse() {
        char[] ch = string.toCharArray();
        for (int j = 0; j < ch.length / 2; j++) {
            char temp = ch[j];
            ch[j] = ch[ch.length - (j + 1)];
            ch[ch.length - (j + 1)] = temp;
        }
        string = String.valueOf(ch);
        System.out.println(string);
    }

    @Override
    public int length() {
        char[] ch = string.toCharArray();
        System.out.println(ch.length);
        return ch.length;
    }

    public static void main(String[] args) {
        MyStringBuffer str = new MyStringBuffer();
        str.append("dd");
        str.append('e');
        // System.out.println(str);
        str.insert(0, '0');
        str.insert(1, "111");
        // System.out.println(str);
        str.delete(10);
        str.delete(0, 3);
        str.reverse();
        str.length();
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str.append(GetRandom.getRandomString(10));
        }
        long endTime1 = System.currentTimeMillis();
        long useTime1 = endTime1 - startTime1;
        System.out.println(useTime1);

        StringBuffer sb = new StringBuffer();
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            sb.append(GetRandom.getRandomString(10));
        }
        long endTime2 = System.currentTimeMillis();
        long useTime2 = endTime2 - startTime2;
        System.out.println(useTime2);

        String strings = "";
        long startTime3= System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            strings += GetRandom.getRandomString(10);
        }
        long endTime3 = System.currentTimeMillis();
        long useTime3 = endTime3 - startTime3;
        System.out.println(useTime3);

        StringBuilder sbd = new StringBuilder();
        long startTime4 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            sbd.append(GetRandom.getRandomString(10));
        }
        long endTime4= System.currentTimeMillis();
        long useTime4 = endTime4 - startTime4;
        System.out.println(useTime4);

    }
}