package hw_250912;

import java.util.Scanner;

// 과제 8: 정수를 입력받아, n x n 크기의 네모(정사각형) 별(*)을 출력
public class SquareStarPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요(정사각형 크기): ");
        int size = scanner.nextInt();

        printSquareStar(size);

        scanner.close();
    }

    private static void printSquareStar(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
