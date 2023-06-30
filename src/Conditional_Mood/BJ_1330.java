package Conditional_Mood;

import java.util.Scanner;

public class BJ_1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        String str = (A>B) ? ">" : ((A<B) ? "<" : "==" );
        System.out.println(str);

        sc.close();
    }
}
