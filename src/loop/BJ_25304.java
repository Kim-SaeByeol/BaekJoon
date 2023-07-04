package loop;
import java.util.Scanner;

public class BJ_25304 {
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X, N;
        X = sc.nextInt();
        N = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += multiply(a, b);

        }

        if (sum == X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");

            sc.close();
        }
    }
}
