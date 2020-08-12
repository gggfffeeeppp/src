/**
 * FileName: Car
 * Author:   蔡志勇
 * Date:     2020/5/31 12:48
 * Description: 引用类型
 * History:
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈引用类型〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/5/31
 */

class Vehicle {
}

public class Car extends Vehicle {
    public static void main(String[] args) {
        Car c1 = new Car();

        Vehicle v2 = new Car();    // v2 是 Car 类型
        Vehicle v3 = new Vehicle();

        //Car 是 Vehicle类型, Vehicle 不是 Car 类型
        boolean result1 = c1 instanceof Vehicle;    // true
        boolean result2 = v2 instanceof Car;        // true
        boolean result3 = v2 instanceof Vehicle;    // true
        boolean result4 = v3 instanceof Car;          // false

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}

