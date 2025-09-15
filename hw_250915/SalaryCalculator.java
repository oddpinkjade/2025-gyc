package hw_250915;

import java.util.Scanner;

// 7. 시급(money)과 일한 시간(hours)을 받아 "총 급여"를 int로 돌려주는 메서드
public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("시급을 입력하세요: ");
        int money = scanner.nextInt();
        System.out.print("일한 시간을 입력하세요: ");
        int hours = scanner.nextInt();

        int totalSalary = calculateSalary(money, hours);
        System.out.printf("총 급여: %d원", totalSalary);

        scanner.close();
    }

    private static int calculateSalary(int money, int hours) {
        return money * hours;
    }
}
