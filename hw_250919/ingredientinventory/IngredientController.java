package hw_250919.ingredientinventory;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class IngredientController {

    private final int MIN_COMMAND_VALUE = 0;
    private final int MAX_COMMAND_VALUE = 2;

    private final Scanner scanner = new Scanner(System.in);
    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
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
                    addIngredient();
                    break;
                case 2:
                    getAllIngredients();
                    break;
                default:
                    System.out.printf("%d~%d 사이의 숫자만 입력하세요.%n", MIN_COMMAND_VALUE, MAX_COMMAND_VALUE);
                    break;
            }
        }
    }

    private void printMenu() {
        System.out.println("\n===== 국제사회교육원 식자재 관리 시스템 =====");
        System.out.println("1. 식자재 등록");
        System.out.println("2. 전체 식자재 조회");
        System.out.println("0. 종료");
    }

    private void addIngredient() {
        String ingredientId = readLine("식자재 번호: ");
        String ingredientName = readLine("식자재명: ");
        int quantity = readInt("수량: ");
        LocalDate createdDate = readDate("등록 날짜 (yyyy-MM-dd): ");

        boolean result = ingredientService.addIngredient(ingredientId, ingredientName, quantity, createdDate);
        if (result) {
            System.out.println("식자재 등록 완료");
        } else {
            System.out.println("이미 등록된 식자재입니다.");
        }
    }

    private void getAllIngredients() {
        List<Ingredient> allIngredients = ingredientService.getAllIngredients();
        if (allIngredients.isEmpty()) {
            System.out.println("등록된 식자재가 없습니다.");
            return;
        }

        System.out.println("\n[전체 식자재 목록]");
        for (Ingredient ingredient : allIngredients) {
            System.out.println(ingredient);
        }
    }

    /* 입력 메서드 */
    private String readLine(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    private int readInt(String prompt) {
        System.out.print(prompt);
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }

    private LocalDate readDate(String prompt) {
        System.out.print(prompt);
        String input = scanner.nextLine();
        return LocalDate.parse(input);
    }
}
