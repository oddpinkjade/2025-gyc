package hw_250919.fitnesscenter;

import static hw_250919.InputUtils.readInt;
import static hw_250919.InputUtils.readLine;

import java.util.List;

// TODO: 추후 고려할 점) Controller 인터페이스 생성
public class FitnessMemberController {

    private final int MIN_COMMAND_VALUE = 0;
    private final int MAX_COMMAND_VALUE = 2;

    private final FitnessMemberService fitnessMemberService;

    public FitnessMemberController(FitnessMemberService fitnessMemberService) {
        this.fitnessMemberService = fitnessMemberService;
    }

    public void run() {
        while (true) {
            printMenu();
            int command = readInt("번호 입력: ");

            switch (command) {
                case 0:
                    System.out.println("프로그램 종료");
                    return;
                case 1:
                    addMember();
                    break;
                case 2:
                    getAllMembers();
                    break;
                default:
                    System.out.printf("%d~%d 사이의 숫자만 입력하세요.", MIN_COMMAND_VALUE, MAX_COMMAND_VALUE);
                    break;
            }
        }
    }

    private void printMenu() {
        System.out.println("\n===== 체육센터 건강관리 시스템 =====");
        System.out.println("1. 회원 등록");
        System.out.println("2. 전체 회원 조회");
        System.out.println("0. 종료");
    }

    private void addMember() {
        String name = readLine("회원 이름: ");
        int memberId = readInt("회원 번호: ");
        int baseCalorie = readInt("기준 칼로리: ");
        int consumedCalorie = readInt("소비 칼로리: ");

        boolean result = fitnessMemberService.addFitnessMember(name, memberId, baseCalorie, consumedCalorie);
        if (result) {
            System.out.println("회원 등록 완료");
        } else {
            System.out.println("이미 등록된 회원입니다.");
        }
    }

    private void getAllMembers() {
        List<FitnessMember> allFitnessMembers = fitnessMemberService.getAllFitnessMembers();
        if (allFitnessMembers.isEmpty()) {
            System.out.println("등록된 회원이 없습니다.");
            return;
        }

        System.out.println("\n[전체 회원 목록]");
        for (FitnessMember fitnessMember : allFitnessMembers) {
            System.out.println(fitnessMember);
        }
    }
}
