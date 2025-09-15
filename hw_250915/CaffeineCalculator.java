package hw_250915;

import java.util.Scanner;

/*
2. 커피 1잔에 카페인이 80mg이 들어있다.
    하루 마신 커피잔 수를 받아 총 카페인량을 돌려주는 메서드
*/
public class CaffeineCalculator {

    private static final int CAFFEINE_PER_CUP = 80;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("오늘 하루 마신 커피잔 수를 입력하세요: ");
        int dailyCoffeeCount = scanner.nextInt();

        int totalCaffeine = calculateCaffeine(dailyCoffeeCount);
        System.out.println("총 카페인량: " + totalCaffeine);

        scanner.close();
    }

    private static int calculateCaffeine(int dailyCoffeeCount) {
        return CAFFEINE_PER_CUP * dailyCoffeeCount;
    }
}
