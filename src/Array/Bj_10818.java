package Array;

import java.util.Scanner;

//최소, 최대
public class Bj_10818 {
    public static void main(String[] args) {
        int n, m, max  = 0, min = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int Array[] = new int[n];

        for(int i = 0; i < Array.length; i++){
            m = sc.nextInt();
            Array[i] = m;
            if(Array[i] > max)
                max = Array[i];
                //max = 20 max =

             //min 은 0이 되면 안됨. 조건 자체가 성립 x
            if(i == 0)
                min = Array[0];
            if(Array[i] < min)
                min = Array[i];
        }
        System.out.printf("%d %d", min, max);
    }
}
