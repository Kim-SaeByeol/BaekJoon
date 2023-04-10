import java.util.Scanner;

public class Vending_Machine {
    //2차원 배열을 사용하여 지하철 과자 자판기를 만들어보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //메뉴 종류
        String menu[][] =
                {{"스윙칩", "포테토칩", "도리토스", "허니버터칩", "오감자"},
                        {"바나나킥", "오징어땅콩", "콘칩", "치토스", "양파링"},
                        {"에이스", "화이트하임", "칸쵸", "고래밥", "오레오"},
                        {"홈런볼", "예감", "버터링", "씨리얼", "쿠크다스", "빼빼로", "프링글스"}};
        //가격 종류
        int price[][] =
                {{1500, 2000, 1500, 2000, 1500},
                        {2000, 1200, 2000, 1300, 1500},
                        {1300, 2000, 1000, 1000, 1300},
                        {2000, 1500, 1800, 1200, 1000, 1500, 1800}};
        System.out.println("어서오세요. 주문 하시겠습니까? : Y/N");
        String a = sc.nextLine();

        //Y를 입력하면 다음으로 실행되고, N을 입력하면 빠져나감.
        if (a.equals("Y")) {

            //메뉴를 보여줌
            for (int i = 0; i < menu.length; i++) {
                for (int j = 0; j < menu[i].length; j++) {
                    if (i == 0)
                        System.out.print("<" + (j + 1) + ">" + menu[i][j] + " ");
                    else
                        System.out.print("<" + i + (j + 1) + ">" + menu[i][j] + " ");
                }
                System.out.println();
            }
            //입력 받을 값을 배열에 넣기 위해 10의 자리수 ten 과 1의 자리수 unit을 만듬.
            int ten, unit, price1 = 0;
            System.out.println("원하시는 제품의 번호를 선택해주세요. : 번호만 입력");
            int b = sc.nextInt();

            //입력 받은 수를 번호에 맞게 나눔.
            ten = b / 10;
            //배열은 0 부터 시작이기에 1의 자리수 첫 시작을 0으로 맞춤.
            unit = b % 10 - 1;
            System.out.println("<" + b + ">" + menu[ten][unit] + " 입력하셨습니다. 맞습니까? : Y/N");
            String a1 = sc.next();

            //다시 한번 메뉴 확인. Y 이면 다음 단계 실행. N 이면 빠져나감.
            if (a1.equals("Y")) {
                if (ten >= 1) {
                    price1 = price[ten][unit];
                    System.out.println("가격은 " + price1 + "원 입니다.");
                }
                if (ten == 0) {
                    price1 = price[0][unit];
                    System.out.println("가격" + price1 + "원 입니다.");
                }
                //자판기에 넣을 돈 입력
                System.out.println("얼마를 넣을까요? : 정수입력");
                int a2 = sc.nextInt();
                int price2 = 0, preice3 = 0;
                //부족한 금액을 입력했을 경우의 값.
                preice3 = price1 - a2;
                //만약 가격보다 넣은 돈이 부족한 경우
                if (a2 < price1) {
                    System.out.println("돈이 부족합니다. 더 넣어주세요. : 부족 금액 " + preice3 + "원");
                    price2 = sc.nextInt();
                    if (price2 > (price1 - a2)) {
                        System.out.println("잔돈은 " + (price2 - preice3) + "원 입니다.");
                        System.out.println("요청하신 제품 '" + menu[ten][unit] + "' 나왔습니다.");
                    //기회를 주었음에도 돈이 부족하면 넣은 돈을 돌려주고 if문을 빠져나감.
                    } else {
                        System.out.println("넣으신 돈 " + (a2 + price2) + "원 돌려드리겠습니다.");
                    }
                }
                //상품 가격과 같거나 더 클 경우 잔돈과 제품을 줌.
                if (a2 >= price1) {
                    System.out.println("잔돈은 " + (a2 - price1) + "원 입니다.");
                    System.out.println("요청하신 제품 '" + menu[ten][unit] + "' 나왔습니다.");
                }
            }

        }
        //if 문을 빠져나오거나 모두 실행하면 마주치는 인삿말.
        System.out.println("이용해주셔서 감사합니다.");
    }
}






























