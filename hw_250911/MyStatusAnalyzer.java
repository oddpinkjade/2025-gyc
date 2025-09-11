package hw_250911;

import java.util.Scanner;

// 과제 8: 카페인 섭취에 따른 내 상태
public class MyStatusAnalyzer {

    private static final int BAD_STATUS_THRESHOLD = 0;
    private static final int NORMAL_STATUS_THRESHOLD = 1;
    private static final int GOOD_STATUS_THRESHOLD = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("오늘 마신 커피 수를 입력하세요: ");
        int input = scanner.nextInt();
        analyzeMyStatus(input);

        scanner.close();
    }

    private static void analyzeMyStatus(int input) {
        /*
        0 잔:  여긴 어디? 😵
        1잔 이상: 완전 맑은 정신~ 🍀
        3잔 이상 : 기분 좋은 상태! 😄
        */
        if (input == BAD_STATUS_THRESHOLD) {
            System.out.println("여긴 어디? \uD83D\uDE35");

        } else if (input >= NORMAL_STATUS_THRESHOLD) {
            System.out.println("완전 맑은 정신~ \uD83C\uDF40");

        } else if (input >= GOOD_STATUS_THRESHOLD) {
            System.out.println("기분 좋은 상태! \uD83D\uDE04");

        }
    }
}
