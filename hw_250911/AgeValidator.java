package hw_250911;

import java.util.Scanner;

// 과제 7: 나이 검사기
public class AgeValidator {

    private static final int ADULT_AGE_THRESHOLD = 19;
    private static final int MIN_AGE = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 0 이상의 정수 값으로 입력하세요. >> ");
        int input = scanner.nextInt();
        validateAge(input);

        scanner.close();
    }

    private static void validateAge(int age) {
        // 나이를 입력받고 19세 이상이면 성인입니다. 미만이면 미성년입니다 출력
        if (age >= ADULT_AGE_THRESHOLD) {
            System.out.println("성인입니다.");
        } else if (MIN_AGE <= age && age < ADULT_AGE_THRESHOLD) {
            System.out.println("미성년입니다.");
        } else {
            System.out.println("유효한 값을 입력하세요.");
        }
    }
}
