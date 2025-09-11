package hw_250911;

import java.util.Scanner;

public class PasswordValidator {

    private static final String USER_PASSWORD = "qwer1234";

    public static void main(String[] args) {
        // 과제 1: 비밀번호 맞추기
        String password = "qwer1234";
        validatePassword(password);

        // 과제 2: 1번 문제를 사용자 입력으로 만들기
        Scanner scanner = new Scanner(System.in);
        System.out.print("비밀번호를 입력하세요.>> ");
        String input = scanner.nextLine();
        validatePassword(input);

        scanner.close();
    }

    private static void validatePassword(String password) {
        // 만약 사용자가 입력한 값이 "qwer1234"이면 "비밀번호가 맞아요!"
        if (USER_PASSWORD.equals(password)) {
            System.out.println("비밀번호가 맞아요!");

        } else { // 아니면 "비밀번호가 틀렸어요!"를 출력
            System.out.println("비밀번호가 틀렸어요!");
        }
    }
}
