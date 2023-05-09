package Array;

import java.util.Scanner;

public class BJ_100809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s[] = new char[26];
        char en = 'a';
        //소문자로만 이루어진 배열 s
        for (int i = 0; i < 26; i++) {
            s[i] = en;
            en++;
        }
        String st = sc.next();
        char[] charArray = st.toCharArray();

        for(int i = 0; i<s.length; i++){
            boolean bool = false;
            for(int j = 0; j < charArray.length; j++){
                if(s[i] == charArray[j]){
                    System.out.print(j + " ");
                    bool = true;
                    break;
                }
            }
            if(bool == false)
            System.out.print("-1" + " ");
        }
    }
}

