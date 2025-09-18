package hw_250918.hw_02;

public class Library {

    public static void main(String[] args) {
        System.out.println("===TextBook===");

        TextBook textBook = new TextBook();
        textBook.setTitle("이것이 자바다");
        textBook.setAuthor("신용권");
        textBook.setPrice(10000);
        textBook.setSubject("자바");

        // getter로 출력
        System.out.println("제목: " + textBook.getTitle());
        System.out.println("저자: " + textBook.getAuthor());
        System.out.println("가격: " + textBook.getPrice() + "원");
        System.out.println("과목명: " + textBook.getSubject());
        // 메서드(toString())으로 출력
        System.out.println(textBook);

        System.out.println("\n===Novel===");

        Novel novel = new Novel();
        novel.setTitle("소설책");
        novel.setAuthor("소설작가");
        novel.setPrice(10000);
        novel.setGenre("소설 장르");

        // getter로 출력
        System.out.println("제목: " + novel.getTitle());
        System.out.println("저자: " + novel.getAuthor());
        System.out.println("가격: " + novel.getPrice() + "원");
        System.out.println("장르: " + novel.getGenre());
        // 메서드(toString())으로 출력
        System.out.println(novel);

    }
}
