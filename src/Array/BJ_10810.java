package Array;

import java.util.Scanner;

// 배열 - 공 넣기
public class BJ_10810 {
    public static void main(String[] args) {
        int Array[];
        int a, b, n, m, l;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        Array = new int[a];
        b = sc.nextInt();
        for (int i = 0; i < b; i++) {
            n = sc.nextInt();
            m = sc.nextInt();
            l = sc.nextInt();
            for (int j = n; j <= m; j++)
                Array[j - 1] = l;
        }
        for (int i = 0; i < Array.length; i++)
        System.out.printf("%d ",Array[i]);

    }
}
