package hw_250912;

import java.util.Scanner;

// 과제 1: 치킨 주문 알림기
public class ChickenOrderNotifier {

    // 주문 들어온 치킨의 수만큼 “치킨 1마리 주문이요”, “치킨 2마리주문이요”, … “치킨 n마리 주문이요”  출력
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("주문할 치킨 마리 수를 입력하세요: ");
        int orderCount = scanner.nextInt();
        orderChicken(orderCount);

        scanner.close();
    }

    private static void orderChicken(int orderCount) {
        for (int i = 1; i <= orderCount; i++) {
            System.out.printf("치킨 %d 마리 주문이요\n", i);
        }
    }
}
