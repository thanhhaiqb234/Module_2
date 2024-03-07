package ss8.bai_tap;

import java.util.Scanner;

public class TestTennisGame {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập điểm người chơi 1 :");
            int score1 = scanner.nextInt();
            System.out.println("Nhập điểm người chơi 2 :");
            int score2 = scanner.nextInt();
            TennisGame.getScore(score1,score2);
        }
}
