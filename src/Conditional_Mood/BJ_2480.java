package Conditional_Mood;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dice[] = new int[3];

        for (int i = 0; i < dice.length; i++) {
            dice[i] = sc.nextInt();
            if (!(dice[i] > 0 && dice[i] < 7)) {
                i--;
            }
        }

        Arrays.sort(dice);

        int count = 0;
        int num = 0;

        for (int i = 0; i < dice.length - 1; i++) {
            if (dice[i] == dice[i + 1]) {
                count++;
                num = dice[i];
            }
        }

        int reward = 0;
        if (count == 0) {
            reward = dice[2] * 100;
        } else if (count == 1) {
            reward = 1000 + num * 100;
        } else if (count == 2) {
            reward = 10000 + num * 1000;
        }

        System.out.println(reward);
        sc.close();
    }
}
