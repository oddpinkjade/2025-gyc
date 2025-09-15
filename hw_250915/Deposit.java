package hw_250915;

import java.util.Scanner;

// while문과 Scanner를 이용해서
// 키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드 작성
public class Deposit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean run = true;
        int balance = 0;

        while (run) {
            System.out.println("-----------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-----------------------------------");
            System.out.println("선택> ");

            int menu = scanner.nextInt();

            // switch()문을 이용하여
            switch (menu) {
                case 1: // 1번 입력 시, 입금액을 입력하세요 출력 후 입금액 입력 받음
                    System.out.print("입금액을 입력하세요: ");
                    int depositAmount = scanner.nextInt();
                    // 잔액 + 받은 입금액 = 잔고
                    balance += depositAmount;
                    // xx 입금되었습니다 출력
                    System.out.printf("%d원이 입금되었습니다.\n", depositAmount);
                    break;
                case 2:  // 2번 입력 시, 출금액을 입력하세요 출력 후 출금액 입력 받음
                    System.out.println("출금액을 입력하세요: ");
                    int withdrawAmount = scanner.nextInt();
                    if (withdrawAmount > balance) {
                        // 출금액이 잔고보다 크면 잔고보다 커서 출금할 수 없습니다 출력
                        System.out.println("잔고보다 커서 출금할 수 없습니다.");
                    } else {
                        balance -= withdrawAmount;
                        // xxx 출금되었습니다.
                        System.out.printf("%d원이 출금되었습니다.%n", withdrawAmount);
                    }
                case 3: // 3번 입력 시, 잔고: xxx 원
                    System.out.printf("잔고: %d원\n", balance);
                    break;
                case 4: // 4번 입력시
                    run = false;
                    break;
                default: // 그 외 잘못된 입력입니다. 출력
                    System.out.println("잘못된 입력입니다. 1~4 사이의 숫자를 입력해 주세요.");

            }

        }

        System.out.println("프로그램 종료");
        scanner.close();
    }
}

