/**
 * FileName: RandomDate
 * Author:   蔡志勇
 * Date:     2020/6/24 18:50
 * Description: 随机日期
 * History:
 */

import com.sun.tools.javac.Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/**
 * 〈一句话功能简述〉<br>
 * 〈随机日期〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/6/24
 */
public class RandomDate {
    public static void main(String[] args) throws ParseException {
        String dateStart = "1970/1/1 00:00:00";
        String dateEnd = "1999-12-31 23:59:59";
        SimpleDateFormat dateStartMillis = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        SimpleDateFormat dateEndMillis = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        long startTime = dateStartMillis.parse(dateStart).getTime();
        long endTime = dateEndMillis.parse(dateEnd).getTime();
        long deviationTime = endTime - startTime;

        Date randomDate1;
        Date randomDate2;
        String calendar;
        int temp1;
        Date temp2;
        String temp3;
        Date realCalendar;
        // Date muchTime = 14:00:00;
        int[] hours = new int[9];
        int[] minutes = new int[9];
        int[] seconds = new int[9];
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 规定日期格式
        Date[] newDate1 = new Date[9];
        String[] newDate2 = new String[9];
        for (int i = 0; i < newDate1.length; i++) {
            long randomDate = (long) (Math.random() * deviationTime);
            randomDate1 = new Date(randomDate + startTime);
            randomDate2 = new Date(randomDate + startTime - (60 * 60 * 1000 * 14));
            newDate1[i] = randomDate1;

            calendar = formatter.format(Date.parse(String.valueOf(randomDate2)));
            newDate2[i] = calendar;

            System.out.println(newDate1[i]);
            System.out.println(calendar);

            int hour = newDate1[i].getHours();
            hours[i] = hour;
            System.out.println(hours[i]);
            int minute = newDate1[i].getMinutes();
            minutes[i] = minute;
            int second = newDate1[i].getSeconds();
            seconds[i] = second;
        }

        for (int j = 0; j < newDate1.length - 1; j++) {
            for (int k = j + 1; k < newDate1.length; k++) {
                if (hours[j] == hours[k]) {
                    if (minutes[j] > minutes[k]) {
                        temp1 = hours[j];
                        hours[j] = hours[k];
                        hours[k] = temp1;
                        temp1 = minutes[j];
                        minutes[j] = minutes[k];
                        minutes[k] = temp1;
                        temp1 = seconds[j];
                        seconds[j] = seconds[k];
                        seconds[k] = temp1;
                        temp2 = newDate1[j];
                        newDate1[j] = newDate1[k];
                        newDate1[k] = temp2;
                        temp3 = newDate2[j];
                        newDate2[j] = newDate2[k];
                        newDate2[k] = temp3;
                    }
                }

                if (hours[j] == hours[k]) {
                    if (minutes[j] == minutes[k]) {
                        if (seconds[j] > seconds[k]) {
                            temp1 = hours[j];
                            hours[j] = hours[k];
                            hours[k] = temp1;
                            temp1 = minutes[j];
                            minutes[j] = minutes[k];
                            minutes[k] = temp1;
                            temp1 = seconds[j];
                            seconds[j] = seconds[k];
                            seconds[k] = temp1;
                            temp2 = newDate1[j];
                            newDate1[j] = newDate1[k];
                            newDate1[k] = temp2;
                            temp3 = newDate2[j];
                            newDate2[j] = newDate2[k];
                            newDate2[k] = temp3;
                        }
                    }
                }

                if (hours[j] > hours[k]) {
                    temp1 = hours[j];
                    hours[j] = hours[k];
                    hours[k] = temp1;
                    temp1 = minutes[j];
                    minutes[j] = minutes[k];
                    minutes[k] = temp1;
                    temp1 = seconds[j];
                    seconds[j] = seconds[k];
                    seconds[k] = temp1;
                    temp2 = newDate1[j];
                    newDate1[j] = newDate1[k];
                    newDate1[k] = temp2;
                    temp3 = newDate2[j];
                    newDate2[j] = newDate2[k];
                    newDate2[k] = temp3;
                }
            }
        }
        for (int i =0; i <hours.length;i++){
            // System.out.print(toString(hours[i] +"\t"));
            // System.out.print(toString(newDate1[i] + "\t"));
            System.out.print(toString(newDate2[i] + "\t\t"));
            if (2 == i % 3){
                System.out.println();
            }
        }

//         var dateStr=time.trim().split(" ");
//         var strGMT = dateStr[0]+" "+dateStr[1]+" "+dateStr[2]+" "+dateStr[5]+" "+dateStr[3]+" GMT+0800";
//         var date = new Date(Date.parse(strGMT));
//         var year = date.getFullYear();  //获取年
//         var month = date.getMonth() + 1;    //获取月
//         var day = date.getDate(); //获取日
//         var hours = date.getHours();
//         var minutes = date.getMinutes();
//         var sec = date.getSeconds();
//         console.log(year + ":" + month + ":" + day + ":" + hours + ":" + minutes + ":" + sec)
//   }
    }

    private static String toString(String s) {
        return s;
    }
}

