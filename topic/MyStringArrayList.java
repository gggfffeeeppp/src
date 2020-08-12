/**
 * FileName: MyStringArrayList
 * Author:   蔡志勇
 * Date:     2020/7/15 17:40
 * Description:
 * History:
 */

package topic;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/15
 */
public class MyStringArrayList {
    public static void main(String[] args) {
        MyStringArrayList msal =new MyStringArrayList("abcdefg");
        msal.append("hijk");
        msal.insert(5,'1');
        msal.insert(7,"234");
        System.out.println(msal.length());
        msal.delete(10);
        // msal.delete(5,6);
        // msal.delete(5);
        // msal.delete(5,7);
        System.out.println(msal.length());
        System.out.println(msal.toString());
    }
    ArrayList value;

    MyStringArrayList() {
        value = new ArrayList();
    }

    MyStringArrayList(String str) {
        this();
        if (null == str) {
            return;
        }
        char[] ch = str.toCharArray();
        int i = 0;
        for (; i < str.length(); i++) { // length() 7
            // System.out.println(i); // 0-6
            value.add(String.valueOf(ch[i]));
        }
        // System.out.println(i);// i = 7
    }


    public void append(String str) {
        // string = string + str;
        // System.out.println(string);
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++)
            value.add(ch[i]);
    }


    public void append(char c) {
        // string = string + c;
        // System.out.println(string);
        value.add(String.valueOf(c));
    }

    public void insert(int pos, char c) {
        if (pos < 0) {
            return;
        }
        if (pos > value.size()) {
            return;
        }
        value.add(pos, String.valueOf(c));
    }


    public void insert(int pos, String str) {
        if (pos < 0) {
            return;
        }
        if (pos > value.size()) {
            return;
        }

        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            value.add(pos + i, String.valueOf(ch[i]));
        }
    }


    public void delete(int start) {
        delete(start,value.size());
        // if (start < 0)
        //     return;
        // if (start > value.size())
        //     return;
        // for (int i = 0; i < value.size() - start; i++) {
        //     value.remove(start);
        // }
    }


    public void delete(int start, int end) {
        if (start < 0)
            return;
        if (end < 0)
            return;
        if (start >=end)
            return;
        if (start > value.size())
            return;
        if (end > value.size())
            return;
        for (int i = 0; i < end - start; i++) {
            value.remove(start);
        }
    }

    public void reverse() {
        for (int i = 0; i < value.size() / 2; i++) {
            String s = (String) value.get(i);
            String temp = s;
            String lasts = (String) value.get(value.size() - (i + 1));
            s = lasts;
            lasts = temp;
        }
    }

    public int length() {

        return value.size();
    }

    public String toString(){

        String s = "";
        for (int i =0; i < value.size(); i++) {
            s += value.get(i);
        }
        return s;
    }
}
