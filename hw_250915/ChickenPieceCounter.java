package hw_250915;

import java.util.Scanner;

/*
1. 치킨 한 마리에 8조각이 나온다.
    주문 치킨의 마릿수(n)를 입력받아 총 조각 수를 돌려주는 메서드
*/
public class ChickenPieceCounter {

    private static final int PIECES_PER_CHICKEN = 8;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("주문한 치킨의 마릿수를 입력해주세요: ");
        int n = scanner.nextInt();
        int totalPieces = getChickenPiece(n);
        
        System.out.println("총 조각 수: " + totalPieces);
        
        scanner.close();
    }

    private static int getChickenPiece(int chickens) {
        return PIECES_PER_CHICKEN * chickens;
    }
}
