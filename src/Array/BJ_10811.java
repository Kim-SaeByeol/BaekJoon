package Array;

import java.util.Scanner;

/*
백준 - 바구니 뒤집기
도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 순서대로 적혀져 있다.
바구니는 일렬로 놓여져 있고, 가장 왼쪽 바구니를 1번째 바구니, 그 다음 바구니를 2번째 바구니, ..., 가장 오른쪽 바구니를 N번째 바구니라고 부른다.

도현이는 앞으로 M번 바구니의 순서를 역순으로 만들려고 한다.
도현이는 한 번 순서를 역순으로 바꿀 때, 순서를 역순으로 만들 범위를 정하고, 그 범위에 들어있는 바구니의 순서를 역순으로 만든다.

바구니의 순서를 어떻게 바꿀지 주어졌을 때,
M번 바구니의 순서를 역순으로 만든 다음, 바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력하는 프로그램을 작성하시오.

<1> 스캐너 선언 ==> 바구니 갯수 N 과 역순의 범위를 지정하는 M 과 i, j
<2> N개의 배열 생성
<3> 배열의 값 입력. 값은 1번부터 시작해야됨.
<4> 반복할 횟수 M 지정.
<5> i 에서 j 까지 역순. j는 M보다 작아야됨.
<6> 배열 순서대로 출력
 */
public class BJ_10811 {
    public static void main(String[] args) {
        //<1>
        Scanner sc = new Scanner(System.in);

        //<2> N개의 배열 생성
        int N = sc.nextInt();
        int arr[] = new int[N];

        //<3> 배열의 값 입력. 값은 1 부터 시작.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        //<4> 반복할 횟수 M 지정.
        int M = sc.nextInt();

        int change;
        for (int k = 0; k < M; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            for (int w = 0; w < (j - i + 1); w++) {
                change = arr[i - 1];
                arr[i - 1] = arr[j - 1];
                arr[j - 1] = change;
                i++;
                j--;
            }
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}