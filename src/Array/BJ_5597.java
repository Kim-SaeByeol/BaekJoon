package Array;

import java.util.Scanner;

//과제 안 내신 분..?
/*
X대학 M교수님은 프로그래밍 수업을 맡고 있다. 교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.

교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.
 */
public class BJ_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //boolean이 0, -0, null, false, NaN, undefined, 빈문자열 ("") 이라면 false.
        //boolean 의 초기값으로 아무것도 설정하지 않으면 false 라는 뜻이다.

        //학생 수는 30명.
        //입력을 1~30 으로 받을 것이기에 배열 31칸을 생성하였다.
        boolean std[] = new boolean[31];

        //교수님이 내준 특별과제를 28명이 제출
        for (int i = 0; i < 28; i++) {
            int num = sc.nextInt();
            //입력값 크기 지정.
            if(0 < num && num < 31) {
                if (std[num] == true) {
                    System.out.println("중복입니다. 다시 입력해주세요.");
                    --i;
                }
                //낸 사람은 O 표시. (true 리턴)
                //sum 값은 1 ~ 30이므로 인덱스 값으로 num 을 주어 O, X 체크를 한 것이다.
                std[num] = true;
                System.out.println("<" + (i + 1) + "번 부름>");
            } else {
                System.out.println("그 번호의 학생은 없습니다.");
                --i;
            }
        }
        //안 낸 사람은 true가 아니므로 x 표시. (false 리턴)
        //i는 1~30 을 나타내야하기에 시작값 1 부터 끝 값 std.length() = 31.
        for (int i = 1; i < std.length; i++) {
            if (std[i] == false) {
                //불리지 않은 사람의 출석번호 출력
                System.out.println(i);
            }
        }

    }
}
