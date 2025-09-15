package hw_250915;

import java.util.Random;
import java.util.Scanner;

// 4. 이름 2개(본인, 상대방)를 받아, 0~100 사이의 랜덤 "연애 성공확률"을 돌려주는 메서드
public class LoveProbabilityCalculator {

    private static final int MIN_PROBABILITY = 1;
    private static final int MAX_PROBABILITY = 100;
    private static final Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("본인 이름을 입력하세요: ");
        String myName = scanner.nextLine();

        System.out.print("상대방 이름을 입력하세요: ");
        String partnerName = scanner.nextLine();

        int loveProbability = generateLoveProbability();
        System.out.printf("%s와 %s의 연애 성공 확률은 %d%%입니다.\n", myName, partnerName, loveProbability);

        scanner.close();
    }

    private static int generateLoveProbability() {
        return random.nextInt(MAX_PROBABILITY - MIN_PROBABILITY + 1) + MIN_PROBABILITY;
    }
}
