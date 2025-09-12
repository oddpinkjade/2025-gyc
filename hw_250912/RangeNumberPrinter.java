package hw_250912;

import java.util.Scanner;

// 과제 4: 두 수를 입력 받아 그 사이 숫자 모두 출력
public class RangeNumberPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("두 수를 입력해 주세요. 단, 0과 양의 정수만 가능합니다.");
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int number1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int number2 = scanner.nextInt();

        printNumbersRange(number1, number2);

        scanner.close();
    }

    private static void printNumbersRange(int number1, int number2) {
        int start = Math.min(number1, number2);
        int end = Math.max(number1, number2);

        System.out.printf("%d부터 %d까지의 수: ", start, end);
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
