package hw_250912;

import java.util.Scanner;

// 과제 9: 피자 조각 개수와 사람 수를 입력받아,
//        한 사람당 몇 조각 먹을 수 있는지, 남는 조각은 몇 개인지 출력
public class PizzaDivider {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("피자 조각 수를 입력하세요: ");
        int totalSlices = scanner.nextInt();

        System.out.print("사람 수를 입력하세요: ");
        int people = scanner.nextInt();

        if (isValidPeopleCount(people) && isEnoughSlicesForPeople(totalSlices, people)) {
            dividePizza(totalSlices, people);
        }

        scanner.close();
    }

    private static boolean isValidPeopleCount(int people) {
        if (people <= 0) {
            System.out.println("사람 수는 1명 이상이어야 합니다.");
            return false;
        }
        return true;
    }

    private static boolean isEnoughSlicesForPeople(int totalSlices, int people) {
        if (totalSlices < people) {
            System.out.println("피자 조각 수가 사람 수가 많아야 합니다.");
            return false;
        }
        return true;
    }

    private static void dividePizza(int totalSlices, int people) {
        int slicesPerPerson = totalSlices / people;
        int leftover = totalSlices % people;

        System.out.printf("한 사람당 %d조각씩 먹을 수 있습니다.\n", slicesPerPerson);
        System.out.printf("남는 조각은 %d조각입니다.\n", leftover);
    }
}
