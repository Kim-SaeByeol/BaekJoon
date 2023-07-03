package Conditional_Mood;

import java.util.Scanner;

public class BJ_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour;
        int minute;
        
        int timerHour;
        int timerMinute;
        
        for(; ; ){
            hour = sc.nextInt();
            minute = sc.nextInt();

            if(0 <= hour && hour <= 23 && 0 <= minute && minute <= 59)
                break;
            else
                System.out.println("다시 입력하세요.");
        }
        timerHour = hour;
        timerMinute = minute - 45;
        if (timerMinute < 0){
            timerHour--;
            timerMinute = 60 + timerMinute;
        } else if (timerMinute >= 0) {
            timerHour = hour;
        }

        // Hour이 0 이고, Minute 가 음수일 때 -1이 되지 않도록 조정.
        if(timerHour == -1)
            timerHour = 23;

        System.out.println(timerHour + " " + timerMinute);

        sc.close();
    }
}
