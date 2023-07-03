package Conditional_Mood;

import java.util.Scanner;

public class BJ_14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xSide = sc.nextInt();
        int ySide = sc.nextInt();
        int Quadrant = 0;
        if(xSide > 0 && ySide > 0){
            Quadrant  = 1;
        } else if (xSide < 0 && ySide > 0 ) {
            Quadrant  = 2;
        } else if (xSide < 0 && ySide < 0) {
            Quadrant = 3;
        } else if (xSide > 0 && ySide < 0) {
            Quadrant = 4;
        } else if(xSide == 0 && ySide == 0){
            System.out.println("원점 입니다.");
        }
        if(Quadrant == 0) {
            System.out.println("입력을 잘못 하셨습니다.");
        }else
        System.out.println(Quadrant);
        sc.close();
    }
}
