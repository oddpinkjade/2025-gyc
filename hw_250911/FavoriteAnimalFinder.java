package hw_250911;

import java.util.Scanner;

public class FavoriteAnimalFinder {

    private static final String DOG = "강아지";
    private static final String CAT = "고양이";

    public static void main(String[] args) {
        // 과제 3: 좋아하는 동물 찾기
        String animal = "강아지";
        findAnimal(animal);

        // 과제 4: 3번 문제를 사용자 입력으로 만들기
        Scanner scanner = new Scanner(System.in);
        System.out.print("좋아하는 동물의 이름을 입력하세요.>> ");
        String input = scanner.nextLine();
        findAnimal(input);

        scanner.close();
    }

    private static void findAnimal(String animal) {
        // animal이 "강아지"면 "멍멍!", "고양이"면 "야옹!", 그 외엔 "무슨 동물이야?"를 출력
        if (DOG.equals(animal)) {
            System.out.println("멍멍!");

        } else if (CAT.equals(animal)) {
            System.out.println("야옹!");

        } else {
            System.out.println("무슨 동물이야?");
        }
    }
}
