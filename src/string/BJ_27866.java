package string;

import java.util.Scanner;

public class BJ_27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int num = sc.nextInt();

        System.out.println(st.charAt(num-1));

        sc.close();


    }
}
