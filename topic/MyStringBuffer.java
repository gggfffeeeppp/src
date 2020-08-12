/**
 * FileName: MyStringBuffer
 * Author:   蔡志勇
 * Date:     2020/7/15 22:22
 * Description:
 * History:
 */

package topic;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 * @author 蔡志勇
 * @date 2020/7/15
 * @version 1.0.0
 */
import reduceandgerge.IStringBuffer;

import java.util.ArrayList;

public class MyStringBuffer implements IStringBuffer {
    ArrayList value;
    public MyStringBuffer()
    {
        value=new ArrayList();
    }
    public MyStringBuffer(String str)
    {
        this();
        if(str==null)
            return;
        char[]cs = str.toCharArray();
        for(int i =0 ; i<cs.length;i++)
        {
            value.add(cs[i]);
        }
    }

    @Override
    public void append(String str) {
        insert(value.size(),str);
    }

    @Override
    public void append(char c) {
        append(String.valueOf(c));
    }

    @Override
    public void insert(int pos, char b) {
        insert(pos,String.valueOf(b));
    }

    @Override
    public void delete(int start) {
        delete(start,value.size());
    }

    @Override
    public void delete(int start, int end) {

        if(start<0)
            return;
        if(start>value.size())
            return;
        if(end<0)
            return;
        if(end>value.size())
            return;
        if(start>=end)
            return;
        for(int i=0; i <end -start;i++)
        {
            value.remove(start);//应该是这个逻辑在start这个位置删除end-start次，完美删除
        }
    }


    @Override
    public void reverse() {

        for(int i=0;i<value.size()/2;i++)
        {
            int length=value.size();
            char temp = (char)value.get(i);
            value.set(i,value.get(length-i-1));
            value.set(length-i-1,temp);
        }

    }

    @Override
    public int length() {
        return value.size();
    }

    @Override
    public void insert(int pos, String b) {

        if(pos<0)
            return;
        if(pos>value.size())
            return;
        if(b==null)
            return;
        char[]cs = b.toCharArray();
        for(int i =0 ; i < cs.length;i++)
        {
            value.add(pos+i,cs[i]);
        }
    }
    public String toString()
    {
        char[] charValue = new char[value.size()];
        for(int i=0;i<value.size();i++)
        {
            charValue[i]=(char)value.get(i);
        }
        return new String(charValue);
    }

    public static void main(String[] args) {
        MyStringBuffer sb = new MyStringBuffer("there light");
        System.out.println(sb);
        sb.insert(0,"let ");
        System.out.println(sb);
        sb.insert(10,"be ");
        System.out.println(sb);
        sb.insert(0,"God Say:");
        System.out.println(sb);
        sb.append("!");
        sb.append("?");
        System.out.println(sb);

        sb.delete(0,4);
        System.out.println(sb);
        sb.delete(4);
        System.out.println(sb);
    }
}