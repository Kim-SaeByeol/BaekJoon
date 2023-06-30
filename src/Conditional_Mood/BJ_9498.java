package Conditional_Mood;

import java.util.Scanner;

public class BJ_9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        System.out.print((A>=90)?"A": (A>=80)? "B": (A>=70)? "C": (A>=60)? "D": "F");
        sc.close();
    }
}
