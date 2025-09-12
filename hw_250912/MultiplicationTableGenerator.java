package hw_250912;

import java.util.Scanner;

// 과제 6: 입력한 수로 구구단 만들기
public class MultiplicationTableGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("출력할 단을 입력하세요: ");
        int base = scanner.nextInt();
        generatorMultiplicationTable(base);

        scanner.close();
    }

    private static void generatorMultiplicationTable(int base) {
        System.out.printf("[%d단]\n", base);
        for (int i = 1; i <= 9; i++) {
            System.out.println(base + " x " + i + " = " + (base * i));
        }
    }
}
