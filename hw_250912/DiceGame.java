package hw_250912;

import java.util.Random;

// 과제 10: 주사위를 두 번 던졌을 때, 각각의 결과를 출력하고, 두 숫자의 합을 출력
public class DiceGame {

    private static final int DICE_MAX_VALUE = 6;
    private static final Random random = new Random();

    public static void main(String[] args) {
        int dice1 = rollDice();
        int dice2 = rollDice();
        int sum = calculateSum(dice1, dice2);

        System.out.println("첫 번째 주사위: " + dice1);
        System.out.println("두 번째 주사위: " + dice2);
        System.out.println("두 주사위의 합: " + sum);
    }

    private static int rollDice() {
        return random.nextInt(DICE_MAX_VALUE) + 1;
    }

    private static int calculateSum(int number1, int number2) {
        return number1 + number2;
    }
}
