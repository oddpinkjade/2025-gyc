package hw_250916;

public class Main {

    public static void main(String[] args) {
        // 과제 2
        Pizza pizza = new Pizza("페퍼로니", "L");
        System.out.printf("피자 종류: %s, 사이즈: %s\n", pizza.getType(), pizza.getSize());

        // 과제 3
        Song song = new Song("빌려온 고양이", "아일릿");
        song.play();

        // 과제 4
        InstagramPost post = new InstagramPost("민지", "오늘 날씨 짱");
        System.out.printf("작성자: %s, 내용: %s\n", post.getAuthor(), post.getContent());

        // 과제 5
        DeliveryOrder order = new DeliveryOrder("떡볶이", "기숙사");
        order.deliver();
    }
}
