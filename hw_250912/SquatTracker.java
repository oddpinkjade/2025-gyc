package hw_250912;

import java.util.Scanner;

// 과제 2: 스쿼트 계산기
public class SquatTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("스쿼트 몇 번 할까요?");
        int squatCount = scanner.nextInt();
        trackSquat(squatCount);

        scanner.close();
    }

    private static void trackSquat(int squatCount) {
        for (int i = 1; i <= squatCount; i++) {
            System.out.printf("스쿼트 %d회 완료\n", i);
        }
        System.out.println("오늘 운동 끝");
    }
}
