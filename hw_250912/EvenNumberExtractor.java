package hw_250912;

import java.util.Scanner;

// 과제 3: 입력받은 수의 짝수만 출력하는 계산기
public class EvenNumberExtractor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자의 개수를 입력하세요: ");
        int count = scanner.nextInt();
        int[] numbers = new int[count];

        System.out.printf("%d개의 정수를 입력하세요(각 숫자는 공백으로 구분): ", count);
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 버전 1) 입력받은 수까지의 수들 중 짝수만 출력
        extractEvenNumber(count);
        // 버전 2) 여러 수를 배열로 입력받아 그 중 짝수만 출력
        extractEvenNumber(numbers);

        scanner.close();
    }

    // 버전 1) 입력받은 수까지의 수들 중 짝수만 출력
    private static void extractEvenNumber(int maxNumber) {
        for (int i = 1; i <= maxNumber; i++) {
            if (isEven(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // 버전 2) 여러 수를 배열로 입력받아 그 중 짝수만 출력
    private static void extractEvenNumber(int[] numbers) {
        for (int number : numbers) {
            if (isEven(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
