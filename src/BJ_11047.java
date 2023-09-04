import java.util.Scanner;

public class BJ_11047 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("화폐 단위의 갯수");
        int N = sc.nextInt();
        System.out.println("최적의 화폐 단위로 분해할 수");
        int K = sc.nextInt();

        int[] coin = new int[N];

        System.out.println("등록할 화폐의 단위를 입력해주세요. ex) 10 50 100 500 1000 10000 ");
        for(int i = 0; i < N; i++) {
            // 각 인덱스는 화폐의 단위가 입력됨.
            coin[i] = sc.nextInt();
        }

        int count = 0;

        for(int i = N - 1; i >= 0; i--) {
            // 현재 동전의 가치가 K보다 작거나 같아야됨
            if(coin[i] <= K) {
                // 현재 가치의 동전으로 구성할 수 있는 개수를 더해준다.
                count += (K / coin[i]);
                K = K % coin[i];
            }
        }
        System.out.println(count);
    }
}
