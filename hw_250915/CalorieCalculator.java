package hw_250915;

import java.util.Scanner;

/*
3. 삼각김밥 한 개의 칼로리가 200kcal
    먹은 개수(n)를 받아 총 칼로리를 돌려주는 메서드
*/
public class CalorieCalculator {

    private static final int CALORIE_PER_GIMBAP = 200;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("먹은 삼각김밥 개수를 입력하세요: ");
        int n = scanner.nextInt();

        int totalCalories = calculateCalories(n);
        System.out.println("총 칼로리: " + totalCalories);

        scanner.close();
    }

    private static int calculateCalories(int count) {
        return CALORIE_PER_GIMBAP * count;
    }
}
