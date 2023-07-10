package loop;

import java.util.Scanner;

public class BJ_10952 {
    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);

        for(; ;){

            int A = sc.nextInt();
            int B = sc.nextInt();

            if(A==0 && B==0){
                sc.close();
                break;
            }
            System.out.println(A+B);
        }
        sc.close();
    }
}
