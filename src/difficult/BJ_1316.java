package difficult;

import java.util.Scanner;

public class BJ_1316 {

    public static boolean check() {
        Scanner sc = new Scanner(System.in);
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = sc.next();

        for(int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);	// 현재 문자 저장


            // 앞선 문자와 i 번째 문자가 같지 않다면?
            if (prev != now) {

                // 해당 문자가 처음 나오는 경우 (false 인 경우)
                if ( check[now - 'a'] == false ) {
                    check[now - 'a'] = true;
                    prev = now;
                }

                // 해당 문자가 이미 나온 적이 있는 경우
                else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            if (check() == true) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}