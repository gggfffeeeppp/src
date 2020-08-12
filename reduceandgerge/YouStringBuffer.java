/**
 * FileName: YouStringBuffer
 * Author:   蔡志勇
 * Date:     2020/7/2 16:40
 * Description:
 * History:
 */

package reduceandgerge;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/2
 */
public class YouStringBuffer implements IStringBuffer {
    int capacity = 16;
    int length = 0;
    char[] value;

    public YouStringBuffer() {
        value = new char[capacity];
    }

    public YouStringBuffer(String str) {
        this();
        if (null == str) {
            return;
        }
        if (capacity < str.length())
            capacity = value.length * 2;
        value = new char[capacity];
        if (capacity >= str.length()) ;
        System.arraycopy(str.toCharArray(), 0, value, 0, str.length());

        length = str.length();
    }

    @Override
    public void append(String str) throws IndexIsNegativeException, IndexIsOutofRangeException {
        insert(length, str);

    }

    @Override
    public void append(char c) throws IndexIsNegativeException, IndexIsOutofRangeException {
        append(String.valueOf(c));
    }

    @Override
    public void insert(int pos, char b) throws IndexIsNegativeException, IndexIsOutofRangeException {
        insert(pos, String.valueOf(b));
    }

    @Override
    public void insert(int pos, String b) throws IndexIsNegativeException,IndexIsOutofRangeException{
        if (pos < 0) {
            throw new IndexIsNegativeException("不能为负");
        }

        if (pos > length) {
            throw new IndexIsOutofRangeException("下标超出范围");
        }

        if (null == b) {
            return;
        }

        while (length + b.length() > capacity) {
            capacity = (int) (length + b.length() * 1.5f);
            char[] newValue = new char[capacity];
            System.arraycopy(value, 0, newValue, 0, length);
            value = newValue;
        }
        char[] ch = b.toCharArray();
        System.arraycopy(value, pos, value, pos + ch.length, length - pos);
        System.arraycopy(ch, 0, value, pos, ch.length);
        length = length + ch.length;
    }

    public class IndexIsNegativeException extends Exception {
        public IndexIsNegativeException() {

        }
        public IndexIsNegativeException (String msg) {
            super(msg);
        }
    }
    public class IndexIsOutofRangeException extends Exception {
        public IndexIsOutofRangeException() {

        }
        public IndexIsOutofRangeException (String msg) {
            super(msg);
        }
    }

    @Override
    public void delete(int start) throws IndexIsNegativeException, IndexIsOutofRangeException{
        delete(start,length);
    }

    @Override
    public void delete(int start, int end) throws IndexIsNegativeException, IndexIsOutofRangeException{
        if (start < 0) {
            throw new IndexIsNegativeException("下标不能为负");
        }
        if (start > length) {
            throw new IndexIsOutofRangeException("下标超出范围");
        }
        if (end <= start) {
            throw new IndexIsOutofRangeException("下标超出范围");
        }
        if (end < 0) {
            throw new IndexIsNegativeException("下标不能为负");
        }
        if (end > length) {
            throw new IndexIsOutofRangeException("下标超出范围");
        }
        System.arraycopy(value, end, value, start, length - end);
        length -= end - start;
    }

    @Override
    public void reverse() {
        for (int i = 0; i < length / 2; i++) {
            char temp = value[i];
            value[i] = value[length - i - 1];
            value[length - i - 1] = temp;
        }
    }

    @Override
    public int length() {
        return length;
    }

    public String toString() {
        char[] realValue = new char[length];

        System.arraycopy(value, 0, realValue, 0, length);

        return new String(realValue);
    }

    public static void main(String[] args) throws IndexIsNegativeException, IndexIsOutofRangeException {
        long startTime = new Date().getTime();
        YouStringBuffer ysb = new YouStringBuffer();
        for (int i = 0; i <100000; i++) {
            ysb.append(GetRandom.getRandomString(10));
        }
        long endTime = new Date().getTime();
        long useTime = endTime - startTime;
        System.out.println(useTime);
    }
}
