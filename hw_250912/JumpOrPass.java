package hw_250912;

import java.util.Scanner;

// 과제 7: 숫자를 입력하면, 3의 배수일 때만 "점프!"를 출력하고, 아니면 "패스" 출력
public class JumpOrPass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int number = scanner.nextInt();
        jumpOrPass(number);

        scanner.close();
    }

    private static void jumpOrPass(int number) {
        if (number % 3 == 0) {
            System.out.println("점프!");
        } else {
            System.out.println("패스");
        }
    }
}
