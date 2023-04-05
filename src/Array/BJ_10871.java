package Array;

import java.util.Scanner;

//X보다 작은 수
public class BJ_10871 {
    public static void main(String[] args) {
        int X, a;
        Scanner sc = new Scanner(System.in);
        int Array[];
        a = sc.nextInt();
        Array = new int[a];

        // X 보다 작은 수 구하는 것. X 입력값을 미리 받음.
        X = sc.nextInt();

        int b;
        for(int i = 0; i < Array.length; i++){
            b = sc.nextInt();
            Array[i] = b;
            if(Array[i] < X)
                System.out.printf("%d ", Array[i]);
        }

    }
}
