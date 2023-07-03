package Conditional_Mood;

import java.util.Scanner;

public class BJ_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour;
        int minute;

        for(; ;){
            hour = sc.nextInt();
            minute = sc.nextInt();

            if(0 <= hour && hour <= 23 && 0 <= minute && minute <= 59)
                break;
            else
                System.out.println("다시 입력하세요.");
        }

        int countMinute = sc.nextInt();

        minute = minute + countMinute;

        for(; ;) {
            if (minute >= 60) {
                hour++;
                minute = minute - 60;
                if (hour == 24)
                    hour = 0;
            } else
                break;
        }
        System.out.println(hour + " " + minute);

        sc.close();
    }
}
