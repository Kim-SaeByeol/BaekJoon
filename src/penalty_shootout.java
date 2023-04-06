import java.util.Scanner;

public class penalty_shootout {
    // 승부차기
    public static void main(String[] args) {
        int Exit = 0;
        int count = 0;
        String MyScore[] = new String[5];
        String ComputerScore[] = new String[5];
        Scanner sc = new Scanner(System.in);
        int a = (int) (Math.random() * 2) + 1;
        while (Exit == 0) {
            //코인 앞면 뒷면을 입력 받음.
            System.out.printf("코인으로 선공을 정해봅시다.\n");
            System.out.printf("앞면이 나오면 선공~ 뒷면이 나오면 후공~\n");
            System.out.printf("코인을 던지시겠습니까? Y/N \n");
            String coin = sc.nextLine();
            if (coin.equals("N")) {
                System.out.printf("나중에 또 오세요~");
                break;
            }

            if (a == 1) {
                System.out.printf("앞면이 나왔네요. 선공이에요!\n");
                Exit = 1;
            } else
                System.out.printf("뒷면이 나왔네요. 후공이에요.\n");
            Exit = 2;
        }
        if (Exit == 1) {
            for (int i = 0; i < 5; i++) {
                System.out.printf("어디로 슛을 찰까요? 숫자를 입력해주세요. : <1> 왼쪽 | <2> 중앙 | <3> 오른쪽\n");
                int b = (int) (Math.random() * 3) + 1;
                int Shooting = sc.nextInt();
                if (Shooting != b) {
                    System.out.printf("Goal!!!!! 축하해요\n");
                    MyScore[i] = "0";
                } else {
                    System.out.printf("으앗! 막아버렸어요.\n");
                    MyScore[i] = "O";
                }
                System.out.printf("내가 찬 위치 : <%d>\n", Shooting);
                System.out.printf("컴퓨터가 막은 위치 <%d>\n", b);

                System.out.printf("컴퓨터가 찰 차례네요! 어디로 막을까요? 숫자를 입력해주세요. : <1>왼쪽 <2>중앙 <3>오른쪽\n");
                int c = (int) (Math.random() * 3) + 1;
                int blocking = sc.nextInt();
                if (blocking != c) {
                    System.out.printf("으앗 못 막았어요 ㅠㅠ..\n");
                    ComputerScore[i] = "O";
                } else {
                    System.out.printf("잘하셨어요!! 막았네요!!\n");
                    ComputerScore[i] = "X";
                }
                System.out.printf("컴퓨터가 찬 위치 <%d>\n", b);
                System.out.printf("내가 막은 위치 <%d>\n", blocking);
            }
        }
        if (Exit == 2) {
            for (int i = 0; i < 5; i++) {
                System.out.printf("컴퓨터가 찰 준비를 하고 있어요! 어디로 막을까요? 숫자를 입력해주세요. : <1>왼쪽 <2>중앙 <3>오른쪽\n");

                int b = (int) (Math.random() * 3) + 1;
                int blocking = sc.nextInt();
                if (blocking != b) {
                    System.out.printf("으앗 못 막았어요 ㅠㅠ..\n");
                    ComputerScore[i] = "O";
                } else {
                    System.out.printf("잘하셨어요!! 막았네요!!\n");
                    ComputerScore[i] = "X";
                }
                System.out.printf("컴퓨터가 찬 위치 <%d>\n", b);
                System.out.printf("내가 막은 위치 <%d>\n", blocking);

                System.out.printf("제 차례네요! 어디로 슛을 찰까요? 숫자를 입력해주세요. : <1> 왼쪽 | <2> 중앙 | <3> 오른쪽\n");
                int c = (int) (Math.random() * 3) + 1;
                int Shooting = sc.nextInt();
                if (Shooting != c) {
                    System.out.printf("Goal!!!!! 축하해요\n");
                    MyScore[i] = "O";
                } else {
                    System.out.printf("으앗! 막아버렸어요.\n");
                    MyScore[i] = "X";
                }
                System.out.printf("내가 찬 위치 : <%d>\n", Shooting);
                System.out.printf("컴퓨터가 막은 위치 <%d>\n", c);
            }
        }
        System.out.printf("전체 스코어를 말씀 드리겠습니다.\n");
        System.out.printf("당신의 점수는!\n");
        for (int i = 0; i < MyScore.length; i++) {
            System.out.printf("%s\t",MyScore[i]);
        }
        System.out.printf("\n");

        System.out.printf("컴퓨터의 점수는!\n");
        for (int i = 0; i< ComputerScore.length; i++){
            System.out.printf("%s\t", ComputerScore[i]);
        }
        System.out.printf("\n");

        int MyCount = 0, ComputerCount = 0;
        for (int i = 0; i < MyScore.length; i++){
            if(MyScore[i].equals("O"))
                MyCount++;
            if (ComputerScore[i].equals("O"))
                ComputerCount++;
        }
        System.out.printf("총 스코어!!\n");
        System.out.printf("당신의 점수는 %d : 컴퓨터의 점수는 %d\n", MyCount, ComputerCount);
        if(MyCount == ComputerCount) {
            System.out.printf("무승부 입니다!");
        }else if (MyCount > ComputerCount) {
            System.out.printf("당신이 이겼습니다! 축하합니다!");
        }else {
            System.out.printf("아쉽게 졌습니다. 다음 기회에는 반드시 이기자구요!");
        }
    }
}

