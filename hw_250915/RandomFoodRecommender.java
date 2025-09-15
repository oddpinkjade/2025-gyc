package hw_250915;

import java.util.List;
import java.util.Random;

// 5. 아무 값도 안 받음. "라면", "김밥", "파스타", "샐러드" 등 중 랜덤으로 추천해주는 메서드
public class RandomFoodRecommender {

    //private static final List<String> MENUS = List.of("라면", "김밥", "파스타", "샐러드");
    private static final String[] MENUS = {"라면", "김밥", "파스타", "샐러드"};
    private static final Random random = new Random();

    public static void main(String[] args) {
        System.out.println("메뉴를 추천해 드립니다.");
        String recommendedMenu = recommendFood();
        System.out.printf("오늘의 추천 메뉴: %s", recommendedMenu);
    }

    private static String recommendFood() {
        //int index = random.nextInt(MENUS.size());
        //return MENUS.get(index);
        int index = random.nextInt(MENUS.length);
        return MENUS[index];
    }
}
