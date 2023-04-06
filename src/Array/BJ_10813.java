package Array;

import java.util.Scanner;

// 배열 - 공 바꾸기

/*
배열 갯수 => N	=> 인덱스 0 ~ N-1 까지 1 ~ N가 들어있음.
반복 횟수 => M
FOR 안에서 => 바구니 2개를 선택함 ( 스캐너 2개) => 선택된 바구니의 공을 서로 바꿈.
 */
public class BJ_10813 {
    public static void main(String[] args) {
        int Array[];
        Scanner sc = new Scanner(System.in);
        //배열 갯수 => N
        int N = sc.nextInt();
        Array = new int[N];

        //인덱스 0 ~ N-1 까지 1 ~ N가 들어있음
        for(int i = 0; i <= Array.length-1; i++)
            Array[i] = i+1;

        //반복 횟수 M
        int M = sc.nextInt();
        int n;
        for (int i =0; i < M; i++){
            //바구니 2개 선택.
            int a = sc.nextInt();
            int b = sc.nextInt();
            // a - b 변수 교환. 변수 3개를 준비하고 c = a, a = b, b = c.
            // [0] 부터 1이므로, 1 = [1 -1].
            n = Array[a-1];
            Array[a-1] = Array[b-1];
            Array[b-1] = n;
        }
            //출력
        for (int i = 0; i< Array.length; i++)
            System.out.printf("%d ",Array[i]);
    }
}
