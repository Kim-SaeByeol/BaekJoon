package loop;

import java.util.Scanner;

public class BJ_8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int sum = 0;
        for(int i = 0; i <= size; i++){
            sum = sum + i;
        }
        System.out.println(sum);
        sc.close();
    }
}
