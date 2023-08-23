package difficult;

import java.util.Scanner;

public class BJ_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26]; // a~z 까지의 갯수는 26개
        String str = sc.next();

        for (int i = 0; i < str.length(); i++){

            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') { // 대문자 범위
                arr[str.charAt(i) - 'A']++;	// 해당 인덱스의 값 1 증가
            }

            else {	// 소문자 범위
                arr[str.charAt(i) - 'a']++;
            }
        }


        int num = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > num) {
                num = arr[i];   //
                ch = (char) (i + 65); // 아스키코드 대문자는 66부터 시작하기에 65를 더해줌.
            }
            else if (arr[i] == num) {
                ch = '?';
            }
        }

        System.out.print(ch);
    }
}
