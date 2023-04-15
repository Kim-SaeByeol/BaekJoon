package Array;

import java.util.Scanner;
/*
백준 - 나머지
두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다.
예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다.
그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

<1> 배열의 갯수는 10개 ==> 수 10개를 입력 받은 뒤
<2> 배열 칸 마다 입력값을 받는다. ==> 수 10개를 입력 받은 뒤
<3> 입력값을 받은 후 42로 나눈 나머지를 구한다. ==> 이를 42로 나눈 나머지를 구한다.
<4> 서로 같은지 비교를 한다.(중복 비교) ==> 그 다음 서로 다른 값이 몇 개 있는지
<5> 중복이 있다면 그 값을 뺀다. ==> 그 다음 서로 다른 값이 몇 개 있는지
<6> 서로 다른 값이 몇개 있는지 출력한다. ==> 그 다음 서로 다른 값이 몇 개 있는지 출력
 */
public class BJ_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //<1> 배열은 10개.
        int arr[] = new int[10];

        //<2> 배열 칸 마다 입력값을 줌.
        for(int i = 0; i < arr.length; i++){
            int num = sc.nextInt();

            // <3> 42로 나눈 나머지를 구함.
            arr[i] = num%42;
        }

        //<5> 카운트는 배열의 수.
        int count = arr.length;

        //<4> 중복 확인.
        for (int i = 0; i < arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    //<5> 중복이 있다면 배열의 길이에서 1개를 낮춘다.
                    count --;
                    //중복을 찾았다면 더 반복할 필요가 없으므로 break.
                    break;
                }
            }
        }
        //<6> 출력한다.
        System.out.println(count);
    }
}
