package string;

import java.util.Scanner;

public class bj_2675 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        int T = SC.nextInt();
        for (int i = 0; i < T; i++) {

            int R = SC.nextInt();
            String S = SC.next();    // nextLine() 을 쓰면 error!

            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {    // R 만큼 반복 출력
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
