package loop;

import java.util.Scanner;

public class BJ_2739 {

    public static void gugu(int a){
        for(int i = 1; i < 10; i++){
            System.out.println(a + " * " + i + " = " + a*i );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        gugu(num);

        sc.close();
    }
}
