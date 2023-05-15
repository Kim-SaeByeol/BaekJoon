package Array;

import java.util.Scanner;

//과제 안 내신 분?
public class BJ_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int std[] = new int[28];
        int number[] = new int[30];

        for (int i = 0; i < number.length; i++)
            number[i] = i + 1;

        System.out.println("오늘 수업은 30명이군요.");
        System.out.println("출석 부르겠습니다.");


        //출석번호 입력.
        int num;
        for (int i = 0; i <= std.length; i++) {
            num = sc.nextInt();
            if (1 <= num && num <= 30) {
                std[i] = num;
            } else {
                System.out.println("그 번호 학생은 없는데요? 다시 말해주시겠어요?");
                --i;
            }
            if (i != 0)
                for (int j = 1; j < std.length; j++)
                    if (std[i] == std[j]) {
                        System.out.println("학생번호가 중복되었습니다. 다시 입력해주세요.");
                        --i;
                    }
            System.out.println("<총 출석자 " + (i + 1) + "명>");
        }


        int q = 0, w = 0;
        System.out.print("안온 학생은 ");
        for (int i = 0; i < std.length; i++)
            for (int j = 1; j <= number.length; j++) {
                if (std[i] == j) {
                    number[j - 1] = 0;
                    if (number[i] != 0)
                        if (q == 0) {
                            number[i] = q;
                        } else {
                            number[i] = w;
                        }
                }
            }
        if (q > w)
            System.out.println(q + "번, " + w + "번");
        if (w > q)
            System.out.println(w + "번, " + q + "번");
    }
}