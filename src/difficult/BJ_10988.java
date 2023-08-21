package difficult;

import java.util.Scanner;

public class BJ_10988 {

    static void palindrome(String str) {
        int length = str.length();

        for(int i=0; i<length/2; i++)	{
            char front = str.charAt(i);
            char back = str.charAt( (length-1)-i );

            if(front != back) {
                System.out.println(0);
                return;
            }
        }

        System.out.println(1);

    } // End of palindrome

        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);

            String str = sc.nextLine();

            palindrome(str);

        } // End of main
    } // End of class

