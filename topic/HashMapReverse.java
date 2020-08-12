/**
 * FileName: HashMapReverse
 * Author:   蔡志勇
 * Date:     2020/7/28 7:08
 * Description:
 * History:
 */

package topic;

import java.util.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 * @author 蔡志勇
 * @date 2020/7/28
 * @version 1.0.0
 *
 * 使用如下键值对，初始化一个HashMap：
 * adc - 物理英雄
 * apc - 魔法英雄
 * t - 坦克
 *
 * 对这个HashMap进行反转，key变成value,value变成key
 * 提示： keySet()可以获取所有的key, values()可以获取所有的value
 */


public class HashMapReverse {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("adc","物理英雄");
        map.put("apc", "魔法英雄");
        map.put("t" , "坦克");
        HashMap<String,String> map1 = new HashMap<>();
        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry entry=(Map.Entry) iterator.next();
            map1.put((String)entry.getValue(),(String)entry.getKey());
        }
        for (String k:map1.keySet())
            System.out.println(map1.get(k));
    }
}