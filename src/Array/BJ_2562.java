package Array;

import java.util.Scanner;

// 배열문제 - 최댓값
public class BJ_2562 {
    public static void main(String[] args) {
        int a, max = 0, maxNumber = 0;
        int Array[] = new int[9];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < Array.length; i++) {
            a = sc.nextInt();
            Array[i] = a;

            //max 라서 필요 없지만
            if (i == 0) {
                max = Array[i];
            }
            if (Array[i] > max) {
                max = Array[i];
                maxNumber = i + 1;
            }
        }
        System.out.printf("%d\n", max);
        System.out.printf("%d", maxNumber);
    }
}
