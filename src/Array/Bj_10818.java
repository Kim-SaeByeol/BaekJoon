package Array;

import java.util.Scanner;

//최소, 최대
public class Bj_10818 {
    public static void main(String[] args) {
        int n, m, max = 0, min = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // 스캐너 입력값  n 만큼 배열의 크기가 지정됨.
        int Array[] = new int[n];

        //생성된 배열에 배열크기 만큼 입력값을 차례로 저장함.
        for(int i = 0; i < Array.length; i++){
            m = sc.nextInt();
            Array[i] = m;


            //min 은 0이 되면 안됨. 조건 자체가 성립 x
            if(i == 0) {
                min = Array[0];
                max = Array[0];
            }
            //최대 값을 구함
            if(Array[i] > max) {
                max = Array[i];
            }
            //최소 값을 구함
            if(Array[i] < min)
                min = Array[i];
        }
        System.out.printf("%d %d", min, max);
    }
}
