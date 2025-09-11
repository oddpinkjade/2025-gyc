package hw_250911;

import java.util.Scanner;

public class WeekendChecker {

    public static void main(String[] args) {
        // 과제 5: 주말 맞추기
        int day = 6;
        checkWeekend(day);

        // 과제 6: 5번 문제를 사용자 입력으로 만들기
        Scanner scanner = new Scanner(System.in);
        System.out.print("요일을 0 ~ 6 사이의 정수 값으로 입력하세요. >> ");
        int input = scanner.nextInt();
        checkWeekend(input);

        scanner.close();
    }

    private static void checkWeekend(int day) {

        // 만약 day가 "토요일(6)"이나 "일요일(0)"이면 "주말이야!",
        if (isWeekend(day)) {
            System.out.println("주말이야!");

        } else { // 아니면 "평일이야!"를 출력
            System.out.println("평일이야!");

        }
    }

    private static boolean isWeekend(int day) {
        return day == 6 || day == 0;
    }
}
