package loop;

import java.util.Scanner;

public class BJ_10950 {
    public static void sum(int A, int B){
            System.out.println(A + B);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, a, b;

        size = sc.nextInt();

        for(int i = 0; i < size; i++){
            a = sc.nextInt();
            b = sc.nextInt();

            sum(a, b);

        }

        sc.close();
    }
}
