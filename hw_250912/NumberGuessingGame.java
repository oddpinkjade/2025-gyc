package hw_250912;

import java.util.Random;
import java.util.Scanner;

// 과제 11: 1~50 중 랜덤 숫자를 하나 만들고,
//         사용자가 숫자를 입력해서 맞출 때까지 "UP" 또는 "DOWN"을 출력
public class NumberGuessingGame {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 50;
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    public static void main(String[] args) {
        int answer = generateRandomNumber();
        guessNumber(answer);

        scanner.close();
    }

    private static int generateRandomNumber() {
        return random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
    }

    private static void guessNumber(int answer) {
        System.out.printf("%d부터 %d 사이의 숫자를 맞춰 보세요.", MIN_NUMBER, MAX_NUMBER);

        while (true) {
            int guess = getUserInput();

            if (guess < answer) {
                System.out.println("UP");
            } else if (guess > answer) {
                System.out.println("DOWN");
            } else {
                System.out.println("정답입니다.");
                break;
            }
        }
    }

    private static int getUserInput() {
        System.out.print("숫자를 입력하세요: ");
        return scanner.nextInt();
    }
}
