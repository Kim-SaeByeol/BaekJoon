package input_output;

import java.util.Scanner;

public class BJ_18108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        //불기 원년(1년)은 서기전 544년이므로, 서기를 불기로 변환할 때는 543를 더하면 된다.

        System.out.println(year - 543);
    }
}
