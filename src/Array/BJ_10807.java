package Array;

import java.util.Scanner;

//배열문제 - 개수 세기
public class BJ_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        int Array[] = new int[a];


        for (int i = 0; i < Array.length; i++){
            b = sc.nextInt();
            Array[i] = b;
        }
        int c;
        c = sc.nextInt();
        int e = 0;

        for (int i = 0; i < Array.length; i++) {
            if (c == Array[i]) {
                e++;
            }
        }
        System.out.print(e);
    }
}
