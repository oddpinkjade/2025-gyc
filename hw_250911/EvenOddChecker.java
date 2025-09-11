package hw_250911;

import java.util.Scanner;

// 과제 9: 숫자 입력받아 짝수/홀수 츨력
public class EvenOddChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자(양의 정수)를 입력하세요: ");
        int input = scanner.nextInt();
        checkEvenOrOdd(input);

        scanner.close();
    }

    private static void checkEvenOrOdd(int number) {
        if (isEven(number)) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
