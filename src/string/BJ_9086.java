package string;

import java.util.Scanner;

public class BJ_9086 {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    String[] arr = new String[T];

		for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.next();
    }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() < 1) {
                System.out.println(arr[i] + "" + arr[i]);
            } else {
                System.out.print(arr[i].substring(0, 1));
                System.out.println((arr[i].substring(arr[i].length() - 1, arr[i].length())));
            }

        }
        sc.close();
    }
}
